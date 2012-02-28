/************************************`
 * Sub2_PROGRAM.java
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

public class Sub2_PROGRAM {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Product	p1 = new Product();

    	/* Set values */
    	p1.setPrice("abc", 100);

    	/* Show the price */
    	System.out.println(
    			"p1: price="
    			+ p1.getPrice("abc"));

	}//public static void main(String[] args)

}//public class Sub2_PROGRAM {

class Product {


	/* Declare members */
	private Map priceMap = new HashMap();

	/* Set price */
	public void setPrice(
			String name, long price) {
		priceMap.put(name, price);
	}

	/* Get price */
	public long getPrice(String name) {
		Long price = (Long)priceMap.get(name);
		if (price == null) price = Long.valueOf(0);
		return price.longValue();
	}
}//public class Product {
