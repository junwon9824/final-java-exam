package finalterm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.font.ImageGraphicAttribute;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class windowsejong extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowsejong frame = new windowsejong();
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
	public windowsejong() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.blue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon=new ImageIcon("C:\\Users\\junho\\Downloads\\sejong.png");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setBounds(100, 37, 173, 130);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("First Panel");
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		
		panel_1.setBounds(285, 37, 173, 130);
		panel_1.setBackground(Color.orange);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Panel");
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(100, 177, 358, 251);
		panel_2.setBackground(Color.orange);

		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setBounds(63, 10, 218, 220);
		panel_2.add(lblNewLabel);
	}

}
