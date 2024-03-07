import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for (int i = 0; i < 2*num-1; i++){
            if (i < num) {
                for (int j = 0; j < num - i - 1; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < 2 * (i + 1) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for (int j = 0; j < i - num + 1; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < 4*num - 2*i - 3; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}