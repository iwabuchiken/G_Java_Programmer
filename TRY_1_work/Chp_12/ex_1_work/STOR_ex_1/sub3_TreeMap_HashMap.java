/************************************`
 * sub3_TreeMap_HashMap.java
 * Author: Iwabuchi Ken				*
 * Date: 20120207_110637
 * Aim:								*
 * 	1. Use a 'TreeMap' instance
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.TreeSet => http://www.tohoho-web.com/java/collection.htm#TreeSet
 *
 ************************************/

//import java.lang.*;
import java.util.Map;
import java.util.TreeSet;	// Class
import java.util.TreeMap;	// Class
import java.util.HashMap;	// Class
import java.util.HashSet;	// Class
import java.util.LinkedHashSet;	// Class
import java.util.Iterator;	// Interface
import java.util.Set;		// Interface
import java.util.Map;		// Interface

public class sub3_TreeMap_HashMap {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Map			map = new TreeMap();
    	Map			map2 = new HashMap();
    	Iterator	it;		/* Set a TreeSet */
    	boolean		result;	/* Return value of add() */
    	String		result_s;/* Return value of add():
    							String type */

    	/***************
    	 * TreeMap
    	 ***************/

    	/* Add data */
    	map.put("1", "abc");
    	map.put("3", "ghi");
    	map.put("2", "def");

    	/* Set an iterator */
    	it = map.keySet().iterator();

    	/* Show data */
    	while (it.hasNext()) {
    		Object o = it.next();
    		System.out.println(
    				//"it.next()=" + it.next()
    				"it.next()=" + o
    				+ " " + "map.get(it.next)="
    				+ map.get(o));
    		//System.out.println(it.next());
    	}//whie (it.hasNext()) {

    	/******************
    	 * HashMap
    	 *****************/
    	System.out.println("<HashMap>");
    	/* Add data */
    	map2.put("1", "abc");
    	map2.put("3", "ghi");
    	map2.put("2", "def");

    	/* Set an iterator */
    	it = map2.keySet().iterator();

    	/* Show data */
    	while (it.hasNext()) {
    		Object o = it.next();
    		System.out.println(
    				//"it.next()=" + it.next()
    				"it.next()=" + o
    				+ " " + "map.get(it.next)="
    				+ map.get(o));
    		//System.out.println(it.next());
    	}//whie (it.hasNext()) {

    }//public static void main(String[] args)

}//public class sub3_TreeMap {
