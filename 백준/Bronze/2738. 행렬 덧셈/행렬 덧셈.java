import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int[][][] array = new int[2][num1][num2];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < num1; j++){
                for (int k = 0; k < num2; k++){
                    array[i][j][k] = s.nextInt();
                }
            }
        }

        for (int i = 0; i < num1; i++){
            for (int j = 0; j < num2; j++){
                System.out.printf("%d ", array[0][i][j] + array[1][i][j]);
            }
            System.out.println();
        }
    }
}