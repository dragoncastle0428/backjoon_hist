import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] array = new String[5];

        int max = 0;

        for (int i = 0; i < 5; i++){
            String input = s.nextLine();
            array[i] = input;

            if (max < input.length()){
                max = input.length();
            }
        }

        for (int i = 0; i < max; i++){
            for (int j = 0; j < 5; j++){
                if (array[j].length() > i){
                    System.out.print(array[j].charAt(i));
                }
            }
        }
    }
}