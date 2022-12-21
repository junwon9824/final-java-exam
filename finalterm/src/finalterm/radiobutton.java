package finalterm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

import javax.swing.*;

public class radiobutton {
	static int cnt = 1;
	static String str ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Check Box");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		
		panel.setPreferredSize(new Dimension(300, 100));
		panel.setBackground(Color.orange);
		
		JRadioButton r1 = new JRadioButton("Java");
		JRadioButton r2 = new JRadioButton("C#");
		JRadioButton r3 = new JRadioButton("Capston");
		
		
		ButtonGroup group = new ButtonGroup();
//		r1.addItemListener(null);
		
		group.add(r1);
		group.add(r2);
		group.add(r3);

		
		
		r1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange()==1) {
					JOptionPane.showMessageDialog(null, "java is selected");
				}
				
				
			}
		});
		
		r2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (r2.isSelected()) {
					JOptionPane.showMessageDialog(null, "c# is selected");
				}
			}
		});
		
		r3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (r3.isSelected()) {
					JOptionPane.showMessageDialog(null, "capstone is selected");
				}
			}
		});
		
		panel.add(bt);
		panel.add(r1);
		panel.add(r2);
		panel.add(r3);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
