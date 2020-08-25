package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Story {
	public static void main(String[] args) {
		String person = JOptionPane.showInputDialog("Do you want to go to six flags?");
		if(person.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Let's go!");
		}
			if(person.equals("no")) {
				person = JOptionPane.showInputDialog("Well what do you want to do then?");
				if(person.equals("Maybe we should go out to eat?")) {
					JOptionPane.showMessageDialog(null, "Sure");
					
				}
				if(person.equals("Maybe we should go shopping?")) {
					JOptionPane.showMessageDialog(null, "No way!");
				}
			}  
		}
	}


