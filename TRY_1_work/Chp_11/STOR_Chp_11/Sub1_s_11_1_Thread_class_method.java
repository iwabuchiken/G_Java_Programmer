/************************************`
 * Sub1_s_11_1_Thread_class_method.java
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


public class Sub1_s_11_1_Thread_class_method {

    public static void main(String[] args)
    {
    	/* variables	*/
    	String	mainThreadName	=
    			Thread.currentThread().getName();
    	int		mainPriority	=
    			Thread.currentThread().getPriority();
    	
    	/* display	*/
    	System.out.println(
			"mainThreadName=" + mainThreadName);
    	System.out.println(
			"Current thread priority: " 
			+ mainPriority);
    	
	}//public static void main(String[] args)

}//public class Sub1_s_11_1_Thread_class_method {
