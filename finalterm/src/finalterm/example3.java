package finalterm;


class Child {
	int no;
	int su;

	Child(int a, int b) { // constructor
		no = a;
		su = b;
		System.out.println("two arguments "+no+" "+su);

	}

	Child(int a) { // constructor
		no = a;
		System.out.println("one arguments "+no);

	}

	Child() { // constructor
		System.out.println("no arguments ");
	}

	
}


public class example3 {
	public static void main(String[] args) {
		Child obj = new Child(10, 20);
		Child obj2 = new Child(30);
		Child obj3 = new Child();
		
		
	}
}

