package finalterm;

import java.io.*;

import java.util.*;

import javax.swing.JOptionPane;

public class even {

	public static void main(String args[]) throws IOException {

		Integer num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));

		
		if(num%2==0)
		JOptionPane.showMessageDialog(null, "That number is even", "Message", JOptionPane.INFORMATION_MESSAGE);

		
		int res = JOptionPane.showConfirmDialog(null, "Do Another?");

		while (true) {

			if (res == JOptionPane.YES_OPTION) {

				num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));


				if(num%2==0)
				JOptionPane.showMessageDialog(null, "That number is even", "Message", JOptionPane.INFORMATION_MESSAGE);

				
				 res = JOptionPane.showConfirmDialog(null, "Do Another?");

			}

			else {
				return;
			}

		}
		
		

	}

}
