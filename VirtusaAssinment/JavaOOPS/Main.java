
public class Main {

	public static void main(String[] args) {

		SavingsAccount sa = new SavingsAccount();
		sa.setBalance(60000);
		sa.calculateInterest();
		sa.addToAccount();
		CurrentAccount ca =new CurrentAccount();
		ca.setBalance(40000);
		ca.calculateInterest();
		ca.addToAccount();

	}

}
