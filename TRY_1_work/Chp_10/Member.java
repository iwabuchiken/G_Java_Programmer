/************************************`
 * Member.java
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
import java.io.Serializable;

public class Member implements Serializable {

	private String	simei;
	private String	address;
	private String	tel;
	
	public Member(
			String simei, String address,
			String tel) {
		this.simei	= simei;
		this.address = address;
		this.tel	= tel;
	}//public Member(
	
	public String toString() {
		return simei + ":" + address + ":" + tel;
	}//public String toString() {

}//public class Member {
