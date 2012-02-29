/************************************`
 * Sub17_s_11_14_deadlock.java
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


public class Sub17_s_11_14_deadlock {
	
    public static void main(String[] args) {
    	/* variables			*/
    	final String		s1	= new String("Hi.");
    	final String		s2	= new String("Bye.");
    	
    	/* threads start: Thread 1	*/
    	new Thread() {
    		public void run() {
    			/* lock: s1		*/
        		synchronized(s1) {
        			System.out.println(Thread.currentThread().getName() + " : Start the lock" + s1);
        			try {
    					Thread.sleep(1000);
    				} catch (Exception e) {
    					// TODO: handle exception
    				}
        			
        			/* lock: s2		*/
        			synchronized(s2) {
        				System.out.println(Thread.currentThread().getName() + " : Start the lock" + s2);
        			}//synchronized(s2)
        			System.out.println(Thread.currentThread().getName() + " : Release the lock" + s2);
        		}//synchronized(s1)
        		System.out.println(Thread.currentThread().getName() + " : Release the lock" + s1);    			
    		}//public void run()
    	}.start();//new Thread()    	

    	/* threads start: Thread 2	*/
    	new Thread() {
    		public void run() {
    			/* lock: s1		*/
        		synchronized(s1) {
        			System.out.println(Thread.currentThread().getName() + " : Start the lock" + s1);
        			try {
//    					Thread.sleep(1000);
    				} catch (Exception e) {
    					// TODO: handle exception
    				}
        			
        			/* lock: s2		*/
        			synchronized(s2) {
        				System.out.println(Thread.currentThread().getName() + " : Start the lock" + s2);
        			}//synchronized(s2)
        			System.out.println(Thread.currentThread().getName() + " : Release the lock" + s2);
        		}//synchronized(s1)
        		System.out.println(Thread.currentThread().getName() + " : Release the lock" + s1);    			
    		}//public void run()
    	}.start();//new Thread()

//    	/* threads start: Thread 2	*/
//    	new Thread() {
//    		public void run() {
//    			/* lock: s1		*/
//        		synchronized(s2) {
//        			System.out.println(Thread.currentThread().getName() + " : Start the lock" + s2);
//        			try {
////    					Thread.sleep(1000);
//    				} catch (Exception e) {
//    					// TODO: handle exception
//    				}
//        			
//        			/* lock: s1		*/
//        			synchronized(s1) {
//        				System.out.println(Thread.currentThread().getName() + " : Start the lock" + s1);
//        			}//synchronized(s1)
//        			System.out.println(Thread.currentThread().getName() + " : Release the lock" + s1);
//        		}//synchronized(s2)
//        		System.out.println(Thread.currentThread().getName() + " : Release the lock" + s2);    			
//    		}//public void run()
//    	}.start();//new Thread()

    }//public static void main(String[] args)

}//public class Sub17_s_11_14_deadlock {
