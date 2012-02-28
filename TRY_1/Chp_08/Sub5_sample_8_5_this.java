/************************************`
 * Sub5_sample_8_5_this.java.java
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
	private String	name	= "Robinson";
	// non-static inner class
	class MyInnerClass {
		private String	name = "Plymouth";
		
		void disp() {
			System.out.println("MyInnerClass.disp()");
			System.out.println(this);
			// outer class: toString()
			System.out.println(MyClass.this);
			// inner class: name
			System.out.println(this.name);
			System.out.println(MyClass.this.name);
			
		}//void disp() {
		
		public String toString() {
			return "MyInnerClass";
		}
	}//class MyInnerClass {
	
	// an outer class method
	void method1() {
		System.out.println("MyClass.method1()");
		new MyInnerClass().disp();
	}//void method1() {
	
	public String toString() {
		return "MyClass";
	}
}//class MyClass {

public class Sub5_sample_8_5_this {

    public static void main(String[] args)
    {
    	System.out.println(
    			new MyClass().toString());
    	
    	// Outer class
    	new MyClass().method1();
    	
	}//public static void main(String[] args)

}//public class Sub5_sample_8_5_this.java {
