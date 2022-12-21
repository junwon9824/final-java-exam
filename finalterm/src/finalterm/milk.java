package finalterm;

import java.io.*;

import java.util.*;

import javax.swing.JOptionPane;

public class milk {

	public static void main(String args[]) throws IOException {

		String str = (JOptionPane.showInputDialog("Enter Quantity"));
		Integer qty = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity"));
		Integer won = Integer.parseInt(JOptionPane.showInputDialog("Enter Rate(won)"));

		
		JOptionPane.showMessageDialog(null, "Total " + str + " price:" + (float) won * qty + "Won", "Message",
				JOptionPane.INFORMATION_MESSAGE);
		
		int res = JOptionPane.showConfirmDialog(null, "Repeat the process");

		
		while (true) {

			if (res == JOptionPane.YES_OPTION) {

				str = (JOptionPane.showInputDialog("Enter Quantity"));
				qty = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity"));
				won = Integer.parseInt(JOptionPane.showInputDialog("Enter Rate(won)"));

				JOptionPane.showMessageDialog(null, "Total " + str + " price:" + (float) won * qty + "Won", "Message",
						JOptionPane.INFORMATION_MESSAGE);
				res = JOptionPane.showConfirmDialog(null, "Repeat the process");

			}

			else {
				return;
			}

			
		}

	}

}
