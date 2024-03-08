import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int[][] back = new int[100][100];
        int sum = 0;

        for (int i = 0; i < num; i++){
            String[] input = (br.readLine()).split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            for (int j = num1; j < num1 + 10; j++){
                for (int k = num2; k < num2 + 10; k++){
                    if (back[j][k] != 1) {
                        back[j][k] = 1;
                        sum++;
                    }
                }
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}