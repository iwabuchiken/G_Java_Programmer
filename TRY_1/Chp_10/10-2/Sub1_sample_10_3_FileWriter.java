/************************************`
 * Sub1_sample_10_3_FileWriter.java
 * Author: Iwabuchi Ken				*
 * Date: 20120229_093510
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.*;

public class Sub1_sample_10_3_FileWriter {

    public static void main(String[] args)
    {
    	/* Declare members */
    	String		path;
    	File			file;
    	
    	/* initialize					*/
    	if (args.length < 1) {
    		System.out.println("We need one argument for the file path.");
    		System.exit(1);
    	}
    	
    	path		= args[0];
    	file		= new File(path);
    	
    	try {
			/* generate a stream		*/
			FileWriter fw = new FileWriter(file);
			/* write to file				*/
			fw.write("Hi.");
			fw.flush();
			fw.close();
			System.out.println("Write finished.");			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
    	
    }//public static void main(String[] args)

}//public class Sub1_sample_10_3_FileWriter {
