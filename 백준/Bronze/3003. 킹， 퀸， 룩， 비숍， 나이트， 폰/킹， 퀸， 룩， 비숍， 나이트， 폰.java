import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] array = new int[]{1, 1, 2, 2, 2, 8};


        for (int i = 0; i < 6; i++){
            array[i] -= s.nextInt();

            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}