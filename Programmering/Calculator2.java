import java.util.Scanner;


public class Calculator2 {
    public static void main(String[] args) {
        double Answer;
        String op;
        double num1;
        double num2;
        String again;
        boolean yesorno = true;

        Scanner input = new Scanner(System.in);

        
        while (yesorno) {
            System.out.print("What opperation would you like to preform? +,-,*,/, :");
            op = input.nextLine();
            System.out.print("What is the first number? : ");
            num1 = input.nextDouble();
            System.out.print("And the seccond number? : ");
            num2 = input.nextDouble();
            if (op.equals ("+")) {
                Answer = (num1 + num2);
                System.out.println(Answer);

            } else if (op.equals("-")) {
                Answer = num1 - num2;
                System.out.println(Answer);

            } else if (op.equals("*")) {
                Answer = num1 * num2;
                System.out.println(Answer);

            } else if (op.equals("/")) {
                Answer = num1 / num2;
                System.out.println(Answer);

            }
            System.out.println("Would you like to do any more math?");
            again = input.nextLine();
            again = input.nextLine();
            if (again.equals("yes")) {
                yesorno = true;
            } else if (again.equals("no")) {
                yesorno = false;
                System.out.print("have a good day!");
            }
        }
    }
}