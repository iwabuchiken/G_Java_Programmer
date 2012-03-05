/************************************`
 * MyUtil.java
 * Author: Iwabuchi Ken				*
 * Date: 20120305_134335
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. 
 ************************************/
package TRY_1.chp_10;

import java.io.File;

public class MyUtil {
	/*
	 * get_parent_path()
	 * <return>
	 * 	1. string	=> The absolute path of an existing file(or folder)
	 * 	2. null		=> The given file path doesn't exist
	 */
	public static String get_parent_path(String current_abs_path) {
		/* variables		*/
		String		parent_path;		/* parent path		*/
		File			file;					/* current file			*/
		
		/* processes		*/
		file		= new File(current_abs_path);
		if (file.exists()) {			/* if the given file exists		*/
			parent_path		= file.getParent();
		} else {						/* if exists not					*/
			parent_path		= null;
		}
		
		/* return			*/
		return parent_path;
		
	}//public static String get_parent_path(String current_abs_path)
}
