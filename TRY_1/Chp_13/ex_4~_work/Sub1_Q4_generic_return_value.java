/************************************`
 * Sub1_Q4_generic_return_value.java.java
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

public class Sub1_Q4_generic_return_value {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Fruit fruit1 = new Fruit();


    	/* Set values */

    	/* Show */
    	System.out.println((String)fruit1.func1());

	}//public static void main(String[] args)

}//public class Sub1_Q4_generic_return_value.java {

class Fruit<T> {
	public Object func1() {
		String s = "abc";
		return s;
	}

//	public <C extends Fruit> void func(Object<? extends C> obj) {
//		System.out.println(obj instanceof MacIntosh);
//	}

}

class Apple extends Fruit {}
class MacIntosh extends Apple {
	String name = "MacIntosh";
	private void show() {
		System.out.println("MacIntosh");
	}
}
