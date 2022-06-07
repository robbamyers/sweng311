import java.util.Scanner;

/**
 * Program that request a fractions from the user
 * and returns the greatest common divisor (GCD) as
 * well as the reduced fraction
 * @author Robert Myers
 * @version 1.0
 */
public class MyProg {
    /**
     * Main function to execute program
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare variables
        int numerator, denominator, gcd;

        // Instantiates a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt and read-in values from user for numerator and denominator
        System.out.println("Enter the numerator:");
        numerator = scanner.nextInt();
        System.out.println("Enter the denominator:");
        denominator = scanner.nextInt();

        /* Declare and initialize variables to perform calculations for GCD.
           Preserves the initial denominator and numerator read-in from the user.
         */
        int remainder, dividend = denominator, modulus = numerator;

        do{
            // Determine the remainder
            remainder = dividend % modulus;

            /* If GCD is not found by signal of the remainder = 0, set
               the next dividend and modulus.
             */
            if(remainder != 0) {
                dividend = modulus;
                modulus = remainder;
            }
        }while(remainder != 0); // Continue iterating until GCD is found

        // Set the GCD to the last modulus where remainder = 0
        gcd = modulus;

        // Display output to user
        System.out.println("The greatest common divisor is: " + gcd);
        System.out.println("The original fraction: " + numerator + "/" + denominator);
        System.out.println("The reduced fraction: " + (numerator / gcd) + "/" + (denominator / gcd));

    }
}
