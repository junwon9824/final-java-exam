package finalterm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class windowpicture extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowpicture frame = new windowpicture();
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
	public windowpicture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 496);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ImageIcon img= new ImageIcon("Images\\È­¸é Ä¸Ã³ 2022-12-01 084531.png");
		ImageIcon img2= new ImageIcon("Images\\49mxD.png");

		JLabel lblNewLabel = new JLabel(img2);
		lblNewLabel.setBounds(78, 57, 594, 332);
		contentPane.add(lblNewLabel);
		
	}
}
