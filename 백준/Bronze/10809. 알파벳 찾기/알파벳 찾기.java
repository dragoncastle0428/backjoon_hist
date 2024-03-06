import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        for (int i = 0; i < 26; i++){
            int index = input.indexOf('a'+i);
            
            System.out.printf("%d ", index);
        }
        System.out.println();
    }
}