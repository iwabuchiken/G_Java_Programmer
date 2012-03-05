/************************************`
 * Sub3_q1_getParentFile.java
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
import java.io.File;

import sun.misc.*;

public class Sub3_q1_getParentFile {

    public static void main(String[] args)
    {
    	/* variables			 */
    	String		fin_name			= "sub3.dat";	/* input file name	*/
//    	String		fin_name			= "sub3_.dat";	/* input file name	*/
    	String		parent_name;	/* parent file name of the current	*/
    	String		abs_path;			/* the absolute path of the file		*/
    	File			fin;			/* input file			*/
    	File			fparent;		/* parent file			*/
    	
    	/* initialize				*/
    	fin						= new File(fin_name);    	
    	parent_name	= fin.getParent();
    	if (fin.exists()) {
    		abs_path		= fin.getAbsolutePath();
    		/* re-initialize fin		*/
        	fin			= new File(abs_path);
    	} else {
    		System.out.println
    				("File doesn't exist: " + fin_name);
    		System.exit(1);
    	}
    	
    	/* get parent file		*/
    	fparent	= fin.getParentFile();
    	
    	/* show				*/
    	System.out.println
    			("parent_name=" + parent_name);	/* parent directory name	*/
//    	System.out.println
//    			("fin.exists()=" + fin.exists());
    		/* current file path		*/
    	System.out.println("fin.getPath()=" + fin.getPath());
    		/* parent file path		*/
    	System.out.println
    			("fparent.getPath()=" + fparent.getPath());
	}//public static void main(String[] args)

}//public class Sub3_q1_getParentFile {
