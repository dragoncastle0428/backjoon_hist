import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        boolean check = true;
        int factor = 0;
        int count = 0;

        while(check && factor <= num1){
            factor++;

            if (num1%factor == 0){
                count++;
                if (count == num2){
                    check = false;
                }
            }
        }

        if (check){
            System.out.println(0);
        }
        else{
            System.out.println(factor);
        }

        br.close();
    }
}