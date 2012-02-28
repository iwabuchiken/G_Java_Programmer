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

package MyPackage;

import static java.lang.System.out;

public class MyClass {

	private int	code = 100;
	private String	name = 
			"Thomas Cartwright";
	void dispCode() {
		out.println("code: " + code);
	}
	
	public void dispName() {
		out.println("name: " + name);
	}
}//public class Sub1_subclass_access_super_class_private_var {

class MyClass2 {
	private int		code = 200;
	private String	name = 
			"Middleburg";
	void dispCode() {
		out.println("code: " + code);
	}
	
	public void dispName() {
		out.println("name: " + name);
	}
}//class MyClass2 {