/************************************`
 * Sub5_s_11_4_Thread_object_using_Runnable_inner_class.java
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


public class Sub5_s_11_4_Thread_object_using_Runnable_inner_class {
	
	/* members	*/
	static int	NUM	= 13;
	
    public static void main(String[] args)
    {
    	/* variables
    	 * 1. thread
    	 * */
    	Thread	thread	= 
    		new Thread(new Runnable(){
				public void run() {
					/* one second of halt,
					 * display 5 times
					 */
					for (int i = 0; i < 5; i++) {
						/* thread sleep	*/
						try{
							Thread.sleep(1000);
						} catch(InterruptedException e) {}

						/* display the value	*/
						System.out.println(
							"  i = " + i);
					}//for (int i = 0; i < 5; i++)
					System.out.println("  run end.");
				}//public void run() {
		});//Thread	thread	=
    	
    	/* thread starts	*/
    	thread.start();
    	
    	/* thread of 'main' method:
    	 * 	display 5 times
    	 */
    	for (int j = 0; j < NUM; j++) {
    		try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}//try
    		System.out.println("j = " + j);
    	}//for (int j = 0; j < NUM; j++)
    	System.out.println("main end.");    	

	}//public static void main(String[] args)

}//public class Sub5_s_11_4_Thread_object_using_Runnable_inner_class {
