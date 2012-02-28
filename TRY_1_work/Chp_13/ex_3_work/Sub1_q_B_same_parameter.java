/************************************`
 * Sub1_q_B_same_parameter.java
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
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.lang.Object;

public class Sub1_q_B_same_parameter {

    public static void main(String[] args)
    {
    	/* Declare members */
//    	List<Apple>	list = new ArrayList<Fruit>();
    	//=> å›ä∑ê´ÇÃÇ»Ç¢å^
    	/* Choice: C */
//    	List<Object> list = new ArrayList<Fruit>();

    	/* Choice: E */
//    	List<Fruit> list = new ArrayList<? super Apple>();
    	//=> ó\ä˙ÇµÇ»Ç¢å^

    	/* Choice: F */
    	List<? super Apple> list =
				new ArrayList<Fruit>();

    	/* Choice: G */
    	List<? extends Serializable> list2 =
				new ArrayList<String>();

    	/* Choice: H */
    	List<?> list3 = new ArrayList();

    	/* Choice: I */
//    	List<? extends Fruit> list4 =
//    			new ArrayList<Object>();

    	/* Choice: J */
//    	List<Apple> list5 = new ArrayList();
    	//=> åxçê:[unchecked] ñ≥åüç∏ïœä∑Ç≈Ç∑

    	/* Choice: K */
    	List list6 = new ArrayList<Apple>();

    	/* Set values */

    	/* Show */

	}//public static void main(String[] args)

}//public class Sub1_q_B_same_parameter {

class Fruit {}

class Apple extends Fruit {}
