import java.util.Scanner;

public class Account {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public boolean isSufficientBalance(int withAmt) {
		if (withAmt < balance) {
			return (true);
		} else {
			return (false);
		}

	}

	void deposite(int depAmt) {
		int updatedBalance = depAmt + balance;
		System.out.println("Deposit sucessful");
		System.out.println("New balance is " + updatedBalance);
	}

	void withdraw(int witAmt) {

		int newBalance =balance- witAmt ;
		System.out.println("Withdraw sucessfully");
		System.out.println("Your updated balance is" + newBalance);
		System.out.println("ThankYou");

	}

//	void deposit(int depamt) {
//		int newBalance = depamt + balance;
//		System.out.println("Deposit sucessfull");
//		System.out.println("New balance = " + newBalance);
//	}
}

class Customer implements Runnable {
	private String name;
	private Account account;

	public Customer(Account account, String n) {
		this.account = account;
		name = n;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(name + " Enter the amount to withdraw");
		int witAmt = sc.nextInt();
		
		synchronized (account) {
			
		
		if (account.isSufficientBalance(witAmt)) {
			account.withdraw(witAmt);
		} else {
			System.out.println("Insufficient balance to make this transaction");
		}
//		}
//		
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println(name + " Enter the amount to deposit");
//		int depAmt = sc1.nextInt();
//		account.deposit(depAmt);
//		
//}
		}
	}
}
