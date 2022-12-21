package finalterm;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

import javax.swing.*;

public class itemlistener {
	static int cnt = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Java Programming");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(422, 222));

		JCheckBox b = new JCheckBox("KFC");
		JCheckBox b2 = new JCheckBox("burger king");
		JCheckBox b3 = new JCheckBox("mcdon");
		JLabel label = new JLabel();

		b.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				label.setText("kfc:"+ (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});
		
		
		b2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				label.setText("burger king:"+ (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});
		
		b3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				label.setText("mcdonald:"+ (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		
		panel.add(label);
		panel.add(b);
		panel.add(b2);
		panel.add(b3);
		
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
