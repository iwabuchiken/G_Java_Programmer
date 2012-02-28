/************************************`
 * Sub3_s_6_8_static_members_and_static_methods.java
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

class ClassA {
	// member vars
	static String	a = "ClassA: Brownist";
	static String	a2 = 
				"ClassA.a2: Robert Browne";
	
	// member methods
	static void show(String x) {
		System.out.print("ClassA.show(): ");
		System.out.println(x);
	}
	
	void show2() {
		System.out.print("ClassA.show2(): ");
		System.out.println("this.a2=" + this.a2);
	}
}//class ClassA {

public class Sub3_s_6_8_static_members_and_static_methods {

	// class vars
	static String	b = "class.b: Separatist";
	String	c = "class.c: Church of England";
	
	public static void main(String[] args)
    {
		show();
		//this.show();
		ClassA.show(ClassA.a);
		//display();
		//this.display();
		//System.out.print(this.c);
		System.out.println(
				new Sub3_s_6_8_static_members_and_static_methods().c);
		//System.out.print(this.b);
		// ClassA
		new ClassA().show2();
    }//public static void main(String[] args)
	
	static void show() {
		System.out.print("class Sub3.show(): ");
		ClassA.show(b);
	}
	
	void display() {
		System.out.println(c);
	}

}//public class Sub3_s_6_8_static_members_and_static_methods {
