/*
Java SE 8 Math: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
Java SE 8 Scanner: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
 */

import java.util.Scanner;

/**
 * This program receives an employee's information as input, calculates the salary
 * of the employee and displays this information back to the running user.
 * @author Robert Myers
 * @version 1.0
 */
public class MyProgram {
    /**
     * Main class to execute program
     * @param args Command-line arguments
     * @see Accountant#Accountant(String, int, String)
     * @see Accountant#getSalary()
     * @see Accountant#printEmployee()
     */
    public static void main(String[] args) {
        // Instantiates a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Declare variables for name, company and age
        String name, company;
        int age;

        // Prompt the user to enter the employee's name
        System.out.println("What is the employee's name?");
        name = scanner.nextLine();

        // Prompt the user to enter the employee's age
        System.out.println("How old is the employee?");
        age = scanner.nextInt();
        // Omit the newline character from the input stream
        scanner.nextLine();

        // Prompt the user to enter the company name
        System.out.println("What is the name of the company?");
        company = scanner.nextLine();

        // Instantiates a new accountant object via constructor
        Accountant accountant = new Accountant(name, age, company);

        //Prints the formatted salary of the employee
        System.out.printf("%s%8.2f\n", "Salary: $", accountant.getSalary());

        //Prints the name, age and company of the employee formatted
        accountant.printEmployee();
    }
}
