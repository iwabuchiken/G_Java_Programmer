/************************************`
 * Sub3_Long_and_long.java
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
import java.util.Map;
import java.util.HashMap;

public class Sub3_Long_and_long {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Map					map1
    		= new HashMap();
    	Map<String, Long> 	map2
    		= new HashMap();
    		//= new HashMap<String, Long>();

    	Long				long1; /* Temp variable */

    	/* Set values */
    	map1.put("1", 100);
    	//map2.put("1", 200);
    	long1 = (Long)((long)200);
    	//map2.put("1", (Long)200);
    	map2.put("1", long1);

    	/* Show */
    	System.out.println("map1: "
    			+ map1.get("1")
    			);
    	System.out.println("map2: "
    			+ map2.get("1")
    			);
//    	System.out.printf(
//    			"<System.out.printf: map2: %d>");
//    	System.out.printf("map2: %d"
//    			+ map2.get("1")
//    			);
    	//=> Exception in thread "main"
    	//	java.util.MissingFormatArguentException: Format specifier 'd'
    	System.out.println("map2.get(\"1\").longValue()="
		+ map2.get("1").longValue());

	}//public static void main(String[] args)

}//public class Sub3_Long_and_long {
