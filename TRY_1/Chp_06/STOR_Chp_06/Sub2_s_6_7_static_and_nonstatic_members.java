/************************************`
 * Sub2_s_6_7_static_and_nonstatic_members.java
 * Author: Iwabuchi Ken				*
 * Date: 20120205_133224			*
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

class ClassA {
	// member vars
	static String	a = "ClassA: Brownist";
	
	// member methods
	static void show() {
		System.out.println(a);
	}
}//class ClassA {

class ClassB {
	static String	a = 
			"ClassB: All Saints' Parish Church";
	void show() {
		System.out.println(a);
	}
}//class ClassA {

class ClassC {
	String	a = "ClassC: Scrooby manor house";
	void show() {
		System.out.println(a);
	}
}//class ClassA {

public class Sub2_s_6_7_static_and_nonstatic_members {

	public static void main(String[] args)
    {
		// ClassA
		ClassA.show();
		// ClassB
		//ClassB.show();
		new ClassB().show();
		System.out.println(ClassB.a);
		//ClassC
		new ClassC().show();
//		System.out.println();
    }//public static void main(String[] args)

}//public class Sub2_s_6_7_static_and_nonstatic_members {
