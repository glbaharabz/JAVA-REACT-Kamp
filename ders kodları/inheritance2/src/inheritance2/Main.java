package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customermanager = new CustomerManager();
		customermanager.add(new EmailLogger());

	}

}
