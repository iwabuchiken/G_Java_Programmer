/************************************`
 * Sub3_sample_10_4_FileReader_with_char_array_variable.java
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

public class Sub3_sample_10_4_FileReader_with_char_array_variable {

    public static void main(String[] args)
    {
    	/* Declare members */
    	String			path;
    	File				file;
    	FileReader	fr	= null;
//    	int				c	= 0;
    	char[]			buf;
    	
    	/* initialize					*/
    	if (args.length < 1) {
    		System.out.println("We need one argument for the file path.");
    		System.exit(1);
    	}
    	
    	path		= args[0];
    	file		= new File(path);
    	buf		= new char[(int)file.length()];

    	/* read from the file		*/
    	try {
			/* initialize					*/
			fr = new FileReader(file);
			/* read char by char	*/
			fr.read(buf);
			System.out.println(new String(buf));
//			while((c=fr.read()) != -1) {
//				System.out.print((char)c);
//			}
			/* close the file			*/
			fr.close();
			System.out.println();
			System.out.println("Read finished.");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}//try
    	
    }//public static void main(String[] args)

}//public class Sub3_sample_10_4_FileReader_with_char_array_variable {
