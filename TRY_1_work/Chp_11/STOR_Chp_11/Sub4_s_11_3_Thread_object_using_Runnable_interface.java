/************************************`
 * Sub4_s_11_3_Thread_object_using_Runnable_interface.java
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


public class Sub4_s_11_3_Thread_object_using_Runnable_interface {
	
	static int	NUM	= 3;

    public static void main(String[] args)
    {
    	/* variables
    	 * 1. each instance declared in the
    	 * 		individual line
    	 * */
    	
    	/* 1. named instance	*/
    	Thread	thread	=
			new Thread(new MyRunnable11_3());
    	
    	/* thread starts	*/
    	thread.start();
    	
    	/* 2. anonymous instance	*/
    	for (int k = 0; k < NUM; k++) {
    		new Thread(new MyRunnable11_3())
    			.start();
    	}
    	
//    	new MyThread11_2().start();
//    	new MyThread11_2().start();
//    	new MyThread11_2().start();
//    	
//    	for (int i = 0; i < 5; i++) {
//    		new MyThread11_2().start();
//    	}
    	
    	/* the start method of a Thread object
    	 * called => the run method called 
    	 */
    	
    	/* processes
    	 * 1. display the value of j
    	 * 
    	 */
    	
    	/* 1. display the value of j for NUM
    	 * 		times, with 1second of halt
    	 * 2. display: MyRunnable11_3.class_id
    	 * 3. try: re-start the thread object
    	 */
    	for (int j = 0; j < NUM; j++) {
    		try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}//try
    		System.out.println("j = " + j);
    	}//for (int j = 0; j < NUM; j++)
    	System.out.println("main end.");
    	
    	/* 2. display: MyRunnable11_3.class_id	*/    	
    	System.out.println(
    		"new MyRunnable11_3().getClassID()=" 
    		+ new MyRunnable11_3().getClassID());
    	
    	/* 3. try: re-start the thread object	*/
    	//thread.start();
    	//=> Exception in thread "main" java.lang.IllegalThreadStateException
    	
	}//public static void main(String[] args)

}//public class Sub4_s_11_3_Thread_object_using_Runnable_interface {

class MyRunnable11_3 implements Runnable {
	
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
	MyRunnable11_3() {
		this.instance_id = this.class_id;
		this.class_id ++;
//		this.id ++;
	}
	
	// override the run method
	public void run() {
		/* display the value of i for Sub4_s_11_3_Thread_object_using_Runnable_interface.NUM times
		 * with 1 second of halt
		 */
		for (int i = 0; i < Sub4_s_11_3_Thread_object_using_Runnable_interface.NUM; i++) {
			/* thread sleep	*/
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}

			/* display leader '-'	*/
			for (int k = 0; k < instance_id; k++) {
				System.out.print("-");
			}
			
			/* display the value	*/
			System.out.println(
				"i(" + instance_id + ") = " + i);
		}//for (int i = 0; i < Sub4_s_11_3_Thread_object_using_Runnable_interface.NUM; i++)
		
		/* ending message	*/
		for (int k = 0; k < instance_id; k++) {
			System.out.print("-");
		}
		System.out.println("run end.");
	}//public void run()
	
	/* class method: getClassID()	*/
	public int getClassID() {
		return this.class_id;
	}
	/* override: start()	*/
//	public void start() {
//		System.out.println(
//			"Start: Runnable-" + instance_id);
//		
//	}
	
}//class MyRunnable11_3 implements Runnable