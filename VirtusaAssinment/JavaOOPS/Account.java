
public class Account {

	double interest;
	double balance;
	
	public void setBalance (double balance) {
		this.balance=balance;
	}
	public void calculateInterest() {
		interest = balance * 0.5;
		System.out.println("Intertest calculated to account is: " + interest);
	}
	public void addToAccount() {
		balance=balance+interest;
		System.out.println("Total Balance after interest calculated is: " + balance);
	}
}
