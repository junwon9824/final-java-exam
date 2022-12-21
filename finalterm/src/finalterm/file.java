package finalterm;

import java.io.*;
import java.util.*;

public class file {
	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\test.txt");
		f.createNewFile();
		InputStream fin = new FileInputStream(f);
		String str;
		Scanner obj = new Scanner(fin);

		while(obj.hasNext())
		{

			 str = obj.next();
			
			System.out.println(str);
			
		}

	}

}