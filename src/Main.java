import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean status = true;
        int operator;
        double num1;
        double num2;
        double result;

        while (status==true) {


            try {
                System.out.println("OPERATOR : ");
                operator = input.nextInt();

                if (operator == 5) {
                    System.out.println("EXITING..");
                    System.exit(0);
                }
                else if (operator <= 0 || operator >= 6) {
                    System.out.println("WRONG INPUT, FILL AGAIN !");
                    continue;
                }

                System.out.println("FIRST NUMBER : ");
                num1 = input.nextDouble();

                System.out.println("SECOND NUMBER : ");
                num2 = input.nextDouble();

            } catch (InputMismatchException e){
                System.out.println("WRONG INPUT, FILL AGAIN !");
                input.nextLine();
                continue;
            }

            if (operator >= 1 && operator <=4) {
                if (operator == 1) {
                    result = num1 + num2;
                    System.out.println("RESULT : " + result);
                }
                if (operator == 2) {
                    result = num1 - num2;
                    System.out.println("RESULT : " + result);
                }
                if (operator == 3) {
                    result = num1 * num2;
                    System.out.println("RESULT : " + result);
                }
                if (operator == 4) {
                    result = num1 / num2;
                    System.out.println("RESULT : " + result);
                }

            }



        }
    }
}