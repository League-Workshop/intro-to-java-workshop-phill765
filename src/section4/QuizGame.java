package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String easy = JOptionPane.showInputDialog("What is 2+2?");
		// 3.  Use an if statement to check if their answer is correct
		if(easy.equals("4")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "The answer is actually 4. That wasn't that hard");
		}
		String harder = JOptionPane.showInputDialog("Who runs the company Microsoft?");
		if(harder.equals("Bill Gates")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "Come on man!");
		}
		JOptionPane.showMessageDialog(null, "Time for the hardest question");
		String RNB = JOptionPane.showInputDialog("What is the airspeed velocity of an unladen swallow?");
		if(RNB.equals("What do you mean, an African or European Swallow?")) {
			JOptionPane.showMessageDialog(null, "what? AHHHHHH.......");
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		JOptionPane.showMessageDialog(null, "You scored " + score );
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
