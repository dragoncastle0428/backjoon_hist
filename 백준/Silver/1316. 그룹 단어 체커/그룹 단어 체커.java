import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine();

        int cnt = 0;

        for (int i = 0; i < num; i++){
            String str = s.nextLine();
            boolean check = true;

            for (int j = 0; j < str.length(); j++){
                String checkS = str.substring(j, j + 1);
                String temp = str.substring(j + 1);

                while(check){
                    if (temp.contains(checkS)){
                        if (temp.indexOf(checkS) == 0){
                            temp = temp.substring(1);
                        }
                        else{
                            check = false;
                        }
                    }
                    else{
                        break;
                    }
                }

                if (!check){
                    break;
                }
            }

            if (check){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}