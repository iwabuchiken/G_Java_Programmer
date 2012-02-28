/************************************`
 * Sample.java
 * Author: Iwabuchi Ken				*
 * Date: 20120205_133224			*
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 *									*
 ************************************/

public class Sample {

	static boolean test() { return false; }
	//static boolean test() { return true; }

    public static void main(String[] args) {
    	assert test() : "Error!";
    	System.out.println("Test!!!!");
    }

}//public Test {
