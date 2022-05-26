/**
 * A class representing a linear equation (line)
 * @author Robert Myers
 * @version 1.0
 */
public class LinearEquation {

    /**
     * The linear equation slope and y-intercept
     */
    private double m, b;

    /**
     * Constructor the Linear Equation class. Initializes
     * the slope and the y-intercept
     * @param m The slope of the linear equation
     * @param b The y-intercept of the linear equation
     */
    public LinearEquation( double m, double b) {
        this.m = m;
        this.b = b;
    }

    /**
     * Returns the slope of the linear equation
     * @return A double value representing the slope of the linear equation
     */
    public double getM(){
        return m;
    }

    /**
     * Returns the y-intercept of the linear equation
     * @return A double value representing the y-intercept of the linear equation
     */
    public double getB(){
        return b;
    }

    /**
     * Prints either that the lines do not intersect or the intersection point.
     * @param linearEquation The LinearEquation used to compare to this in order to
     *                       determine the intersection.
     */
    public void computeIntercept( LinearEquation linearEquation){

        // Variables to hold the intersection points
        double x, y;

        // Check if lines have the same slop
        if(this.m - linearEquation.getM() == 0){
            System.out.println("Lines do not intersect");
        }
        else{
            // Calculate the x portion of the intersection
            x = (linearEquation.getB() - this.b) / (this.m - linearEquation.getM());
            // Calculate the y portion of the intersection using the x value
            y = (this.m * x) + this.b;
            // Print to 3 decimal place precision
            System.out.printf("These lines intersect at (%.3f, %.3f)",x,y);
        }
    }
}
