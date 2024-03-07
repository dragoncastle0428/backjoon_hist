import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        while(true) {
            if (str.contains("c=")) {
                str = str.replace("c=", "k");
            }
            else if (str.contains("c-")){
                str = str.replace("c-", "k");
            }
            else if (str.contains("dz=")){
                str = str.replace("dz=", "k");
            }
            else if (str.contains("d-")){
                str = str.replace("d-", "k");
            }
            else if (str.contains("lj")){
                str = str.replace("lj", "k");
            }
            else if (str.contains("nj")){
                str = str.replace("nj", "k");
            }
            else if (str.contains("s=")){
                str = str.replace("s=", "k");
            }
            else if (str.contains("z=")){
                str = str.replace("z=", "k");
            }
            else{
                break;
            }
        }

        System.out.println(str.length());
    }
}