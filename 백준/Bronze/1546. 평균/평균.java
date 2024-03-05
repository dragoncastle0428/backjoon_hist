import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int max = 0;
        int sum = 0;

        for (int i = 0; i < num; i++){
            int num2 = scanner.nextInt();
            sum += num2;

            if (max < num2){
                max = num2;
            }
        }

        double result = (((double)sum / max) * 100) / num;

        System.out.println(result);
    }
}