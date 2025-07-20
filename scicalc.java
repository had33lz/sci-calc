import java.util.*;
import java.lang.*;

public class scicalc {
    static boolean inRadians = true;  // default mode
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

                case 5:
                    power(wewe);
                    break;

                case 6:
                    sqroot(wewe);
                    break;

                case 7:
                    sin(wewe);
                    break;

                case 8:
                    cos(wewe);
                    break;

                case 9:
                    tan(wewe);
                    break;

                case 10:
                    inRadians = !inRadians;
                    System.out.println("Mode switched to " + (inRadians ? "Radians" : "Degrees") + "!");
                    break;

                case 11:
                    ln(wewe);
                    break;

                case 12:
                    lagb(wewe);
                    break;

                case 13:
                    absv(wewe);
                    break;

                case 14:
                    rtnl(wewe);
                    break;

                case 15:
                    //

                    break;

                case 16:
                    //

                    break;

                case 17:
                    //

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
        System.out.println("5. power");
        System.out.println("6. square root");
        System.out.println("7. Sin");
        System.out.println("8. Cos");
        System.out.println("9. Tan");
        System.out.println("10. Toggle Radians/Degrees");
        System.out.println("=== ADVANCED FUNCTIONS ===");
        System.out.println("Natural Logarithm (ln x)");
        System.out.println("11. Logarithm Base 10 (log₁₀ x)");
        System.out.println("12. Absolute Value |x|");
        System.out.println("13. Round to Nearest Long ");
        System.out.println("14. Ceiling (Round Up)");
        System.out.println("15. Floor (Round Down)");
        System.out.println("16. Minimum of Two Numbers");
        System.out.println("17. Maximum of Two Numbers");
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



    public static void power(Scanner input) {
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = input.nextDouble();
        System.out.println("Result: " + Math.pow(base, exponent));
    }

    public static void sqroot(Scanner input) {
        System.out.print("Enter a number: ");
        double n = input.nextDouble();

        if (n < 0) {
            System.out.println("Error: Square root of negative number is imaginary :( ");
            return;
        }
        System.out.println("Result: " + Math.sqrt(n));
    }
    public static double convertToRadians(double angle) {
        return inRadians ? angle : Math.toRadians(angle);
    }
    public static void sin(Scanner input) {
        System.out.print("Enter angle: ");
        double angle = input.nextDouble();
        double radians = convertToRadians(angle);
        System.out.println("sin(" + angle + ") = " + Math.sin(radians));
    }

    public static void cos(Scanner input) {
        System.out.print("Enter angle: ");
        double angle = input.nextDouble();
        double radians = convertToRadians(angle);
        System.out.println("cos(" + angle + ") = " + Math.cos(radians));
    }

    public static void tan(Scanner input) {
        System.out.print("Enter angle: ");
        double angle = input.nextDouble();
        double radians = convertToRadians(angle);
        System.out.println("tan(" + angle + ") = " + Math.tan(radians));
    }


    public static void ln(Scanner input) {
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        if (num <= 0) {
            System.out.println("Natural log undefined for zero or negative values.");
        }
        double result = Math.log(num);
        System.out.println(" ln(" + num + ") = " + result);
    }

    public static double lagb(Scanner input) {
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        if (num <= 0) {
            System.out.println("Log base 10 undefined for zero or negative values.");
            return;
        }
        double result = Math.log10(num);
        System.out.println(" log10(" + num + ") = " + result);
    }

    public static void absv(Scanner input) {
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        double result = Math.abs(num);
        System.out.println(" |" + num + "| = " + result);
    }

    public static void rtnl(Scanner input) {
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        long result = Math.round(num);
        System.out.println(" Rounded value of " + num + " = " + result);
    }


    }

}
