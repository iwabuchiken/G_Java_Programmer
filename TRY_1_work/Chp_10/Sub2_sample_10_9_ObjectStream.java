/************************************`
 * Sub2_sample_10_9_ObjectStream.java
 * Author: Iwabuchi Ken				*
 * Date: 20120209_090456
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sub2_sample_10_9_ObjectStream {

    public static void main(String[] args)
    {
    	/* Declare members */
    	String	path;
    	File file;
    	
    	/* Initialize 'path' */
    	if (args.length < 1) {
    		System.out.println(
				"args.length=" + args.length);
    		System.out.println(
				"Please input the second argument.");
    		path = "";
    		System.exit(0);
    	}
    	else {
    		path = args[0];
    	}
    	/* File class instance*/
    	try {
			file = new File(path);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			file = new File(".");
			System.exit(0);
		}
    	
    	try {
			/* 
			 * Generate a stream
			 */
    		/* Variables */
			FileOutputStream fos = 
					new FileOutputStream(file);
			ObjectOutputStream oos = 
					new ObjectOutputStream(fos);
			Member	taro = new Member("Taro", "Tokyo", "111");
			Member	hana = new Member("Hana", "Tokyo", "111");
			
			/* Write into file */
			oos.writeObject(taro);
			oos.writeObject(hana);
			
			// Flush and close the file
			oos.flush();
			oos.close();
			fos.close();
			// Report
			System.out.println("Finish writing.");			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
	}//public static void main(String[] args)

}//public class Sub2_sample_10_9_ObjectStream {
