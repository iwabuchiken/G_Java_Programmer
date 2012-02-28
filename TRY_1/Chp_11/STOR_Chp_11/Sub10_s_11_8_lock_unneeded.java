/************************************`
 * Sub10_s_11_8_lock_unneeded.java
 * Author: Iwabuchi Ken				*
 * Date: 20120222_073908
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.*;


public class Sub10_s_11_8_lock_unneeded {
	
	static int	NUM	= 3;

    public static void main(String[] args) {
    	/* variables
    	 * 1.
    	 * */
    	
    	/* processes
    	 * 1.
    	 */
    	/* thread start	*/
    	new Thread(new MyRunnable11_8(300)).start();
    	new Thread(new MyRunnable11_8(500)).start();
    	/* yield			*/
    	Thread.yield();
   	
    	/* display the value of j
    	 * for 5 times with 1 second halt
    	 */
    	for (int j = 0; j < 5; j++) {
    		try {
    			Thread.sleep(1000);
    		} catch (InterruptedException e) {}
    		System.out.println("j= " + j);
    	}//for (int j = 0; j < 5; j++)
    	System.out.println("main end.");
    	
	}//public static void main(String[] args)

}//public class Sub10_s_11_8_lock_unneeded {

class MyRunnable11_8 implements Runnable {
	
	/* members	*/
	/* run interval	*/	
	int		interval	= 100;
	/* instances	*/
	int		x, y;
	
	/* constructor
	 * 1. 
	 * */
	MyRunnable11_8(int interval) {
		this.interval	= interval;
	}//MyRunnable11_8()
	
	// override the run method
	public void run() {
		/* 
		 */
		for (int i = 0; i < 5; i++) {
			x ++;
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			y ++;
			/* message	*/
			System.out.println(
				Thread.currentThread().getName() 
				+ ": x=" + x 
				+ " y=" + y);
		}//for (int i = 0; i < 5; i++)
		System.out.println("  run end.");		
	}//public void run()	
}//class MyRunnable11_8 implements Runnable