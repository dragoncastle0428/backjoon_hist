import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        StringBuffer sb = new StringBuffer(str);
        if(str.equals(sb.reverse().toString())) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }

}