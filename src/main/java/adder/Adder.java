package adder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Adder {

    public Adder()  //constructor
    {

    }

    public static void main(String args[])
    {
        Adder Adder = new Adder(); //object of class adder
        Scanner scanner = new Scanner(System.in);
        double dnum1, dnum2;
        System.out.println("Press 'Enter' key to start the application");
        scanner.nextLine();
        do
        {
            System.out.println("Adder application - choose your choice");
            System.out.print("Enter 1 to continue using the adder\n" + "Enter any other input to exit\n" + "Enter your choice:" );
            int choice;
            try
            {
                choice = scanner.nextInt();
            }
            catch(InputMismatchException error)
            {
                System.out.println("Exiting...");
                scanner.close();
                return;
            }
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the first number: ");
                    dnum1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter the second number: ");
                    dnum2 = scanner.nextDouble();
                    System.out.println("The sum of two numbers is: " + Adder.add(dnum1 , dnum2));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }while(true);
    }
    public double add(double dnum1 , double dnum2)
    {
        double result;
        result = dnum1 + dnum2 ;
        return result;
    }
}
