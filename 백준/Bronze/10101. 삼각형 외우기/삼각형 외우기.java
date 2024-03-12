import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));
        
        int sum = list.stream().mapToInt(Integer::intValue).sum(); //Collection 원소들의 합

        if (sum != 180){
            System.out.println("Error");
        }
        else{
            boolean check = true;
            for (int i = 0; i < 3; i++){
                if (Collections.frequency(list, list.get(i)) == 3){
                    System.out.println("Equilateral");
                    check = false;
                    break;
                }
                else if (Collections.frequency(list, list.get(i)) == 2){
                    System.out.println("Isosceles");
                    check = false;
                    break;
                }
            }

            if (check){
                System.out.println("Scalene");
            }
        }
    }
}
