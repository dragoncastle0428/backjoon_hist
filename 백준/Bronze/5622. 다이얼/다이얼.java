import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++){
            char ct = input.charAt(i);

            if (ct >= 'W'){
                sum += 10;
            } else if (ct >= 'T') {
                sum += 9;
            } else if (ct >= 'P'){
                sum += 8;
            } else if (ct >= 'M'){
                sum += 7;
            } else if (ct >= 'J'){
                sum += 6;
            } else if (ct >= 'G'){
                sum += 5;
            } else if (ct >= 'D'){
                sum += 4;
            } else{
                sum += 3;
            }
        }

        System.out.println(sum);
    }
}