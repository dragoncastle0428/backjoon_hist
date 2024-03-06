import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine();

        for (int i = 0; i < num; i++){
            String input = s.nextLine();

            System.out.printf("%s%s\n", input.substring(0, 1), input.substring(input.length()-1));
        }
    }
}