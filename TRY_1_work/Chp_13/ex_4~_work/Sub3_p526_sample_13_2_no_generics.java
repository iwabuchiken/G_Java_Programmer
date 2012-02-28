/************************************`
 * Sub3_p526_sample_13_2_no_generics.java
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
import java.util.ArrayList;

public class Sub3_p526_sample_13_2_no_generics {

    public static void main(String[] args)
    {
    	/* Declare members */
    	ArrayList list = new ArrayList();

    	/* Add elements */
    	list.add("Tom");
    	list.add("Jiabin");
    	list.add("Mohican");
    	list.add(new Integer(1));

    	/* Show */
//    	for (String s: list) {
//    		Sub3_p526_sample_13_2_no_generics.java:30: å›ä∑ê´ÇÃÇ»Ç¢å^
//    		åüèoíl  : java.lang.Object
//    		ä˙ë“íl  : java.lang.String
//    		        for (String s: list) {
//    		                       ^
    	for (Object s: list) {
    		
    		//System.out.println(s);
    		//System.out.println((String)s);
//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer canno
//t be cast to java.lang.String
//        at Sub3_p526_sample_13_2_no_generics.main(Sub3_p526_sample_13_2_no_gener
//ics.java:38)

    	}

	}//public static void main(String[] args)

}//public class Sub3_p526_sample_13_2_no_generics {
