package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot yort = new Robot();
		yort.penDown();
		yort.setRandomPenColor();
		for(int I = 0; I<4; I++) {
			yort.setSpeed(50);
			yort.move(100);
			yort.turn(90);
			yort.setRandomPenColor();
		}
		}
		 
	}

