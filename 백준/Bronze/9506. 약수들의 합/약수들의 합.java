import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int num = Integer.parseInt(br.readLine());

            if (num == -1){
                break;
            }

            ArrayList<Integer> list = new ArrayList<>();

            int factor = 0;
            int sum = 0;

            while(factor < num-1){
                factor++;
                if (num%factor == 0){
                    list.add(factor);
                    sum += factor;
                }
            }

            if (sum == num){
                System.out.print(num + " = ");

                for (int i = 0; i < list.size() - 1; i++){
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size()-1));
            }
            else{
                System.out.println(num + " is NOT perfect.");
            }
        }

        br.close();
    }
}