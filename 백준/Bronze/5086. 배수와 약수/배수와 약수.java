import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = 1;
        int num2 = 1;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());

            if (num1 == 0 && num2 == 0){
                break;
            }

            if (num1 < num2){
                if (num2%num1 == 0){
                    System.out.println("factor");
                }
                else{
                    System.out.println("neither");
                }
            }
            else{
                if (num1%num2 == 0){
                    System.out.println("multiple");
                }
                else{
                    System.out.println("neither");
                }
            }
        }
        br.close();
    }
}