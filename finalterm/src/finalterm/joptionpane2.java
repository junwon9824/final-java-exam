package finalterm;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class joptionpane2 {
	static int cnt = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Java Programming");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setPreferredSize(new Dimension(422, 222));
		JTextField test=new JTextField("Number1");
		JTextField test2=new JTextField("Number2");
		JTextField test3=new JTextField("sum");

		JButton btn = new JButton("ADD");

		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int su=Integer.parseInt(test.getText());
				int su2=Integer.parseInt(test2.getText());
				int su3=su+su2;
				
				test3.setText(String.valueOf(su3) );
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
