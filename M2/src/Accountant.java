/**
 * A class representing an Accountant at a company
 * @author Robert Myers
 * @version 1.0
 */
public class Accountant {

    /**
     * The accountant's name, company ang age
     */
    private String name, company;
    private int age;

    /**
     * Constructor for the Account class. Initializes
     * the Accountant's name, age and company.
     * @param n The name of the employee
     * @param a The age of the employee
     * @param c The company of the employee
     */
    public Accountant(String n, int a, String c) {
        name = n;
        age = a;
        company = c;
    }

    /**
     * Returns the name of the accountant
     * @return A string value representing the accountant's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the accountant
     * @return An integer value representing the accountant's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the name of the company where the accountant is employed
     * @return A string value representing the accountant's company name
     */
    public String getCompany() {
        return company;
    }

    /**
     * Returns the unformatted salary of the employee based on age
     * @return A double value representing the accountant's salary
     */
    public double getSalary() {
        return 40000 * Math.sqrt( Math.exp( 0.04925 * age + 0.141 ));
    }

    /**
     * Prints the employee's name, age and company formatted
     */
    public void printEmployee() {
        System.out.printf("Name: %s,\tAge: %d,\tCompany Name: %s", name, age, company);
    }
}
