package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Boi =new Robot ();

	void go() {
		// 4. Make the robot move as fast as possible
		Boi.setSpeed(500);
		// 5. Set the pen width to 5
		Boi.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int e = 0; e<4; e++) {
			// 7. Set the pen color to random
		Boi.setRandomPenColor();
			// 1. Call the drawSquare() method
		drawSquare();
				// 8. Turn the robot 90 degrees to the right
		Boi.turn(90ss);
		}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		Boi.penDown();
		for(int I = 0; I<4; I++) {
			Boi.move(200);
			Boi.turn(90);
			
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



