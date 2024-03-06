import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        String[] array = input.split(" ");

        int num = (((int)array[0].charAt(2) - '0') * 100) + (((int)array[0].charAt(1) - '0') * 10) + (int)array[0].charAt(0) - '0';
        int num2 = (((int)array[1].charAt(2) - '0') * 100) + (((int)array[1].charAt(1) - '0') * 10) + (int)array[1].charAt(0) - '0';

        if (num < num2){
            System.out.println(num2);
        }
        else{
            System.out.println(num);
        }
    }
}