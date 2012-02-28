/************************************`
 * Sub7_sample_10_14_customize_serialize.java
 * Author: Iwabuchi Ken				*
 * Date: 20120210_083551
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.*;

class MemberC implements Serializable {
	private String	simei;
	private String	address;
	private String	tel;
//	private transient AccountC	account;
	private AccountC	account;
	
	// Constructor
	public MemberC(String simei,
			String address, String tel, 
			long money) {
		this.simei	= simei;
		this.address	= address;
		this.tel	= tel;
		this.account	= new AccountC(money);
	}//public MemberC(String simei,
	
	public String toString() {
		long	balance = account.getBalance();
		return simei + ":" + address 
				+ ":" + tel + ":" + balance;
	}//public String toString() {
	
	public AccountC getAccount() {
		return account;
	}
	
	private void writeObject(
			ObjectOutputStream oos) 
			throws IOException {
		oos.defaultWriteObject();
//		oos.writeLong(account.getBalance());
	}//private void writeObject(
	
	private void readObject (
			ObjectInputStream ois) throws
			IOException, ClassNotFoundException {
		ois.defaultReadObject();
//		long	balance = ois.readLong();
//		this.account	= new AccountC(balance);
	}//private void readObject
	
}//class MemberC implements Serializable {

public class Sub7_sample_10_14_customize_serialize {

    public static void main(String[] args)
    {
    	// Inspect the length of args[]
    	if (args.length < 1) {
    		System.out.println(
				"args.length=" + args.length);
    		System.out.println(
				"Please input the second argument.");
    		System.exit(0);
    	}
    	
    	// Declare members
    	String	path	= args[0];
    	File	file	= new File(path);
    	
    	try {
    		// generate object streams
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(file));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					file));
			
			// generate objectc to be written to file
			MemberC	taro = new MemberC(
				"Taro", "Tokyo", "111", 10001);
			MemberC	hana = new MemberC(
				"Hana", "Tokyo", "222", 20002);
			
			// write objects to file
			oos.writeObject(taro);
			oos.writeObject(hana);
			
			// report
			System.out.println(
					"taro.toString()="
					+ taro.toString());
			System.out.println(
					"hana.toString()="
					+ hana.toString());
			
			// flush and close: oos
			oos.flush();
			oos.close();
			System.out.println(
				"Write -> complete");
			
			// read objects from file
			MemberC	a = (MemberC)ois.readObject();
			MemberC	b = (MemberC)ois.readObject();
			
			// report
			System.out.println(
					"a.toString()="
					+ a.toString());
			System.out.println(
					"b.toString()="
					+ b.toString());
			
			// process objects read from file
			System.out.println();
			System.out.println("<a and b>");
			a.getAccount().withdraw(1000);
			
			// report
			System.out.println(
					"a.toString()="
					+ a.toString());
			System.out.println(
					"b.toString()="
					+ b.toString());
			
			// close file
			ois.close();
			System.out.println("Read -> complete");
    	} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}//public static void main(String[] args)

}//public class Sub7_sample_10_14_customize_serialize {

//class AccountC {
class AccountC implements Serializable {
	private long	balance;
	public AccountC(long balance) {
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
}//class AccountC {
