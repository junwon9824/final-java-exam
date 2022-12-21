package finalterm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class window3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window3 frame = new window3();
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
	public window3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.blue);
		
		ImageIcon icon=new ImageIcon("C:\\Users\\junho\\Downloads\\sejong.png");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.cyan);
		panel.setBounds(32, 20, 209, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.green);
		panel_2.setBounds(33, 38, 153, 107);
		panel.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Second Panel");
		lblNewLabel_2.setBounds(68, 13, 92, 15);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.orange);
		panel_1.setBounds(253, 20, 365, 318);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setBounds(22, 10, 300, 265);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(160, 293, 50, 15);
		panel_1.add(lblNewLabel_1);
	}

}
