import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        String[] array = input.split(" ");
        int length = array.length;
        if (length != 0) {
            if (array[0].equals("")) {
                length--;
            }
            System.out.println(length);
        }
        else{
            System.out.println(0);
        }
    }
}