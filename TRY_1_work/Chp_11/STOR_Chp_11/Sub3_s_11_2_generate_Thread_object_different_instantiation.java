/************************************`
 * Sub3_s_11_2_generate_Thread_object_different_instantiation.java
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


public class Sub3_s_11_2_generate_Thread_object_different_instantiation {
	
	static int	NUM	= 10;

    public static void main(String[] args)
    {
    	/* variables
    	 * 1. each instance declared in the
    	 * 		individual line
    	 * 2. declared using for block	
    	 * */
    	new MyThread11_2().start();
    	new MyThread11_2().start();
    	new MyThread11_2().start();
    	
    	for (int i = 0; i < 5; i++) {
    		new MyThread11_2().start();
    	}
    	
    	/* the start method of a Thread object
    	 * called => the run method called 
    	 */
    	
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

}//public class Sub3_s_11_2_generate_Thread_object_different_instantiation {

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
		/* display the value of i for Sub3_s_11_2_generate_Thread_object_different_instantiation.NUM times
		 * with 1 second of halt
		 */
		for (int i = 0; i < Sub3_s_11_2_generate_Thread_object_different_instantiation.NUM; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
//			System.out.println("  i(" + id + ") = " + i);
			
//				System.out.println("  i(" + instance_id + ") = " + i);
			for (int k = 0; k < instance_id; k++) {
				System.out.print("-");
			}
			System.out.println(
				"i(" + instance_id + ") = " + i);
		}//for (int i = 0; i < Sub3_s_11_2_generate_Thread_object_different_instantiation.NUM; i++)
		
		/* ending message	*/
		for (int k = 0; k < instance_id; k++) {
			System.out.print("-");
		}
//		System.out.println("  run end.");		
		System.out.println("run end.");
	}//public void run()
	
	/* override: start()	*/
	public void start() {
		System.out.println(
			"start(): id=" + instance_id);
		super.start();
	}
	
}//class MyThread11_2 extends Thread {