import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int factor = 2;

        while (num != 1){
            if (num%factor == 0){
                System.out.println(factor);
                num /= factor;
            }
            else{
                factor++;
            }
        }

        br.close();
    }
}