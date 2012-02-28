/************************************`
 * Sub1_s_9_3_wrapper_class.java
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


public class Sub1_s_9_3_wrapper_class {

    public static void main(String[] args)
    {
    	/* variables	*/
    	int		i1	= Integer.parseInt(args[0]);
    	int		i2	= Integer.parseInt(args[1]);
    	int		sum	= i1 + i2;    	
    	String	s1	= Integer.toBinaryString(i1);
    	String	s2	= Integer.toBinaryString(i2);
    	String	sSum	= 
    				Integer.toBinaryString(sum);
    	
    	/* display	*/
    	System.out.println(
    			i1 + "=> binary is: " + s1);
    	System.out.println(
    			i2 + "=> binary is: " + s2);
    	System.out.println(
    			i1 + "+" + i2 + 
    			"=> binary is: " + sSum);
    	
	}//public static void main(String[] args)

}//public class Sub1_s_9_3_wrapper_class {
