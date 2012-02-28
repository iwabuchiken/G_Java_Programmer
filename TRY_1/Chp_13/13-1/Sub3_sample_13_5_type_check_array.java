/************************************`
 * Sub3_sample_13_5_type_check_array.java
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
import java.lang.Integer;
import java.lang.Object;

public class Sub3_sample_13_5_type_check_array {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Integer[]	i = new Integer[2];
    	Object[] ni;
    	
    	/* Add a value to al */
    	i[0] = new Integer(1);
    	// LegacyArrayClass.myAdd
    	ni = new LegacyArrayClass().myAdd(i);
    	
    	// Show ni
    	for (Object obj:ni) {
    		System.out.print(obj);
    	}
    			
	}//public static void main(String[] args)

}//public class Sub3_sample_13_5_type_check_array {

//class GenericsClass<T> {
class LegacyArrayClass {
//	public <String> Object[] myAdd(Object[] array) {
	public Object[] myAdd(Object[] array) {
//		Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
//        at LegacyArrayClass.myAdd(Sub3_sample_13_5_type_check_array.java:44)
//        at Sub3_sample_13_5_type_check_array.main(Sub3_sample_13_5_type_check_ar
//        ray.java:30)

		array[1] = "Hi.";
		return array;
	}//public List myAdd() {
}//class LegacyClass {
