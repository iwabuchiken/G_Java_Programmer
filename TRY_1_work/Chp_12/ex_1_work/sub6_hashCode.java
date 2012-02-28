/************************************`
 * sub6_hashCode.java
 * Author: Iwabuchi Ken				*
 * Date: 20120207_110637
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1."Programmer": 494
 ************************************/

//import java.lang.*;
import java.util.HashSet;

public class sub6_hashCode {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Member2		Tom		= new Member2("A0123", "Tom");
    	Member2		Taro	= new Member2("A0123", "Taro");

    	HashSet		set		= new HashSet();
    	boolean		b1		= set.add(Tom);
    	boolean		b2		= set.add(Taro);

    	/* Show values */
    	System.out.println("Add Tom : " + b1);
    	System.out.println("Add Taro : " + b2);

    	/* Show hash value */
    	System.out.println("The hash of Tom : " + Tom.hashCode());
    	System.out.println("The hash of Taro : " + Taro.hashCode());

    	/* Change a member value */
    	Tom.setId("A0122");
    	System.out.println("<Tom.setId(\"A0122\")>");

    	/* Show hash value */
    	System.out.println("The hash of Tom : " + Tom.hashCode());
    	System.out.println("The hash of Taro : " + Taro.hashCode());

	}//public static void main(String[] args)

}//public class sub6_hashCode {

class Member2 {
	private String	id		= "";
	private String	name	= "";

	public Member2(String id, String name) {
		this.id		= id;
		this.name	= name;
	}

	public String getId() { return id; }
	public String getName() { return name; }

	public void setId(String newId) {
		this.id = newId;
	}

	public boolean equals(Object obj) {
		if ((obj instanceof Member2) &&
				(id.equals(((Member2)obj).getId()))) {
			return true;
		} else {
			return false;
		}
	}//public boolean equals(Object obj) {

	public int hashCode() {
		return id.hashCode();
	}
}//class Member2 {
