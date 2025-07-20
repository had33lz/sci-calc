
import java.util.*;
import java.lang.*;


public class scicalc {

    public static void main(String[] args) {

    Scanner wewe = new Scanner(System.in);



    while (true){
        displayMenu();
        System.out.println("pick your choice :) ");


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

            //

            break;

            case 2:

            //

            break;

            case 0:

            //


            System.out.println("Goodbye the sci calc was here :> !");
            wewe.close();
            return; // exits main
            default:
                System.out.println("Invalid choice. Try again.");

        }
    }






    }



}
