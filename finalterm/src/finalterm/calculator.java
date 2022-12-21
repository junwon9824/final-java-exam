package finalterm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.cyan);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str1=textField.getText();

				String str2=textField_1.getText();
				
				int res=Integer.parseInt(str1)+Integer.parseInt(str2);
				textField_2.setText("Sum:"+String.valueOf(res));
				
				
			}
		});
		btnNewButton.setBounds(26, 44, 91, 47);
		contentPane.add(btnNewButton);
		
		textField = new JTextField("num1");
		textField.setBounds(149, 57, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("num2");
		textField_1.setColumns(10);
		textField_1.setBounds(257, 57, 96, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField("Result");
		textField_2.setColumns(10);
		textField_2.setBounds(370, 57, 96, 21);
		contentPane.add(textField_2);
		
		
	}
}
