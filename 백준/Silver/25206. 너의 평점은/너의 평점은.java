import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double sumC = 0;
        double sumA = 0;

        for (int i = 0; i < 20; i++){
            String input = s.nextLine();
            String[] inputA = input.split(" ");

            double credit = Double.parseDouble(inputA[1]);
            String score = inputA[2];

            if (!score.equals("P")) {
                sumC += credit;
            }

            if (score.equals("A+")){
                sumA += 4.5*credit;
            }
            else if (score.equals("A0")){
                sumA += 4.0*credit;
            }
            else if (score.equals("B+")){
                sumA += 3.5*credit;
            }
            else if (score.equals("B0")){
                sumA += 3.0*credit;
            }
            else if (score.equals("C+")){
                sumA += 2.5*credit;
            }
            else if (score.equals("C0")){
                sumA += 2.0*credit;
            }
            else if (score.equals("D+")){
                sumA += 1.5*credit;
            }
            else if (score.equals("D0")){
                sumA += credit;
            }
        }

        System.out.println(sumA/sumC);
    }
}