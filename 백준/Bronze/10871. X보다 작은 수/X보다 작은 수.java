import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++){
            int num3 = scanner.nextInt();
            array[i] = num3;
        }


        int count = 0;
        int[] array2 = new int[num];

        for (int i = 0; i < num; i++){
            if (array[i] < num2){
                array2[count] = array[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++){
            System.out.printf("%d ", array2[i]);
        }
        System.out.println();
    }
}