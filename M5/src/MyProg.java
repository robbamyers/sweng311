import java.util.Scanner;

public class MyProg {
    public static void main(String[] args) {
        int numerator, denominator, gcd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        numerator = scanner.nextInt();
        System.out.println("Enter the denominator:");
        denominator = scanner.nextInt();
        // declare/initialize variables for calculating gcd progression
        int remainder, dividend = denominator, modulus = numerator;
        do{
            // calculate if gcd was found
            remainder = dividend % modulus;
            // if gcd was not found, assign the next dividend and modulus
            if(remainder != 0) {
                dividend = modulus;
                modulus = remainder;
            }
            // continue until gcd is found
        }while(remainder != 0);
        // identifies the gcd as the modulus of where the reaminder is 0
        gcd = modulus;
        System.out.println("The greatest common divisor is: " + gcd);
        System.out.println("The original fraction: " + numerator + "/" + denominator);
        System.out.println("The reduced fraction: " + (numerator / gcd) + "/" + (denominator / gcd));

    }
}
