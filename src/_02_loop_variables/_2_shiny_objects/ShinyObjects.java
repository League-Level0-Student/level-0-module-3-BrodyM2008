
package _02_loop_variables._2_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {
playMisterZee();

         String shiny = JOptionPane.showInputDialog("how many shiny objects do you want?");
        int zee = Integer.parseInt(shiny);
        for (int i = 0; i < zee; i++) {
        	
		playMisterZee();	
		}
		// 1. Call the method below to play the sound
		// 2. Ask the user how many shiny objects they want
		// 3. Play the sound that many times
        
       
     



	}

	/********************   Use this method. DON'T CHANGE THE CODE BELOW  ***********************/
	
	public static void playMisterZee() {
		System.out.println("Mister Zee requires shiny objects");
			
	}


}
