/************************************`
 * Sub6_sample_8_6_inner_class_method.java
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
	static int	count = 0;
	// non-static inner class
	class MyInnerClass {
		
		void disp() {
			MyClass.count += 1;
			System.out.println(
					"MyInnerClass instantiated"
					+ ": " + count);		
		}//void disp() {		
	}//class MyInnerClass {
}//class MyClass {

public class Sub6_sample_8_6_inner_class_method {

    public static void main(String[] args)
    {
    	// format 1
    	MyClass	mi = new MyClass();
    	MyClass.MyInnerClass	myi =
    				mi.new MyInnerClass();
    	
    	myi.disp();
    	
    	// format 2
    	MyClass.MyInnerClass	myi2 =
    			new MyClass().new MyInnerClass();
    	myi2.disp();

    	// format 3
    	new MyClass().new MyInnerClass().disp();
    	
	}//public static void main(String[] args)

}//public class Sub6_sample_8_6_inner_class_method {
