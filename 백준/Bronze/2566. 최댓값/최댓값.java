import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int max = 0;
        int[] index = new int[2];

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                int temp = s.nextInt();

                if (temp > max){
                    max = temp;
                    index[0] = i + 1;
                    index[1] = j + 1;
                }
                else if (temp == max){
                    double dValue = (int)(Math.random() * 10) + 1;
                    if (dValue > 5){
                        index[0] = i + 1;
                        index[1] = j + 1;
                    }
                }
            }
        }

        System.out.println(max);
        System.out.println(index[0] + " " + index[1]);
    }
}