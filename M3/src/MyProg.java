/*
Java SE 8 Scanner: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
 */

import java.util.Scanner;

/**
 * This program receives two equations (in y=mx+b form)
 * from the user and returns whether the two lines intersect.
 * If the lines intersect, the coordinates for the
 * intersection point is displayed as well.
 * @author Robert Myers
 * @version 1.0
 */
public class MyProg {
    /**
     * Main class to execute program
     * @param args Command-line arguments
     * @see LinearEquation#LinearEquation(double, double)
     * @see LinearEquation#computeIntercept(LinearEquation)
     */
    public static void main(String[] args) {

        // Variable declaration
        double m1, b1, m2, b2;

        // Prompt user & read in values
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the m-value of line 1: ");
        m1 = scnr.nextDouble();
        System.out.println("Please enter the b-value of line 1: ");
        b1 = scnr.nextDouble();
        System.out.println("Please enter the m-value of line 2: ");
        m2 = scnr.nextDouble();
        System.out.println("Please enter the b-value of line 2: ");
        b2 = scnr.nextDouble();

        // Instantiate Objects
        LinearEquation line1 = new LinearEquation(m1, b1);
        LinearEquation line2 = new LinearEquation(m2, b2);

        // Display results
        line1.computeIntercept(line2);

    }
}
