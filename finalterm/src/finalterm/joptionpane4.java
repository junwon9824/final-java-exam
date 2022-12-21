package finalterm;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class joptionpane4 {
	static int cnt = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Java Programming");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.yellow);
		panel.setPreferredSize(new Dimension(422, 222));
		

		JLabel label=new JLabel("Enter Fahrenheit temperature");
		JLabel label2=new JLabel("Temperature in Celsius: ");
		JTextField test = new JTextField(10);


		test.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int su = Integer.parseInt(test.getText());
				double res=(su-32)*((double)10/18);
				int res2=(int)res;
				label2.setText("Temperature in Celsius: "+String.valueOf(res2));
			}
		});

		panel.add(label);
		panel.add(test);

		panel.add(label2);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
