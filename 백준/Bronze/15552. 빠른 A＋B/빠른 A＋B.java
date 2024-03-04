import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine()); //Int

        for (int i = 0; i < num; i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
            int a = Integer.parseInt(st.nextToken()); //첫번째 호출
            int b = Integer.parseInt(st.nextToken()); //두번째 호출
            bw.write((a + b) + "\n");
        }
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();
    }
}