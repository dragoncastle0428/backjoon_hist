import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num; i++){
            array[i] = i + 1;
        }

        for (int i = 0; i < num2; i++){
            int num3 = scanner.nextInt()-1;
            int num4 = scanner.nextInt()-1;

            int temp = array[num3];
            array[num3] = array[num4];
            array[num4] = temp;
        }

        for (int i = 0; i < num; i++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}