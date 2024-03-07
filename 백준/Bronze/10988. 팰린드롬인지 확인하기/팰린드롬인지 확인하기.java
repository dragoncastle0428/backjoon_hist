import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String comp = input;

        for (int i = 0; i < input.length()/2; i++){
            if (i > 0){
                String temp1 = comp.substring(0, i);
                String temp2 = comp.substring(i, i+1);
                String temp3 = comp.substring(input.length()-i);
                String temp4 = comp.substring(input.length()-i-1, input.length()-i);
                String temp5 = comp.substring(i+1, input.length()-i-1);

                comp = (((temp1.concat(temp4)).concat(temp5)).concat(temp2)).concat(temp3);

            }
            else{
                String temp1 = comp.substring(0, 1);
                String temp2 = comp.substring(input.length()-1);
                String temp3 = comp.substring(1, input.length()-1);

                comp = (temp2.concat(temp3)).concat(temp1);
            }
        }

        if (input.equals(comp)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}