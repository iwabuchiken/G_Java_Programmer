/************************************`
 * Sub16_s_11_13_lock_static_variable.java
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


public class Sub16_s_11_13_lock_static_variable {
	
    public static void main(String[] args) {
    	/* variables			*/
    	MyRunnable11_13	myRunnable		= new MyRunnable11_13();
    	
    	/* start threads		*/
    	new Thread(myRunnable	).start();
    	new Thread(myRunnable	).start();
    	
	}//public static void main(String[] args)

}//public class Sub16_s_11_13_lock_static_variable {

class MyRunnable11_13 implements Runnable {
	/* variables	*/
	static int		interval		= 100;	/* sleep interval		*/
	static int		x, y;						/* static variables		*/
	
	public static String getXY() {
		synchronized(MyRunnable11_13.class) {
			x++;
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			y++;
			return " x= " + x + " y=" + y;
		}
	}//public static String getXY()
	
	public void run() {
		// display 5 times the value of x and y
		for (int i = 0; i < 5; i++) {			
			System.out.println(Thread.currentThread().getName() + " :" + getXY());
		}//for (int i = 0; i < 5; i++)
	}//public void run()
}//class MyRunnable11_12 implements Runnable
