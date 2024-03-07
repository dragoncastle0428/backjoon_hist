import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        str = str.toUpperCase();

        int[] array = new int[26];

        for (int i = 0; i < str.length(); i++){
            int index = (int)str.charAt(i) - 'A';
            array[index]++;
        }

        int maxI = 0;
        boolean same = false;

        for (int i = 1; i < 26; i++){
            if (array[maxI] == array[i]){
                same = true;
            }
            else if (array[maxI] < array[i]){
                maxI = i;
                same = false;
            }
        }

        if (same){
            System.out.println("?");
        }
        else{
            System.out.println((char)(maxI+'A'));
        }
    }

}