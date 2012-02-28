/************************************`
 * Sub13_s_11_10_synchronized.java
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


public class Sub13_s_11_10_synchronized {
	
    public static void main(String[] args) {
    	/* variables
    	 * 1.
    	 * */
    	/* declare			*/
    	FileOperation	fop			=
    			new FileOperation("sub13.dat");
    	
    	/* declare: Runnable	*/
    	MyRunnable11_10	myRunnable	=
//    			new MyRunnable11_10(300);
    			new MyRunnable11_10(300, fop);

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

}//public class Sub13_s_11_10_synchronized {

class MyRunnable11_10 implements Runnable {
	
	/* members	*/
	/* run interval	*/	
	int		interval	= 100;
	/* instances	*/
	int		x, y;
	/* FileOperation instance	*/
	FileOperation fop = null;
	/* message string	*/
	String message = null;
	
	/******************************
	 * constructor
	 * 1. interval only
	 * 2. 1. plus a FileOperation instance 
	 *******************************/
	/* constructor: 1	*/
	MyRunnable11_10(int interval) {
		this.interval	= interval;
	}//MyRunnable11_10()
	
	/* constructor: 2	*/
	MyRunnable11_10(
			int interval, FileOperation fop) {
		this.interval	= interval;
		this.fop		= fop;
	}//MyRunnable11_10()
	
	// override the run method
	
	public synchronized String getXY() {
		/****************
		 * members		
		 ****************/
		/* used to report on the 
		 * operation result	*/
		String	message = null;
		/* return value of 
		 * FileOperation methods	*/
		int		ret;
		
		/*****************
		 *	processes
		 * 1. increment x
		 * 2. sleep
		 * 3. increment y
		 * 4. prepare message
		 * 5. write the message to the file
		 *****************/
		x++;
		/* interval		*/
		try {
			Thread.sleep(interval);			
		} catch(InterruptedException e) {}
		
		y++;		
		
		/* prepare the message	*/
		message = 
			Thread.currentThread().getName()
			+ " :" + " x= " + x + " y= " + y;
		
		/* write to file		*/
		if (fop != null) {
			System.out.println(
				"Opening the stream...");
			ret = fop.open_output_stream();
			if (ret == 1) {
				System.out.println(
					"Writing data...");
				fop.write_data(message);
				System.out.println(
					"Closing the stream...");
				fop.close_output_stream();
			}
		}//if (fop != null)
		
		return " x= " + x + " y= " + y;
//		return message;
	}//public synchronized String getXY()
	
	public void run() {
		/* display the values	*/
		for (int i = 0; i < 5; i++) {
			/* display the message	*/
			System.out.println(
				Thread.currentThread().getName()
				+ " :" + getXY());
		}//for (int i = 0; i < 5; i++)			
	}//public void run()	
}//class MyRunnable11_10 implements Runnable

class FileOperation {
	/* members	*/
	private String	fname;
	private FileOutputStream	fos = null;
	private OutputStreamWriter	osw = null;
	
	/* constructor	*/
	FileOperation(String fname) {
		this.fname	= fname;
	}
	
	/*************************
	 * open_output_stream()
	 * <return>
	 * 	1	=> write successful
	 * 	-1	=> write unsuccessful
	 *************************/
	public int open_output_stream() {
		/* variables			*/
		int		ret;	/* return value	*/
		
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
			ret = 1;			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ret = -1;
		}//try
		
		return ret;
	}//public void open_output_stream()
//	
	/*************************
	 * close_output_stream()
	 * <return>
	 * 	1	=> closing successful
	 * 	-1	=> closing unsuccessful
	 *************************/
	public int close_output_stream() {
		/* variables	*/
		int		ret;	/* return value	*/
		
		/* processes	*/
		try {			
			osw.close();
			System.out.println(
					"Stream closed to: "
					+ fname);
			ret = 1;
    	} catch (IOException e) {
    		e.printStackTrace();
    		ret = -1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ret = -1;
		}
		
		return ret;
	}//public void close_output_stream()
	
	/*************************
	 * write_data()
	 * <return>
	 * 	1	=> write successful
	 * 	-1	=> write unsuccessful
	 *************************/
	public int write_data(String data) {
		/* variables	*/
		int		ret;	/* return value	*/
		
		/* processes	*/
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
			ret = 1;
		} catch (IOException e) {
			e.printStackTrace();
			ret = -1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ret = -1;
			//e.getMessage();
		}//try
		
		return ret;
	}//public void write_data(String data) {
}//class FileOperation
