package finalterm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nonscientific extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nonscientific frame = new nonscientific();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public nonscientific() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(37, 28, 499, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		

		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt( btnNewButton.getText());
				 textField.setText(textField.getText()+ String.valueOf(a));
				 
			}
		});
		
		
		btnNewButton.setBounds(37, 126, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setBounds(37, 177, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBounds(37, 227, 91, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.setBounds(37, 279, 91, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setBounds(140, 126, 91, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBounds(140, 177, 91, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.setBounds(140, 227, 91, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton(".");
		btnNewButton_7.setBounds(140, 279, 91, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(265, 126, 91, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.setBounds(265, 177, 91, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.setBounds(265, 227, 91, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("C");
		btnNewButton_11.setBounds(265, 279, 91, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.setBounds(476, 126, 91, 180);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_9_1 = new JButton("*");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String str=btnNewButton_9_1.getText();
				textField.setText(textField.getText()+ '*');
			}
		});
		btnNewButton_9_1.setBounds(368, 177, 91, 23);
		contentPane.add(btnNewButton_9_1);
		
		JButton btnNewButton_8_1 = new JButton("-");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText( textField.getText()+'-');
			}
		});
		btnNewButton_8_1.setBounds(368, 126, 91, 23);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_10_1 = new JButton("+");
		btnNewButton_10_1.setBounds(368, 227, 91, 23);
		contentPane.add(btnNewButton_10_1);
		
		JButton btnNewButton_11_1 = new JButton("=");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField.getText();
				
				
				String array[]=str.split("-");
				
				float a,b,res;
				a=Float.parseFloat(array[0]);
				b=Float.parseFloat(array[1]);
				
				res=a-b;
				
				
				
				textField.setText(textField.getText()+'='+res);
			}
		});
		
		btnNewButton_11_1.setBounds(368, 279, 91, 23);
		contentPane.add(btnNewButton_11_1);
	}

}
