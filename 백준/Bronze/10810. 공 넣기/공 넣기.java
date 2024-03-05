import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num2; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int num3 = scanner.nextInt();

            for (int j = start-1; j < end; j++){
                array[j] = num3;
            }
        }

        for (int i = 0; i < num; i++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}