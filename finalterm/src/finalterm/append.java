package finalterm;

import java.io.*;
import java.util.Scanner;

public class append {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("E:\\test.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		
		
		
		System.out.print("Enter your name:");
		String name;
		Scanner obj = new Scanner(System.in);
		name = obj.nextLine();
//		fw.write(name + " ");
//		fw.close();
		pw.print(name);
		pw.close();
		
		
	}
}
