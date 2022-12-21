package finalterm;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class joptionpane3 {
	static int cnt = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Java Programming");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setPreferredSize(new Dimension(422, 222));
		JTextField test=new JTextField("Enter your name");
		JTextField test2=new JTextField("Enter your city");
		JTextField test3=new JTextField("Enter your age");

		JButton btn = new JButton("submit");

		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=test.getText();
				String city=test2.getText();
				int age=Integer.parseInt(test3.getText());
				
				JOptionPane.showMessageDialog(null, "Information"+"\n"+name+"\n"+city+"\n"+age);
			}
		});
		
		

		panel.add(btn);
		panel.add(test);
		panel.add(test2);
		panel.add(test3);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
