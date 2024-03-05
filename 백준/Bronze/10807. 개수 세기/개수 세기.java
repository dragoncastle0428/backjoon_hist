import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++){
            int num2 = scanner.nextInt();
            array[i] = num2;
        }

        int num3 = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < num; i++){
            if (array[i] == num3){
                count++;
            }
        }

        System.out.println(count);
    }
}