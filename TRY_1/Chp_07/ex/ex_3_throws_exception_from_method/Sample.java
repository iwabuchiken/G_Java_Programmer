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
    public static void main(String[] args) {
    	try {
    		MyCalc mc = new MyCalc();
    		mc.check();
    	} catch(Exception e) {
    		System.out.println("Exception!");
    	} finally {
    		System.out.println("Teated!");
    	}
    	System.out.println("Complete!");
    	//System.out.println(a);

    }//public static void main(String[] args)

}//public Test {

class MyCalc {
	void check() throws Exception{
		System.out.println("MyCalc.check()");
		throw new Exception();
	}
	//throws Exception;
}