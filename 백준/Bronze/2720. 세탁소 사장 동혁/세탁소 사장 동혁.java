import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++){
            int input = Integer.parseInt(br.readLine());

            int qt = input/25;
            input %= 25;

            int dim = input/10;
            input %= 10;

            int nic = input/5;
            input %= 5;

            System.out.printf("%d %d %d %d\n", qt, dim, nic, input);
        }

        br.close();
    }
}