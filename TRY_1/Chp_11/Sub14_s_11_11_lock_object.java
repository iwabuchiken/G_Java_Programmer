/************************************`
 * Sub14_s_11_11_lock_object.java
 * Author: Iwabuchi Ken				*
 * Date: 20120229_075122
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.*;


public class Sub14_s_11_11_lock_object {
	
    public static void main(String[] args) {
    	/* variables
    	 * 1.
    	 * */
    	/* declare			*/
    	final MyBasket	basket	= new MyBasket();
    	
    	// Thread 1: Set the values on the object
    	new Thread() {
    		public void run() {
    			// Thread process
    			try {
					sleep(1000);
				} catch (InterruptedException e) {}//try
				
    			// object
				basket.set(100, 5);
				System.out.println("Values set.");

//    			synchronized(basket) {
//					basket.set(100, 5);
//					System.out.println("Values set.");
//				}
    		}//public void run()
    	}.start();//new Thread()
    	
    	// Thread 2: Get values from the object, calc the total
    	new Thread() {
    		public void run() {
    			try {
					sleep(1500);
				} catch (InterruptedException e) {}//try
    			
    			// the object
    			synchronized(basket) {
    				System.out.println(basket.calc());
    			}
    		}
    	}.start();//new Thread() {
    	
	}//public static void main(String[] args)

}//public class Sub14_s_11_11_lock_object {

class MyBasket {
	
	/* members	*/
	private long		price			= 0;	/* price	*/
	private int		quantity	= 0;	/* number		*/
	
	// method: setup the price and the quantity
	public void set(long price, int quantity) {
		this.price	= price;
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		this.quantity		= quantity;
	}//public void set(long price, int quantity)
	
	// method: return the result of calc
	public String calc() {
		long		total		= price * quantity;
		return "Price: " + price + "Yen X " + quantity + " Unit(s) = "
				+ total;
	}
		
}//class MyBasket
