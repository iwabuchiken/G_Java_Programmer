/************************************`
 * Sub2_sample_8_2_non_static_inner_class.java
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
	// non-static inner class
	class MyInnerClass {
		void disp() {
			System.out.println(
					"An instance method of " +
					"InnerClass in MyClass");
		}
	}//class MyInnerClass {
	
	// a method of the class
	void method1() {
		// instantiate
		MyInnerClass myi	= new MyInnerClass();
		myi.disp();
		new MyInnerClass().disp();
	}
}//class MyClass {

public class Sub2_sample_8_2_non_static_inner_class {

    public static void main(String[] args)
    {
    	MyClass	myc = new MyClass();
    	myc.method1();
    	
    	new MyClass().method1();
    	
	}//public static void main(String[] args)

}//public class Sub2_sample_8_2_non_static_inner_class {
