import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int maxI = 1;

        for (int i = 0; i < 8; i++){
            int num2 = scanner.nextInt();
            if (num2 > max){
                max = num2;
                maxI = i + 2;
            }
        }

        System.out.println(max);
        System.out.println(maxI);
    }
}