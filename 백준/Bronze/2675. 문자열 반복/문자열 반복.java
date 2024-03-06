import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for (int i = 0; i < num; i++){
            int num2 = s.nextInt();
            String input = s.nextLine().substring(1);

            for (int j = 0; j < input.length(); j++){
                for (int k = 0; k < num2; k++){
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }
    }
}