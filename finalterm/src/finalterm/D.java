package finalterm;

import java.util.*;

class A {
	int height=11;

}

class B extends A {

	int height=10;
	
}


interface C {

	void bark();

	void sleep();

}

class D  implements C {

	public void bark() {
		System.out.println("wooo");

	}

	public void sleep() {
		System.out.println("zzz");

	}
	
	
	public static void main(String[] args) {

		D d = new D();
		d.bark();
		
		B b= new B();
		System.out.println(b.height);

	}
}



