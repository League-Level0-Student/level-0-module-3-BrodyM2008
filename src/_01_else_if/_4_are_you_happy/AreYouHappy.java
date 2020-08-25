package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String person = JOptionPane.showInputDialog("Are you happy?");
		if(person .equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
		}
		
		if(person .equals("no")) {
			person = JOptionPane.showInputDialog("Do you want to be happy?");
			if(person .equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
				
				}
			if(person .equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
			}
			}
		}
	}


