package finalterm;

class Division {
	public int division(int a, int b) throws ArithmeticException {
		int result = a / b;
		return result;
	}
}

public class ThrowsException {
	public static void main(String[] args) throws ArithmeticException { // declare Exception
		Division obj = new Division();
		System.out.println(obj.division(10, 2));
	}
}
