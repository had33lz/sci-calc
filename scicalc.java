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
                    //Subtraction
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













}
