/************************************`
 * Sub3_sample_8_3_inner_class_method_to_outer_class_member.java
 * Author: Iwabuchi Ken				*
 * Date: 20120212_071729
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.*;

class MyClass {
	// members
	String	name	= "Brewster";
	int		age		= 1620;
	// non-static inner class
	private class MyInnerClass {
		void disp() {
			System.out.println(
					name + " " + age + " years old");
			method2();
		}//void disp() {
	}//class MyInnerClass {
	
	// an outer class method
	void method1() {
		MyInnerClass	myi = new MyInnerClass();
		myi.disp();
	}//void method1() {
	
	void method2() {
		System.out.println("test: method2()");
	}
	
}//class MyClass {

public class Sub3_sample_8_3_inner_class_method_to_outer_class_member {

    public static void main(String[] args)
    {
    	new MyClass().method1();
	}//public static void main(String[] args)

}//public class Sub3_sample_8_3_inner_class_method_to_outer_class_member {
