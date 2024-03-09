import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int chNum = 0;


        String[] input = (br.readLine()).split(" ");
        String num1 = input[0];
        int num2 = Integer.parseInt(input[1]);

        for (int i = 0; i < num1.length(); i++){
            if (num1.charAt(i) >= 'A' && num1.charAt(i) <= 'Z'){
                chNum += (int)(Math.pow(num2, num1.length()-i-1)*((int)num1.charAt(i) - 'A' + 10));
            }
            else{
                chNum += (int)(Math.pow(num2, num1.length()-i-1)) * ((int)num1.charAt(i) - '0');
            }
        }

        bw.write(chNum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}