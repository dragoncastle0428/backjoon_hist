import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] array = new int[num1];

        for (int i = 0; i < num1; i++){
            array[i] = i + 1;
        }

        for (int i = 0; i < num2; i++){
            int start = scanner.nextInt()-1;
            int end = scanner.nextInt()-1;

            while (start < end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                start++;
                end--;
            }
        }

        for (int i = 0; i < num1; i++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}