/************************************`
 * Sub4_sample_8_4_inner_class_member_qualifier.java
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
	static private String	name	= "Brewster";
	private int		age		= 1620;
	
	
	// non-static inner class
	class MyInnerClass {
//		static private String 	tel = "22222";
		private String 	tel = "22222";
		public String	zip = "55-55-55";
		private void disp() {
			System.out.println(
					name + " " + age + " years old");
			method2();
		}//void disp() {
	}//class MyInnerClass {
	
	// an outer class method
	void method1() {
		MyInnerClass	myi = new MyInnerClass();
		System.out.println(myi.tel);
		System.out.println(myi.zip);
		myi.disp();
	}//void method1() {
	
	void method2() {
		System.out.println("test: method2()");
	}
	
}//class MyClass {

public class Sub4_sample_8_4_inner_class_member_qualifier {

    public static void main(String[] args)
    {
    	new MyClass().method1();
    	
    	// an instance of MyClass
    	MyClass mc = new MyClass();
    	
    	
//    	System.out.println(
//    			"new MyClass().name"
//    			+ new MyClass().name);
	}//public static void main(String[] args)

}//public class Sub4_sample_8_4_inner_class_member_qualifier {
