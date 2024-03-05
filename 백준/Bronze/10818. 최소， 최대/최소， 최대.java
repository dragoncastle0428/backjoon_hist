import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < num; i++){
            int num2 = scanner.nextInt();
            if (num2 < min){
                min = num2;
            }

            if (num2 > max){
                max = num2;
            }
        }

        System.out.printf("%d %d\n", min, max);
    }
}