import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int maxX = -10000;
        int minX = 10000;
        int maxY = -10000;
        int minY = 10000;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int tempX = Integer.parseInt(st.nextToken());
            int tempY = Integer.parseInt(st.nextToken());

            if (maxX < tempX){
                maxX = tempX;
            }
            if (minX > tempX){
                minX = tempX;
            }

            if (maxY < tempY){
                maxY = tempY;
            }

            if (minY > tempY){
                minY = tempY;
            }
        }

        int x = maxX - minX;
        int y = maxY - minY;

        System.out.println(x*y);
    }
}
