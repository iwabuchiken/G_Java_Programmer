/************************************`
 * Sub4_q2_file_close_exception.java
 * Author: Iwabuchi Ken				*
 * Date: 20120305_134335
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. getAbsolutePath()	=> http://wisdom.sakura.ne.jp/programming/java/java39.html
 * 	2. getParent()(Dirname)	=> http://www.xinotes.org/notes/note/774/
 * 	3. Parent					=> http://www.site-cooler.com/java/j2se/14_01.htm
 ************************************/

//import java.lang.*;
import java.io.BufferedReader;
import java.io.File;


public class Sub4_q2_file_close_exception {

    public static void main(String[] args)
    {
    	/* variables			 */
    	String					f_name	= "sub4.dat";	/* input file name	*/
    	String					tmp		= null;				/* line read from the file	*/
    	File						file		= new File(f_name);	/* file object	*/
    	BufferedReader	br;

    	/* initialize				*/
    	try {			
//			br = new BufferedReader(new java.io.FileReader(file));
    		br = new BufferedReader(new FileReader(file));
			while ( (tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}
			/* close the stream	*/
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
	}//public static void main(String[] args)

}//public class Sub4_q2_file_close_exception {
