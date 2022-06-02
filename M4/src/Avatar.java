import javafx.scene.paint.Color;
import wheelsFX.users.Frame.Frame;
import wheelsFX.users.Shapes.Ellipse;
import wheelsFX.users.Shapes.Rectangle;
import wheelsFX.users.Shapes.RoundedRectangle;

/**
 * Creates an avatar on the screen using WheelsFX Shapes
 * @author Robert Myers
 * @version 1.0
 */
public class Avatar {

    // Variables to hold the avatar's current position on the screen
    private int avatarLocX = 0;
    private int avatarLocY = 0;

    // Constants defining the size of each part of the avatar
    final int HEAD_WIDTH = 50, HEAD_HEIGHT = 50,
            ARM_WIDTH = 75, ARM_HEIGHT = 25,
            LEG_WIDTH = 25, LEG_HEIGHT = 100,
            BODY_WIDTH = 100, BODY_HEIGHT = 150;

    /* Constants defining the RGB values for the shapes
       that comprise an avatar
     */
    final Color YELLOW = Color.rgb(255, 205, 0),
                BLUE = Color.rgb(0, 48, 135),
                RED = Color.rgb(200, 16, 46);

    // Constants defining the spacing between shapes to compose an avatar
    final int R_ARM_SPACING_X = 45, R_ARM_SPACING_Y = 55,
              L_ARM_SPACING_X = -120, L_ARM_SPACING_Y = 55,
              L_LEG_SPACING_X = -45, L_LEG_SPACING_Y = 195,
              R_LEG_SPACING_X = 20, R_LEG_SPACING_Y = 195,
              BODY_SPACING_X = -50, BODY_SPACING_Y = 50;

    // Fields to define shapes that will compose an avatar
    private Ellipse head;
    private RoundedRectangle body;
    private Rectangle leftArm;
    private Rectangle rightArm;
    private Rectangle leftLeg;
    private Rectangle rightLeg;

    /**
     * Default constructor that creates an avatar and sets the position to (0, 0)
     */
    public Avatar(){
        makeAvatar( 0, 0 );
        avatarLocX = 0;
        avatarLocY = 0;
    }

    /**
     * Constructor that creates an avatar and sets the position to (x, y)
     * @param x Defines the x value where the head of the avatar should be positioned
     * @param y Defines the y value where the head of the avatar should be positioned
     */
    public Avatar(int x, int y){
        makeAvatar(x,y);
        avatarLocX = x;
        avatarLocY = y;
    }

    /**
     * Sets the location of an avatar to a position (x, y)
     * @param x Defines the x value where the head of the avatar should be positioned
     * @param y Defines the y value where the head of the avatar should be positioned
     */
    public void setLocation(int x, int y){
        head.setLocation(x,y);
        rightArm.setLocation(x + R_ARM_SPACING_X, y + R_ARM_SPACING_Y);
        leftArm.setLocation(x + L_ARM_SPACING_X, y + L_ARM_SPACING_Y);
        rightLeg.setLocation(x + R_LEG_SPACING_X,y + R_LEG_SPACING_Y);
        leftLeg.setLocation(x + L_LEG_SPACING_X, y + L_LEG_SPACING_Y);
        body.setLocation(x + BODY_SPACING_X, y + BODY_SPACING_Y);
        avatarLocX = x;
        avatarLocY = y;
    }

    /**
     * Shifts the avatar downward (or upward if passing a negative value) by a factor of dy
     * @param dy Defines the shift upward or downward (if negative or positive respectively)
     */
    public void moveDown(int dy){
        head.setLocation(this.avatarLocX, this.avatarLocY + dy);
        rightArm.setLocation(this.avatarLocX + R_ARM_SPACING_X, this.avatarLocY + R_ARM_SPACING_Y + dy);
        leftArm.setLocation(this.avatarLocX + L_ARM_SPACING_X, this.avatarLocY + L_ARM_SPACING_Y + dy);
        rightLeg.setLocation(this.avatarLocX + R_LEG_SPACING_X, this.avatarLocY + R_LEG_SPACING_Y + dy);
        leftLeg.setLocation(this.avatarLocX + L_LEG_SPACING_X, this.avatarLocY + L_LEG_SPACING_Y + dy);
        body.setLocation(this.avatarLocX + BODY_SPACING_X, this.avatarLocY + BODY_SPACING_Y + dy);
        avatarLocY += dy;
    }

    /**
     * Creates an avatar at position (x, y)
     * @param x Defines the x-coordinate where the avatar should be placed
     * @param y Defines the y-coordinate where the avatar should be placed
     */
    private void makeAvatar(int x, int y) {
        head = new Ellipse(x, y);
        head.setSize(HEAD_WIDTH, HEAD_HEIGHT);
        head.setColor(YELLOW);
        rightArm = new Rectangle(x + R_ARM_SPACING_X, y + R_ARM_SPACING_Y);
        rightArm.setSize(ARM_WIDTH, ARM_HEIGHT);
        rightArm.setColor(BLUE);
        leftArm = new Rectangle(x + L_ARM_SPACING_X, y + L_ARM_SPACING_Y);
        leftArm.setSize(ARM_WIDTH,ARM_HEIGHT);
        leftArm.setColor(BLUE);
        rightLeg = new Rectangle(x + R_LEG_SPACING_X, y + R_LEG_SPACING_Y);
        rightLeg.setSize(LEG_WIDTH, LEG_HEIGHT);
        rightLeg.setColor(RED);
        leftLeg = new Rectangle(x + L_LEG_SPACING_X, y + L_LEG_SPACING_Y);
        leftLeg.setSize(LEG_WIDTH, LEG_HEIGHT);
        leftLeg.setColor(RED);
        body = new RoundedRectangle(x + BODY_SPACING_X, y + BODY_SPACING_Y);
        body.setSize(BODY_WIDTH, BODY_HEIGHT);
        body.setColor(YELLOW);
        avatarLocX = x;
        avatarLocY = y;
    }

    /**
     * Main method that executes the program
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        Avatar avatar = new Avatar();                 // Instantiate avatar using default constructor
        Avatar avatar1 = new Avatar(100,50);    // Instantiate avatar1 using x, y coordinate overloaded constructor
        Avatar avatar2 = new Avatar(550, 100);  // Instantiate avatar2 using x, y coordinate overloaded constructor
        avatar.setLocation(500, 200);           // Shifts avatar from (0, 0) to (500, 200)
        avatar.moveDown(200);                     // Shifts avatar from (500, 200) to (500, 400)
        avatar1.moveDown(150);                    // Shifts avatar1 from (100, 50) to (100, 200)
        Frame.createFrame();
    }
}
