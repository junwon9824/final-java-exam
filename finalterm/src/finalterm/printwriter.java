package finalterm;

import java.io.*;
import java.util.*;

public class printwriter {

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
			
			FileInputStream fi = new FileInputStream(f);
			
			PrintWriter pw=new PrintWriter(f);
			
			pw.println("NAME:" + name );
			pw.println("ID:" + id );
			pw.println("Age:" + age);
			pw.close();
			
			Scanner s = new Scanner(fi);

			while(s.hasNext())
			{
				System.out.println(s.nextLine());
				
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
