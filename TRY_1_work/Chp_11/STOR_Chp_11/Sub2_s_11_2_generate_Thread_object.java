/************************************`
 * Sub2_s_11_2_generate_Thread_object.java
 * Author: Iwabuchi Ken				*
 * Date: 20120212_071729
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.*;


public class Sub2_s_11_2_generate_Thread_object {
	
	static int	NUM	= 10;

    public static void main(String[] args)
    {
    	/* variables	*/
    	MyThread11_2	thread =
    			new MyThread11_2();
    	MyThread11_2	thread2 =
    			new MyThread11_2();
    	MyThread11_2	thread3 =
    			new MyThread11_2();
    	
    	/* the start method of a Thread object
    	 * called => the run method called 
    	 */
    	thread.start();
    	thread2.start();
    	thread3.start();
    	
    	/* display the value of j for NUM
    	 * times, with 1second of halt
    	 */
    	for (int j = 0; j < NUM; j++) {
    		try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}//try
    		System.out.println("j = " + j);
    	}//for (int j = 0; j < NUM; j++)
    	System.out.println("main end.");    	
	}//public static void main(String[] args)

}//public class Sub2_s_11_2_generate_Thread_object {

class MyThread11_2 extends Thread {
	
	/* members
	 * 1. class_id:int	=> id for the entire class
	 * 2. instance_id:int	
	 * 		=> id for each instance
	 * */
	private static int	class_id = 0;
	private int	instance_id;
	
	/* constructor
	 * 1. set instance_id using class_id
	 * 2. class_id => increment
	 * */
	MyThread11_2() {
		this.instance_id = this.class_id;
		this.class_id ++;
//		this.id ++;
	}
	
	// override the run method
	public void run() {
		/* display the value of i for Sub2_s_11_2_generate_Thread_object.NUM times
		 * with 1 second of halt
		 */
		for (int i = 0; i < Sub2_s_11_2_generate_Thread_object.NUM; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
//			System.out.println("  i(" + id + ") = " + i);
			System.out.println("  i(" + instance_id + ") = " + i);
		}//for (int i = 0; i < Sub2_s_11_2_generate_Thread_object.NUM; i++)
		System.out.println("  run end.");		
	}//public void run()	
}//class MyThread11_2 extends Thread {