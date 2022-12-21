package finalterm;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

import javax.swing.*;

public class itemlistener2 {
	static int cnt = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Java Programming");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(422, 222));

		JCheckBox b = new JCheckBox("KFC@7500");
		JCheckBox b2 = new JCheckBox("burger@6500");
		JCheckBox b3 = new JCheckBox("mcdon@5500");

		JButton btn = new JButton("order");

		btn.addActionListener(new ActionListener() {
			int res = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String s1 = "";
				String s2 = "";
				String s3 = "";
				if (b.isSelected()) {
					res += 7500;
					s1 = "kfc:7500\n";
				}

				if (b2.isSelected()) {
					res += 6500;
					s2 = "burger:6500\n";

				}
				if (b3.isSelected()) {
					res += 5500;
					s3 = "mcdonald:5500\n";

				}

				JOptionPane.showMessageDialog(null, s1+s2+s3 + "total:" + res);

			}
		});

		b.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

			}
		});

		b2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

			}
		});

		panel.add(b);
		panel.add(b2);
		panel.add(b3);
		panel.add(btn);

		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
