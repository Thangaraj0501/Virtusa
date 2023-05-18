
public class CurrentAccount extends Account {

	
	public void calculateInterest() {
		System.out.println("Current Account Balance is: " +balance);
		interest = balance * 0.02;
		System.out.println("Intertest calculated to current account is: " + interest);
	}
	public void addToAccount() {
		balance=balance+interest;
		System.out.println("Current Account Total Balance after interest calculated is: " + balance);
	}
}
