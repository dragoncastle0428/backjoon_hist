import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.printf("Case #%d: %d\n", i, num1+num2);
        }
    }
}