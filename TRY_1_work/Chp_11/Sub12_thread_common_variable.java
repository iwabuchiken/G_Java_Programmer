/************************************`
 * Sub12_thread_common_variable.java
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


public class Sub12_thread_common_variable {
	
    public static void main(String[] args) {
    	/* variables
    	 * 1.
    	 * */
    	/* declare			*/
    	FileOperation	fop			=
    			new FileOperation("sub12.dat");
    	
    	/* declare: Runnable	*/
    	MyRunnable11_8	myRunnable	=
//    			new MyRunnable11_8(300);
    			new MyRunnable11_8(300, fop);

//    	/* open file		*/
//    	fop.open_output_stream();
//    	
//    	/* close file		*/
//    	fop.close_output_stream();
    	
    	/* generate threads	*/
    	new Thread(myRunnable).start();
    	new Thread(myRunnable).start();
    	
    	/* join			*/
    	
	}//public static void main(String[] args)

}//public class Sub12_thread_common_variable {

class MyRunnable11_8 implements Runnable {
	
	/* members	*/
	/* run interval	*/	
	int		interval	= 100;
	/* instances	*/
	int		x, y;
	/* FileOperation instance	*/
	FileOperation fop = null;
	/* message string	*/
	String message = null;
	
	/* constructor
	 * 1. interval only
	 * 2. 1. plus a FileOperation instance 
	 * */
	MyRunnable11_8(int interval) {
		this.interval	= interval;
	}//MyRunnable11_8()
	
	/* constructor: 2	*/
	MyRunnable11_8(
			int interval, FileOperation fop) {
		this.interval	= interval;
		this.fop		= fop;
	}//MyRunnable11_8()
	
	// override the run method
	public void run() {
		/* members	*/
		int		ret;	/* return of write_date()	*/
		
		/* 
		 */
		for (int i = 0; i < 5; i++) {
			x ++;
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			y ++;
			/* message	*/
			message = Thread.currentThread().getName() 
					+ ": x=" + x 
					+ " y=" + y;
			System.out.println(message);
			System.out.println(
				Thread.currentThread().getName() 
				+ ": x=" + x 
				+ " y=" + y);
			/* write to file	*/
			fop.open_output_stream();
			fop.write_data(message);
			fop.close_output_stream();
//			if (fop != null) {
//				ret = fop.write_data(message);
//				if (ret == 1) {
//					System.out.println(
//						"message written to file: "
//						+ message);
//				} else if (ret == -1) {
//					System.out.println(
//						"seems error.");
//				}
//			}//if (fop != null)
		}//for (int i = 0; i < 5; i++)
		System.out.println("  run end.");		
	}//public void run()	
}//class MyRunnable11_8 implements Runnable

class FileOperation {
	/* members	*/
	private String	fname;
	private FileOutputStream	fos = null;
	private OutputStreamWriter	osw = null;
	
	/* constructor	*/
	FileOperation(String fname) {
		this.fname	= fname;
	}
	
	public void open_output_stream() {
		/* open the file stream	*/
		try {
			/* methods		*/
//			fos = new FileOutputStream(fname);
			fos = new FileOutputStream(fname, true);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}//try
		
		/* open the output stream	*/
		try {
			osw = new OutputStreamWriter(fos);
			System.out.println("Stream opened");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}//try
	}//public void open_output_stream()
//		
	public void close_output_stream() {
		try {			
			osw.close();
			System.out.println(
					"Stream closed to: "
					+ fname);
    	} catch (IOException e) {
    		e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}//public void close_output_stream()
	
	/* write_data()
	 * <return>
	 * 	1	=> write successful
	 * 	-1	=> write unsuccessful
	 */
	public int write_data(String data) {
		if (osw == null) {
			System.out.println(
				"osw is null. " +
				"Please open the stream");
			/* return unsuccessful	*/
			return -1;
		}//if (osw == null)
		
		/* write data	*/
		try {						
			osw.write(data);
			osw.write("\n");
			/* return successful	*/
			return 1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
			//e.getMessage();
		}//try
	}//public void write_data(String data) {
}//class FileOperation
