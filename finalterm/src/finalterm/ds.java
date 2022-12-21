package finalterm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Java programming");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();
		panel.setBackground(Color.green);
		
		JTextField text1=new JTextField("number1");
		JTextField text2=new JTextField("number2");
		JTextField text3=new JTextField("Sum");
		
		panel.add(text1);
		panel.add(text2);
		panel.add(text3);
		
		JButton btn=new JButton("add");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Integer a=Integer.parseInt( text1.getText()); 
				Integer b=Integer.parseInt( text2.getText()); 
				
				String res= String.valueOf( a+b) ;
				text3.setText(res);
			}
		});
		
		panel.add(btn);
		panel.add(text1);
		panel.add(text2);
		panel.add(text3);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
