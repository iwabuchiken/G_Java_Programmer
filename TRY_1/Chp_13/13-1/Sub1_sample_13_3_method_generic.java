/************************************`
 * Sub1_sample_13_3_method_generic.java
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

public class Sub1_sample_13_3_method_generic {

    public static void main(String[] args)
    {
    	/* Declare members */
    	GenericsClass	obj =
    				new GenericsClass();
    	List<String>	list =
    					new ArrayList<String>();
    	List<String>	list2;
    	int			i;	/* Index */
    	/* Add to the list */
    	obj.myAdd(list);
    	obj.myAdd(list, "Nezikin");
    	/* Initialize a list with the return value
    	 * of the func "myAdd()"
    	 */
    	list2 = obj.myAdd(list, "Jeremiah");
    	
    	/* Show */
    	/* list */
    	for (i = 0; i < list.size(); i++) {
    		System.out.printf(
				//"list[%d]=%s\n", i, list[i]);
    			"list[%d]=%s\n", i, list.get(i));
    	}
    	/* list2 */
    	for (i = 0; i < list2.size(); i++) {
    		System.out.printf(
				//"list2[%d]=%s\n", i, list2[i]);
    			"list2[%d]=%s\n", i, list2.get(i));
    	}

	}//public static void main(String[] args)

}//public class Sub1_sample_13_3_method_generic {

//class GenericsClass<T> {
class GenericsClass {
	public List<String> myAdd(
				List<String> list) {
		list.add("So long.");
		return list;
	}//public List<String> myAdd(
	
	public List<String> myAdd(
			List<String> list, String str ) {
		list.add(str);
		return list;
	}//public List<String> myAdd(
//	public <T> List<String> myAdd(
//			List<String> list, T obj ) {
//		list.add(obj);
//		return list;
//}//public List<String> myAdd(
}//class GenericsClass {
