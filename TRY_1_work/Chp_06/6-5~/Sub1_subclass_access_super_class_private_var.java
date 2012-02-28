/************************************`
 * Sub1_subclass_access_super_class_private_var.java
 * Author: Iwabuchi Ken				*
 * Date: 20120212_090617
 * Aim:								*
 * 	1.
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
import static java.lang.System.out;

class ClassA {
	// member vars
	private String	name = "Henry Barrowe";
}//class ClassA {

class ClassB extends ClassA {
	String			name2 =
				"ClassB: John Greenwood";
	private String	name3 =
				"ClassB: Robert Browne";
}
public class Sub1_subclass_access_super_class_private_var {

	public static void main(String[] args)
    {
		ClassB	b = new ClassB();
		out.println(b.name);
		//out.println(b.name3);
		
	}//public static void main(String[] args)	
}//public class Sub1_subclass_access_super_class_private_var {
