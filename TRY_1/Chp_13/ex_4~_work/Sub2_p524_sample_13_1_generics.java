/************************************`
 * Sub2_p524_sample_13_1_generics.java
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
import java.util.ArrayList;

public class Sub2_p524_sample_13_1_generics {

    public static void main(String[] args)
    {
    	/* Declare members */
    	ArrayList<String> list =
    			new ArrayList<String>();

    	/* Add elements */
    	list.add("Tom");
    	list.add("Jiabin");
    	list.add("Mohican");
    	//list.add(new Integer(1));
//    	Sub2_p524_sample_13_1_generics.java:28: シンボルを見つけられません。
//    	シンボル: メソッド add(java.lang.Integer)
//    	場所    : java.util.ArrayList<java.lang.String> の クラス
//    	        list.add(new Integer(1));
//    	            ^

    	/* Show */
    	for (String s: list) {
    		System.out.println(s);
    	}

	}//public static void main(String[] args)

}//public class Sub2_p524_sample_13_1_generics {
