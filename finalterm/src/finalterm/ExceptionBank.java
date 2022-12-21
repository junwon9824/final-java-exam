import java.util.*;

class Bank {
	int deposit;

	Bank() {
		deposit = 3000;
	}

	void withdraw() {
		
		int withdraw;
		System.out.print("Enter amount to withdraw:");
		
		try {
			Scanner obj = new Scanner(System.in);
			withdraw = obj.nextInt();
			
			if (withdraw > deposit)
				throw new Exception("Low balance");
			
			int result = deposit - withdraw;
			System.out.println("Remaining Balance:" + result);
		}

		catch (Exception e) {
			System.out.println(e);
			System.out.println("Enter the Correct Amount");
		}
	}
}

public class ExceptionBank {
	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.withdraw();
	}
}