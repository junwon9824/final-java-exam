package finalterm;

import javax.swing.JOptionPane;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		String name;
		float GPA;

		int maxage = 0;
		float maxgpa = 0;

		for (int i = 0; i < 4; i++) {

			try {
				name = JOptionPane.showInputDialog("name");
				age = Integer.parseInt(JOptionPane.showInputDialog("age"));
				GPA = Float.parseFloat(JOptionPane.showInputDialog("GPA"));

				maxage = (maxage < age) ? age : maxage;
				maxgpa = (maxgpa < GPA) ? GPA : maxgpa;

			}

			catch (Exception e) {
				System.out.println(e);
				System.out.println("try again");

			}

		}
		
		System.out.println(maxage);
		System.out.println(maxgpa);
		
		JOptionPane.showMessageDialog(null, String.valueOf(maxage) ,"oldest age",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, String.valueOf(maxgpa) ,"highest gpa",JOptionPane.INFORMATION_MESSAGE);

	}

}
