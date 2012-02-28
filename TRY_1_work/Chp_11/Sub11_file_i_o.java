/************************************`
 * Sub11_file_i_o.java
 * Author: Iwabuchi Ken				*
 * Date: 20120222_073908
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. FileOutputStream => http://www.javaroad.jp/java_io2.htm
 * 	2. initialize	=> http://q.hatena.ne.jp/1169785811
 ************************************/

//import java.lang.*;
import java.io.*;


public class Sub11_file_i_o {
	
	static int	NUM	= 3;

    public static void main(String[] args) {
    	/* variables
    	 * 1.
    	 * */
    	/* declare		*/
    	FileOutputStream	fos;
    	OutputStreamWriter	osw = null;
    	String				fname = "sub11.dat";
//    	OutputStreamWriter	osw;
    	
    	try {
			/* initialize	*/
			fos = new FileOutputStream(fname);
			osw = new OutputStreamWriter(fos);
			System.out.println(
					"Stream opened to: " 
					+ fname);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
    	
    	/* processes
		 * 1. write
		 * 2. close
		 */
    	
    	/* write	*/
    	try {
		
//			osw.write("abcde");
    		osw.write("abcde\n");
    	} catch (IOException e) {
    		System.out.println(
				"error: IOException");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(
				"error: Exception");
		}
    	
    	/* close files	*/
		try {			
			osw.close();
			System.out.println(
					"Stream closed to: "
					+ fname);
    	} catch (IOException e) {
    		System.out.println(
				"error: IOException");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(
				"error: Exception");
		}
	}//public static void main(String[] args)

}//public class Sub11_file_i_o {
