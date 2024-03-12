import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));

        int max = Collections.max(list);
        int sum = list.stream().mapToInt(Integer::intValue).sum();

        if (max >= sum-max){
            sum = (sum-max)*2 -1;
        }

        System.out.println(sum);
    }
}
