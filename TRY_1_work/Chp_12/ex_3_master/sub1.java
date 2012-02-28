/************************************`
 * sub5_LinkedList.java
 * Author: Iwabuchi Ken				*
 * Date: 20120207_110637
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class sub5_LinkedList {

    public static void main(String[] args)
    {
    	/* Declare members */
    	List	list = new LinkedList();
    	Iterator	it;

    	/* Set values */
    	list.add("aa");
    	list.add("cc");
    	list.add("aa");
    	list.add("dd");

    	/* Initialize an iterator */
    	it = list.iterator();

    	/* Show variables */
    	for (int i = 0; i < list.size(); i++) {
    		System.out.printf("list[%d]=", i);
    		System.out.println(list.get(i));
    	}


	}//public static void main(String[] args)

}//public class sub5_LinkedList {
