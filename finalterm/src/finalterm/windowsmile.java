package finalterm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class windowsmile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowsmile frame = new windowsmile();
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
	public windowsmile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 539);
		contentPane = new JPanel();
		contentPane.setBackground(Color.blue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img=new ImageIcon("image\49mxD.png");
		ImageIcon icon = new ImageIcon("C:\\Users\\junho\\OneDrive\\¹ÙÅÁ È­¸é\\È­¸é Ä¸Ã³ 2022-09-22 085703.png");
//		ImageIcon icon = new ImageIcon("C:\\Users\\junho\\Downloads\\È­¸é Ä¸Ã³ 2022-12-09 190746.png");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\junho\\OneDrive\\¹ÙÅÁ È­¸é\\È­¸é Ä¸Ã³ 2022-09-22 085728.png");

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setBounds(12, 22, 440, 465);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First panel",icon,SwingConstants.CENTER);
		
		lblNewLabel.setBounds(79, 26, 257, 352);
		panel.add(lblNewLabel);	
		
		JLabel lblNewLabel_2 = new JLabel("first panel");
		lblNewLabel_2.setBounds(187, 398, 50, 15);
		panel.add(lblNewLabel_2);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(465, 22, 501, 465);
		panel_2.setBackground(Color.white);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(icon2);
		lblNewLabel_1.setBounds(12, 35, 344, 396);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Second Panel");
		lblNewLabel_3.setBounds(391, 203, 84, 15);
		panel_2.add(lblNewLabel_3);
		
		
	}
}
