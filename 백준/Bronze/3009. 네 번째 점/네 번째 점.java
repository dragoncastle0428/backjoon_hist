import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] corX = new int[3];
        int[] corY = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            corX[i] = Integer.parseInt(st.nextToken());
            corY[i] = Integer.parseInt(st.nextToken());
        }

        if (corX[0] == corX[1]){
            System.out.print(corX[2] + " ");
        }
        else if (corX[0] == corX[2]){
            System.out.print(corX[1] + " ");
        }
        else{
            System.out.print(corX[0] + " ");
        }

        if (corY[0] == corY[1]){
            System.out.print(corY[2] + " ");
        }
        else if (corY[0] == corY[2]){
            System.out.print(corY[1] + " ");
        }
        else{
            System.out.print(corY[0] + " ");
        }
    }
}
