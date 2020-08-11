
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {

			Robot bot = new Robot();
			bot.penDown();
		    bot.setSpeed(100);
			bot.setPenWidth(10);
			String pen = JOptionPane.showInputDialog("What color pen do you want the pen to be?");
			if (pen.equals("blue")) {
				bot.setPenColor(Color.blue);

			} else if (pen.equals("red")) {
				bot.setPenColor(Color.red);

			}
			if (pen.equals("nothing")) {
				bot.setRandomPenColor();
			}

			for (int i = 0; i < 4; i++) {

				bot.turn(90);
				bot.move(90);
				
			}

		}

		// 1. Create a new Robot
		// 2. Make the robot draw a shape (this will take more than one line of code)
		// 3. Set the pen width to 10
		// 4. Ask the user what color pen they would like the robot to draw with
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

	}
}
