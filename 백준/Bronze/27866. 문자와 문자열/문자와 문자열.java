import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int index = sc.nextInt();

        System.out.println(name.substring(index-1, index));
    }
}
