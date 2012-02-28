/************************************`
 * Sub2_s_9_4_autoboxing.java
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


public class Sub2_s_9_4_autoboxing {

    public static void main(String[] args)
    {
    	/* variables	*/
    	Integer		i1	= 100;
    	Integer		i2	= 100;
    	int			i3	= 100;
    	int			i4	= 100;
    	Integer		sum	= i1 + i2;
    	Integer		i	= 200;
    	Integer		n1;
    	Integer		n2;
    	
    	/* processes	*/
    	if (i1 == i2)
    		System.out.println("i1 == i2");
    	System.out.println("sum=" + sum);
    	System.out.println("i=" + i);
    	if (sum == i)
    		System.out.println("sum == i");
    	else
    		System.out.println("sum != i");
    	if (i1.equals(i2))
    		System.out.println("i1.equals(i2)");
    	if (sum.equals(i))
    		System.out.println("sum.equals(i)");
    	if (i3 == i1)
//    	if (i3 == i4)
    		System.out.println("i3 == i1");
//    		System.out.println("i3 == i4");
    	if (i3 == i1)
        		System.out.println("i3 == i1");
    	if (i3 == i1.intValue())
    		System.out.println(
    			"i3 == i1.intValue()");
    	System.out.println("<2>");
    	System.out.println(
    		"i1.getClass()" + i1.getClass());
    	
    	/* long type basic data => Integer type	*/
    	System.out.println("<3>");
    	n1 = 100;
    	System.out.println("n1=" + n1);
//    	n2 = 3.4;
//    	=> 互換性のない型
    	
    	
//    	System.out.println(
//        		"i3.getClass()" + i3.getClass());
//    	=> int は間接参照できません。
    	    	
	}//public static void main(String[] args)

}//public class Sub2_s_9_4_autoboxing {
