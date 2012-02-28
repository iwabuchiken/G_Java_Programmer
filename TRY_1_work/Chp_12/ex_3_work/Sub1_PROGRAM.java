/************************************`
 * Sub1_PROGRAM.java
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
import java.util.TreeMap;
import java.util.Map;

public class Sub1_PROGRAM {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Map		map		= new TreeMap();

    	/* set values */
    	map.put("3", "Three");
    	map.put("1", "One");
    	map.put(2, "Two");

    	//debug
    	System.out.println("DEBUG");

    	/* Show values */
    	for (Object obj:map.values()) {
    		System.out.println(obj + " ");
    	}

	}//public static void main(String[] args)

}//public class Sub1_PROGRAM {
