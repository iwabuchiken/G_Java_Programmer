/************************************`
 * Sub1_generics_set.java
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
import java.util.Set;
import java.util.HashSet;

public class Sub1_generics_set {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Set			set1	= new HashSet();
    	Set<String>	set2	= new HashSet();

    	/* set values */
    	set1.add("yes");
    	set2.add("yes");

    	set1.add("also");
    	//set2.add(123);
    	//=> ƒVƒ“ƒ{ƒ‹‚ğŒ©‚Â‚¯‚ç‚ê‚Ü‚¹‚ñB

    	/* Show values */
    	/* set1 */
    	System.out.println("<set1>");
    	for (Object obj:set1) {
    		System.out.println(obj + " ");
    	}
    	System.out.println(
    			"size=" + set1.size());

    	/* set2 */
    	System.out.println("<set2>");
    	for (Object obj:set2) {
    		System.out.println(obj + " ");
    	}
    	System.out.println(
    			"size=" + set2.size());

	}//public static void main(String[] args)

}//public class Sub1_generics_set {
