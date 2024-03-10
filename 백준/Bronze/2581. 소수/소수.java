import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int min = -1;
        int sum = 0;

        if (num1 == 1){
            num1++;
        }
        
        for (int i = num1; i <= num2; i++){
            int factor = 1;
            boolean check = true;

            while (factor < i-1){
                factor++;

                if (i%factor == 0){
                    check = false;
                    break;
                }
            }

            if (check){
                if (min == -1){
                    min = i;
                }
                sum += i;
            }
        }

        if (min == -1){
            System.out.println(min);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }

        br.close();
    }
}