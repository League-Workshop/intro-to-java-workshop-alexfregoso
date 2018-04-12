package section4;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score =0;
		// 2.  Ask the user a question 
		String hi5490 = JOptionPane.showInputDialog(null, "whats 2+2");
		// 3.  Use an if statement to check if their answer is correct
		if(hi5490.equals("99002")){
		// 4.  if the user's answer is correct
			JOptionPane.showMessageDialog(null,"YAY YOU GOT THE QUESTON RIGHT YOU ARE NOT STUPID THE FIRST GUY TO WIN YAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			
		// -- add one to their score 
			score=score + 1;
			
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
			String hi5499 = JOptionPane.showInputDialog(null, "whats 9999999999 + 9999999999999");
			if(hi5499.equals("99001"))
			 {
				JOptionPane.showMessageDialog(null,"YAY YOU GOT THE QUESTON RIGHT YOU ARE NOT STUPID, THE FIRST GUY TO WIN YAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			}
		}
			
		// 6.  After all the questions have been asked, print the user's score 
		
	}

	
}
