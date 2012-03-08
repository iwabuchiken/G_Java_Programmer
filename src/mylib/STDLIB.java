/************************************
 * Sub1_10_6_getParentFile.java 
 * Author: iwabuchiken 
 * Date: 2012/2012/03/07/8:24:32 
 * Aim: 
 *	1.
 * <Usage> 1. Run the program 
 * <Source> 1. split	=> http://www.javaroad.jp/java_character6.htm
 ************************************/
package mylib;

import java.io.File;
import java.io.IOException;

public class STDLIB {
	/*
	 * param:	None
	 * return:	the file name
	 */
	public static String get_file_name() {
		return new Throwable().getStackTrace()[1].getFileName();
	}//public static String get_file_name()
	
	/*
	 * param:	file name	:String
	 * return:	absolute path	:String
	 */
	public static String get_file_absolute_path(String file_name) {
		/* variable				*/
//		String			file_name	= get_file_name();
		
//		return new File(file_name).getParentFile().getAbsolutePath();
		File			f1		= new File(file_name);
		String		s1		= f1.getAbsolutePath();
		File			f2		= new File(s1);
		String		s2		= f2.getParent();
		
		return s2;
//		return s1;
//			return new File(new File(file_name).getAbsolutePath());
	}//public static String get_file_absolute_path(String file_name)
	/*
	 * 
	 */
	public static String get_project_path
		(String root_name, String target_name, String package_name) {
		/* prosecces
		 * 1. get a File object (f1)
		 * 2. Check if the file exists (if doesn't => return null)
		 * 3. get the absolute path of f1 (s1)
		 * 4. get an array made up of each dir in s1 (a1)
		 * 5. find the root name in a1 (n1) (if doesn't => return null)
		 * 6. generate an array made up of dirs below n1 (a2)
		 * 7. turn a2 into a string (s1)
		 * 8. return s1
		 */
		/* 1			*/
		System.out.println("<enter: get_project_path()>");
		
		String		file_name			= get_file_name();
		String		file_path_abs	= get_file_absolute_path(file_name);
//		String		package_name	= class_obj.getPackage().getName();
		String		project_path;
		
//		System.out.println("file_name=" + file_name);
//		System.out.println("file_path_abs=" + file_path_abs);
		
		/* show project path		*/
		project_path		= String.format("./%s/%s", package_name, target_name);
//		System.out.println("project_path=" + project_path);
		
		/* return			*/
		System.out.println("<exit: get_project_path()>");
		return project_path;
		
//		return null;
	}//public static String get_project_path
	
	public static int get_index(String[] sarray, String target) {
		/* processes
		 * 1. start 'for' statement: index i=0
		 * 2. do 'equals'
		 * 3. if match, return i
		 * 4. n mathc, then return -1
		 */
		for (int i = 0; i < sarray.length; i++) {
			if (sarray[i].equalsIgnoreCase(target)) {
				return i;
			}
		}//for (int i = 0; i < sarray.length; i++)
		
		return -1;
	}//public static int get_index(String[] sarray, String target)

	public static String substitute_chars(String target, char char_from, char char_to) {
		/* variables			*/
		String		temp;	/* temporary string		*/
//		
//		/* processes				*/
//		temp		= target;
//		
//		for (int i = 0; i < temp.length(); i++) {
////			System.out.println("temp.charAt(i)=" + temp.charAt(i));
//			if (temp.charAt(i) == char_from) {
//				temp.charAt(i) = char_to;
//			}//if (temp[i] == char_from) 
//		}//for (int i = 0; i < temp.length; i++)
		
		temp = target.replace(char_from, char_to);
		
		return temp;
	}//public static String substitute_chars()
}
