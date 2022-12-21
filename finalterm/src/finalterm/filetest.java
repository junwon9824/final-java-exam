package finalterm;

import java.io.*;
import java.util.Scanner;

public class filetest {
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\test.txt");
		

		String name;
		int id;
		int age;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name:");
		name = sc.nextLine();

		System.out.print("Enter your id:");
		id = sc.nextInt();

		System.out.print("Enter your Age:");
		age = sc.nextInt();

		try {

			f.createNewFile();

			FileWriter fw = new FileWriter(f);
			fw.write("This is a java class"+name );
			fw.close();

		} catch (Exception e) {

		}
	}
}