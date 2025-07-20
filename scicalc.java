import java.util.*;
import java.lang.*;

public class scicalc {

    public static void main(String[] args) {

        Scanner wewe = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Pick your choice :) ");

            int choice;
            try {
                choice = wewe.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                wewe.next(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    addition(wewe);
                    break;

                case 2:
                    subtraction(wewe);
                    break;

                case 3:
                    Multiplication(wewe);
                    break;

                case 4:
                    division(wewe);
                    break;

                case 0:
                    System.out.println("\nGoodbye. The Sci Calc was here :> !");
                    wewe.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n===== SCI CALC MENU =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        System.out.println("=============================");

    }

    public static void addition(Scanner in) {
        System.out.println("Enter first number: ");
        double n1 = in.nextDouble();
        System.out.println("Enter second number: ");
        double n2 = in.nextDouble();
        double result = n1 + n2;
        System.out.println("Result: " + result);
    }


    public static void subtraction(Scanner input) {
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);

    }

    public static void Multiplication(Scanner input){
        System.out.println("enter first number ");
        double n1 = input.nextDouble();
        System.out.println("enter second number");
        double n2 = input.nextDouble();
        double result = n1 * n2 ;
        System.out.println("Result: "+ result );

    }

    public static void division(Scanner in){
        System.out.println("enter first number ");
        double n1 = in.nextDouble();
        System.out.println("enter second number");
        double n2 = in.nextDouble();
        double result = n1 / n2 ;

        if (n2==0){   // has to be checked first so we have a result if n2 is 0 :)

            System.out.println("can't divide by 0 dear try again :) <3 ");
            return;

        }
        System.out.println("Result: "+ result );
    }




}
