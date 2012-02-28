/************************************`
 * Sub1_sample_8_1_various_inner_class.java
 * Author: Iwabuchi Ken				*
 * Date: 20120210_083551
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
	class InnerClass1 {
		void disp() {
			System.out.println("InnerClass1");
		}
	}//class InnerClass1 {
	
	// static
	static class InnerClass2 {
//		static void disp() {
		void disp() {
			System.out.println("InnerClass2");
		}//static void disp() {
		
		static void disp2() {
			System.out.println(
					"InnerClass2: disp2()");
			new InnerClass2().disp();
		}
	}
}//class MyClass {

public class Sub1_sample_8_1_various_inner_class {

    public static void main(String[] args)
    {
    	// non-static inner class
    	MyClass.InnerClass1 c1	=
    			new MyClass().new InnerClass1();
    	c1.disp();
    	
    	// static inner class
//    	MyClass.InnerClass2.disp();
    	MyClass.InnerClass2.disp2();
    	
    	// method-local inner class
    	class InnerClass3 {
    		void disp() {
    			System.out.println("InnerClass3");
    		}
    	}//class InnerClass3 {
    	
    	// use method-local inner class
    	InnerClass3	c3 = new InnerClass3();
    	c3.disp();
    	
    	// anonymous class
    	Thread	t = new Thread(new Runnable() {
    		public void run() {
    			System.out.println(
    					"InnerClass4");
    		}
    	});//Thread	t = new Thread(new Runnable() {

    	// use anonymous class
    	t.start();
    	
	}//public static void main(String[] args)

}//public class Sub1_sample_8_1_various_inner_class {
