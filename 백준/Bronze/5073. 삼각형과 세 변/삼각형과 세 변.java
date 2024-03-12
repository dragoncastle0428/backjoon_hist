import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            ArrayList<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));

            if (Collections.frequency(list, 0) == 3){
                break;
            }

            int max = Collections.max(list);
            int sum = list.stream().mapToInt(Integer::intValue).sum();

            if (sum - max <= max) {
                System.out.println("Invalid");
            } else {
                boolean check = true;
                for (int i = 0; i < 3; i++) {
                    if (Collections.frequency(list, list.get(i)) == 3) {
                        System.out.println("Equilateral");
                        check = false;
                        break;
                    } else if (Collections.frequency(list, list.get(i)) == 2) {
                        System.out.println("Isosceles");
                        check = false;
                        break;
                    }

                }

                if (check) {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
