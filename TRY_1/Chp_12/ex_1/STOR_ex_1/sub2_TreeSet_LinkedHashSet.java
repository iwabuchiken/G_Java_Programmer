/************************************`
 * sub2_TreeSet_LinkedHashSet.java
 * Author: Iwabuchi Ken				*
 * Date: 20120205_133224			*
 * Aim:								*
 * 	1. Use a 'TreeSet' instance
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.TreeSet => http://www.tohoho-web.com/java/collection.htm#TreeSet
 *
 ************************************/

//import java.lang.*;
import java.util.TreeSet;	// Class
import java.util.HashSet;	// Class
import java.util.LinkedHashSet;	// Class
import java.util.Iterator;	// Interface
import java.util.Set;		// Interface

public class sub2_TreeSet_LinkedHashSet {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Set			set = new TreeSet();
    	Set			set2 = new HashSet();
    	Set			set3 = new LinkedHashSet();
    	Iterator	it;		/* Set a TreeSet */
    	Iterator	it2;	/* Set a HashSet */
    	boolean		result;	/* Return value of add() */

    	/* Add data */
    	set.add("cc");
    	set.add("aa");
    	set.add("bb");

    	/* Set an iterator */
    	it = set.iterator();

    	/* Show data */
    	while (it.hasNext()) {
    		System.out.println(it.next());
    	}//whie (it.hasNext()) {

    	/******************
    	 * set2
    	 *****************/
    	System.out.println("<set2>");

    	/* Add data */
    	set2.add("cc");
    	set2.add("aa");
    	set2.add("bb");

    	/* Set an iterator */
    	it2 = set2.iterator();

    	/* Show data */
    	while (it2.hasNext()) {
    		System.out.println(it2.next());
    	}//whie (it2.hasNext()) {

    	/******************
    	 * set3: LinkedHashSet
    	 *****************/
    	System.out.println("<set3: LinkedHashSet>");

    	/* Add data */
    	System.out.println("add: cc");
    	result = set3.add("cc");
    	System.out.println("result=" + result);
    	System.out.println("add: aa");
    	result = set3.add("aa");
    	System.out.println("result=" + result);
    	set3.add("bb");
    	set3.add("xx");
    	System.out.println("add: xx");
    	result = set3.add("xx");
    	System.out.println("result=" + result);

    	/* Set an iterator */
    	it = set3.iterator();

    	/* Show data */
    	while (it.hasNext()) {
    		System.out.println(it.next());
    	}//whie (it2.hasNext()) {
    }//public static void main(String[] args)

}//public class sub2_TreeSet_LinkedHashSet {
