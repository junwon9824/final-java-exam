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

public class simplecalcu extends JFrame {

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
					simplecalcu frame = new simplecalcu();
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
	public simplecalcu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 655, 367));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.green);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer a=Integer.parseInt(textField.getText());
				Integer b=Integer.parseInt(textField_1.getText());
				
				int res=a+b;
				textField_2.setText(String.valueOf(res) );
			}
		});
		btnNewButton.setBounds(0, 10, 82, 23);
		btnNewButton.setForeground(Color.black);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer a=Integer.parseInt(textField.getText());
				Integer b=Integer.parseInt(textField_1.getText());
				
				int res=a-b;
				textField_2.setText(String.valueOf(res) );
				
			}
		});
		
		btnNewButton_1.setBounds(107, 10, 61, 23);
		btnNewButton_1.setForeground(Color.black);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer a=Integer.parseInt(textField.getText());
				Integer b=Integer.parseInt(textField_1.getText());
				
				int res=a*b;
				textField_2.setText(String.valueOf(res) );
			}
		});
		
		
		btnNewButton_2.setBounds(191, 10, 70, 23);
		btnNewButton_2.setForeground(Color.black);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer a=Integer.parseInt(textField.getText());
				Integer b=Integer.parseInt(textField_1.getText());
				
				int res=a/b;
				textField_2.setText(String.valueOf(res) );
			}
		});
		btnNewButton_3.setBounds(273, 10, 70, 23);
		btnNewButton_3.setForeground(Color.black);

		contentPane.add(btnNewButton_3);
		
		textField = new JTextField("Number1");
		textField.setBounds(371, 11, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("Number2");
		textField_1.setColumns(10);
		textField_1.setBounds(479, 11, 96, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField("Result");
		textField_2.setBounds(228, 66, 96, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
