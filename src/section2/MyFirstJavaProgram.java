package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot hi = new Robot();
	hi.setSpeed(200);
	hi.move(100);	
	hi.turn(200);

	for(int i=0;i<4;i++) {
		
		hi.move(100);	
		hi.turn(200);	}
	
	}
}