/************************************`
 * sub1_HashSet.java
 * Author: Iwabuchi Ken				*
 * Date: 20120205_133224			*
 * Aim:								*
 * 	1. Use a 'HashSet' instance
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 *									*
 ************************************/

//import java.lang.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sub1_HashSet {

    public static void main(String[] args)
    {
    	Set		set = new HashSet();
    	Integer	favorite_number = new Integer(232);

    	/* Set values into the set */
    	set.add("Hello.");			/* String */
    	set.add(favorite_number);	/* Integer */

    	/* Get an iterator from a Hashset object */
    	Iterator ite = set.iterator();

    	/* Get an element from the iterator */
    	while (ite.hasNext()) {
    		Object obj = ite.next();
    		/* String */
    		if (obj instanceof String) {
    			System.out.println((String)obj + "(String)");
			/* Integer */
    		} else if (obj instanceof Integer) {
    			System.out.println((Integer)obj + "(Integer)");
    		}
    	}

    }//public static void main(String[] args)

}//public class sub1_ex_1 {
