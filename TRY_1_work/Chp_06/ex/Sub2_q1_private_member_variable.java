/************************************`
 * Sub2_private_member_variable.java
 * Author: Iwabuchi Ken				*
 * Date: 20120205_133224			*
 * Aim:								*
 * 	1.A private member variable of a class
 * 		=> An instance can access it?
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 *									*
 ************************************/

//import java.lang.*;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

class Friend {
	private String	name;
	protected int	age;
	public String	tel;
}//class Friend {

public class Sub2_q1_private_member_variable
			extends Friend {

    public static void main(String[] args)
    {
    	Sub2_q1_private_member_variable s =
    				new Sub2_q1_private_member_variable();
    	//System.out.println(s.name);
    	//System.out.println(new Friend().name);
    	System.out.println("s.age=" + s.age);
    	System.out.println("s.tel=" + s.tel);
    }//public static void main(String[] args)

}//public class Sub2_q1_private_member_variable.java {
