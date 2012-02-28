/************************************`
 * Sub2_sample_13_4_generic_and_standard.java
 * Author: Iwabuchi Ken				*
 * Date: 20120209_090456
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.util.List;
import java.util.ArrayList;

public class Sub2_sample_13_4_generic_and_standard {

    public static void main(String[] args)
    {
    	/* Declare members */
    	List<Integer>	al =
    					new ArrayList<Integer>();
    	List			nl;
    	/* Add a value to al */
    	al.add(new Integer(1));    	
    	
    	// LegacyClass.myAdd
    	nl = new LegacyClass().myAdd(al);
    	
    	// Show nl
    	for (Object obj:nl) {
    		System.out.print(obj);
    		System.out.println(" class="
    				+ obj.getClass().toString());
    	}
    	
	}//public static void main(String[] args)

}//public class Sub2_sample_13_4_generic_and_standard {

//class GenericsClass<T> {
class LegacyClass {
	public List myAdd(List list) {
		list.add("Hi.");
		return list;
	}//public List myAdd() {
}//class LegacyClass {
