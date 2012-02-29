/************************************`
 * Sub15_s_11_12_static_variable.java
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


public class Sub15_s_11_12_static_variable {
	
    public static void main(String[] args) {
    	/* variables			*/
    	new Thread(new MyRunnable11_12(300)).start();
    	new Thread(new MyRunnable11_12(500)).start();
    	
	}//public static void main(String[] args)

}//public class Sub15_s_11_12_static_variable {

class MyRunnable11_12 implements Runnable {
	/* variables	*/
	int				interval		= 100;	/* sleep interval		*/
//	static	int	x, y;		/* static variables		*/
	int	x, y;		/* static variables		*/
	
	// constructor
	MyRunnable11_12(int interval) {
		this.interval	= interval;
		// show: initial interval value
		System.out.println("Initial interval=" + interval);
		
	}//MyRunnable11_12(int interval)
	
	public void run() {
		// display 5 times the value of x and y
		for (int i = 0; i < 5; i++) {
			x++;
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			/* increment: y		*/
			y++;
			System.out.println(Thread.currentThread().getName() + " : x= " + x + " y= " + y);
		}//for (int i = 0; i < 5; i++)
	}//public void run()
}//class MyRunnable11_12 implements Runnable
