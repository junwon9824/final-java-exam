package finalterm;

import java.io.*;
import java.util.*;

public class fileex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		File f = new File("E:\\test.txt");
		
		try {
			f.createNewFile();

			FileWriter fw = new FileWriter(f);

			fw.write("NAME:"+name+"\n");
			fw.write("ID:"+id+"\n");
			fw.write("Age:"+age+"\n");
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
