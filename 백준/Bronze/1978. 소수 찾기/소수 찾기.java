import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < num; i++){
            int input = Integer.parseInt(st.nextToken());

            if (input != 1) {
                int factor = 1;
                count++;
                while(factor < input-1){
                    factor++;
                    if (input%factor == 0){
                        count--;
                        break;
                    }
                }
            }

        }

        System.out.println(count);

        br.close();
    }
}