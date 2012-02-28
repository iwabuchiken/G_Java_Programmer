/************************************`
 * Sub2_StackTraceElement.java
 * Author: Iwabuchi Ken				*
 * Date: 20120208_075347
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.lang.StackTraceElement;
import java.lang.Throwable;

public class Sub2_StackTraceElement {

    public static void main(String[] args)
    {
    	/* Declare members */
    	StackTraceElement[] elems;
    	StackTraceElement elem;

    	/* Get an element */
    	try {
    		throw new Exception();
    	} catch (Exception ex) {
    		elems = ex.getStackTrace();
    	}

    	/* Show info */
    	System.out.println(elems.length);
    	System.out.println(elems[0].getLineNumber());
//    	System.out.println(
//    			new Throwable().getStackTrace()[1]
//    				.getFileName());
    	System.out.println(
    			new Throwable().getStackTrace()[0]
    				.getFileName());

	}//public static void main(String[] args)

}//public class Sub2_StackTraceElement {
