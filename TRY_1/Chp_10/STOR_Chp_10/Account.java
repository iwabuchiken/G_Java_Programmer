import java.io.Serializable;

public class Account implements Serializable {
	private long	balance;
	public Account(long balance) {
		this.balance = balance;
	}
	
	// Account
	public void deposit(long money) {
		balance += money;
	}
	// withdraw
	public void withdraw(long money) {
		balance -= money;
	}
	// refer balance
	public long getBalance() {
		return balance;
	}
}//public class Account implements Serializable {