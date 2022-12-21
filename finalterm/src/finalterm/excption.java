package finalterm;

public class excption {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			int i = arr[4];
			throw new Exception("Array size");
		} catch (Exception ex) {
			System.out.println("Exception has been caught");
		} finally {
			System.out.println("Out of try-catch-finally block");
		}
		System.out.println("Outside try-catch clause");
	}
}