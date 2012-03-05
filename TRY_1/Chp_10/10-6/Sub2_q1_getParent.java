/************************************`
 * Sub2_q1_getParent.java
 * Author: Iwabuchi Ken				*
 * Date: 20120305_134335
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. getAbsolutePath()	=> http://wisdom.sakura.ne.jp/programming/java/java39.html
 * 	2. getParent()			=> http://www.xinotes.org/notes/note/774/
 * 	3. Parent					=> http://www.site-cooler.com/java/j2se/14_01.htm
 ************************************/

//import java.lang.*;
import java.io.File;

import sun.misc.*;

public class Sub2_q1_getParent {

    public static void main(String[] args)
    {
    	/* variables			 */
    	String		fin_name			= "sub2.dat";	/* input file name	*/
    	String		parent_name;	/* parent file name of the current	*/
    	File			fin;			/* input file			*/ 
    	
    	/* initialize				*/
    	fin						= new File(fin_name);
    	parent_name	= fin.getParent();
    	
    	/* show				*/
    	System.out.println
    			("parent_name=" + parent_name);	/* parent directory name	*/
    	System.out.println("fin=" + fin.toString());	/* file object name				*/
    	System.out.println("fin.getAbsolutePath()=" 
    			+ fin.getAbsolutePath());					/* absolute path	*/
    	System.out.println
    			("fin.getPath()=" + fin.getPath());		/* path					*/
    	System.out.println
    			("new File(fin.getAbsolutePath()).getParent()=" 
					+ new File(fin.getAbsolutePath()).getParent());
	}//public static void main(String[] args)

}//public class Sub2_q1_getParent {
