
public class SavingsAccount extends Account{


	public void calculateInterest() {
		System.out.println("Savings Account Balance is: " +balance);
		interest = balance * 0.05;
		System.out.println("Intertest calculated to Savings account is: " + interest);
	}
	public void addToAccount() {
		balance=balance+interest;
		System.out.println("Savings Account Total Balance after interest calculated is: " + balance);
	}
}
