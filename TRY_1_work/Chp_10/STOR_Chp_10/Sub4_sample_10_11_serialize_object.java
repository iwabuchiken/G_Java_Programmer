/************************************`
 * Sub4_sample_10_11_serialize_object.java
 * Author: Iwabuchi Ken				*
 * Date: 20120209_090456
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
//import java.lang.reflect.Member;

public class Sub4_sample_10_11_serialize_object {

    public static void main(String[] args)
    {
    	/* Declare members */
    	String	path;
    	File file;
    	FileOutputStream fos;
    	ObjectOutputStream oos;
    	ObjectInputStream ois;
    	MemberA	taro;
    	MemberA	hana;
    	MemberA	a;
    	MemberA	b;
    	
    	/* Initialize 'path' */
    	if (args.length < 1) {
    		System.out.println(
				"args.length=" + args.length);
    		System.out.println(
				"Please input the second argument.");
    		path = "";
    		System.exit(0);
    	}
    	else {
    		path = args[0];
    	}
    	/* File class instance*/
    	try {
			file = new File(path);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			file = new File(".");
			System.exit(0);
		}
    	
    	try {
			/* 
			 * Generate a stream
			 */
    		// Generate objects
			oos = new ObjectOutputStream(
					new FileOutputStream(file));
			ois = new ObjectInputStream(
					new FileInputStream(file));
			taro = new MemberA(
					"Taro", "Tokyo", "111", 10001);
			hana = new MemberA(
					"Hana", "Tokyo", "222", 20002);
			
			// Write objects into file
			oos.writeObject(taro);
			oos.writeObject(hana);
			
			// Show objects
			System.out.print("taro.toString()=");
			System.out.println(taro.toString());
			System.out.print("hana.toString()=");
			System.out.println(hana.toString());
			
			// flush and close the file
			oos.flush();
			oos.close();
			System.out.println("Write complete.");
		
			// Read objects from file
			a = (MemberA)ois.readObject();
			b = (MemberA)ois.readObject();
			
			///debug
//			System.out.print(
//					"a=" + a.getClass().toString());
//			System.out.print(
//					" " + a.getClass().hashCode());
			
			// Process objects
			//a.getAccount().withdraw(1000);
			System.out.print("a.toString()=");
			System.out.println(a.toString());
			System.out.print("b.toString()=");
			System.out.println(b.toString());
			
			// Close files
			ois.close();
			System.out.println("Read complete.");

			/* Inspect the in-program objects
			 * and in-file objects. Are they identical?
			 */
			///debug
//			taro = a;
			
			if (taro == a) {
				System.out.println(
					"taro and a are identical by the operator '=='.");
			} else if (taro.equals(a)) {
				System.out.println(
						"taro and a are identical by the method 'equals()'.");
			} else {
				System.out.println(
					"taro and a are not identical.");
			}
			
			///debug
			if (taro.getSimei() == "taro")
	    		System.out.println("EQUAL TARO");
	    	else
	    		System.out.println("NOT EQUAL TARO");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();  
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	///debug
    	if ("abc" == "abc")
    		System.out.println("EQUAL");
    	
	}//public static void main(String[] args)

}//public class Sub4_sample_10_11_serialize_object {

class MemberA implements Serializable {
	// Members
	private String	simei;
	private String	address;
	private String	tel;
	private Account	account;
	
	public MemberA(
			String simei, String address, 
			String tel, long money) {
		this.simei = simei;
		this.address = address;
		this.tel = tel;
		this.account = new Account(money);
	}//public MemberA(
	
	public String toString() {
		long balance = account.getBalance();
		return simei + ":" + address 
				+ ":" + tel + ":" + balance;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public String getSimei() {
		return simei;
	}
	
	/* Override 'equals()'
	 *
	 */
	public boolean equals(Object obj) {
//		if ((obj instanceof MemberA) && (((MemberA)obj).getSimei() == simei)) {
		if ((obj instanceof MemberA) && (simei.equals(((MemberA)obj).getSimei()))) {
			return true;
		} else {
			return false;
		}
	}
	
}//class MemberA implements Serializable {
