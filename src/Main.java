
public class Main {

	public static void main(String[] args) {
		
		Account ac = new Account(1000);
		Customer cr = new Customer(ac, " Prienc");
		Customer cr1 = new Customer(ac, " Shalu");
		Thread t1 = new Thread(cr);
		Thread t2 = new Thread(cr1);
		t1.start();
		t2.start();
	}

}
