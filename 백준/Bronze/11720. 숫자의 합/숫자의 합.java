import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine();
        String input = s.nextLine();

        int sum = 0;

        for (int i = 0; i < num; i++){
            sum += (int)input.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}