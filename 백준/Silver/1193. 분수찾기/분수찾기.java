import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int dir = 1;
        int sub = 1;

        while (true){
            if (num > sub){
                num -= sub;
                sub++;
                dir *= -1;
            }
            else{
                int num1 = sub - num + 1;

                if (dir == 1){
                    System.out.printf("%d/%d\n", num1, num);
                }
                else{
                    System.out.printf("%d/%d\n", num, num1);
                }
                break;

            }
        }
        
        br.close();
    }
}