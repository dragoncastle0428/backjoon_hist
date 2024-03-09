import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int move = Integer.parseInt(st.nextToken());
        int back = Integer.parseInt(st.nextToken());
        int totalD = Integer.parseInt(st.nextToken());

        totalD -= move;

        int date = (int)Math.ceil((double)totalD/(move-back)) + 1;

        System.out.println(date);
        br.close();
    }
}