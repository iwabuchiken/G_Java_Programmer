/************************************`
 * Sub3_sample_10_10_read_object.java
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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.lang.reflect.Member;

public class Sub3_sample_10_10_read_object {

    public static void main(String[] args)
    {
    	/* Declare members */
    	String	path;
    	File file;
    	FileInputStream fis;
    	
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
			fis = new FileInputStream(file);
			ObjectInputStream ois = 
					new ObjectInputStream(fis);
			Member	taro = (Member)ois.readObject();
			Member	hana = (Member)ois.readObject();
			
			// Show objects
			System.out.println(taro.toString());
			System.out.println(hana.toString());
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	// Close files
    	
    	
	}//public static void main(String[] args)

}//public class Sub3_sample_10_10_read_object {
