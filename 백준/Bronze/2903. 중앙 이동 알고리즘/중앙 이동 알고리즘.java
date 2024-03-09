import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int len = 3;

        for (int i = 1; i < num; i++){
            len = len*2 -1;
        }

        System.out.println((int)Math.pow(len, 2));

        br.close();
    }
}