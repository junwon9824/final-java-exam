package finalterm;

import java.util.*;

class Zero {
	int a, b;

	void display() {
		try {
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			int result = a / b; // chance to have exception
			System.out.println(result);
		} catch (Exception e) {
			System.out.print(e);

		}

	}
}

public class exception {
	public static void main(String[] args) {
		Zero obj = new Zero();
		obj.display();

	}
}
