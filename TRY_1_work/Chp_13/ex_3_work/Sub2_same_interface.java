/************************************`
 * Sub2_same_interface.java
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

public class Sub2_same_interface {

    public static void main(String[] args)
    {
    	/* Declare members */
//    	List<Banana> list =
//    			new ArrayList<Apple>();
    	Banana b1 = new Apple();


	}//public static void main(String[] args)

}//public class Sub2_same_interface {

class Banana implements Horticulture {}

class Apple implements Horticulture {}
class Apple extends Banana implements Horticulture {}

interface Horticulture {
	String s1 = "abc";
}