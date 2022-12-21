package finalterm;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class joptionpane {
	static int cnt = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Java Programming");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setPreferredSize(new Dimension(322, 222));
		JLabel label = new JLabel("This is a Java Programming");

		JButton btn = new JButton("Push");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				JOptionPane.showMessageDialog(btn, "Push:"+cnt );
				cnt++;
				
				
			}
		});

		panel.add(label);
		panel.add(btn);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
