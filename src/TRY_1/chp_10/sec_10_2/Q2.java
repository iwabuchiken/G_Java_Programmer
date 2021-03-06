/************************************`
 * Q2.java
 * Author: Iwabuchi Ken				*
 * Date: 20120308_174545
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/
package try_1.chp_10.sec_10_2;

//import java.lang.*;
import java.io.*;

import mylib.STDLIB;

public class Q2 {

    public static void main(String[] args)
    {
    	/* Declare members */
    	String		tmp		= null;	/* read line		*/
    	String		fname	= "Q2.dat";	/* data file	*/
    	String		fname2;			/* this file			*/
    	String		packageName	= null;	/* package name of this class	*/
    	File			fin	;
    	File			fout;
    	BufferedReader	br;
    	BufferedWriter		bw;
    	
    	/* initialize					*/
    	fname2	= STDLIB.get_file_name();
    	packageName	= new Q2().getClass().getPackage().getName();
    	packageName	= packageName.replace('.', '/');
//    	fname				= String.format("./%s/%s", packageName, fname);
    	fname				= get_project_path(fname);
//    	fname2				= String.format("./%s/%s", packageName, fname2);
    	fname2				= get_project_path(fname2);
    	//debug
    	System.out.println("fname=" + fname);
    	System.out.println("fname2=" + fname2);
    	
    	/* processes
    	 * 
    	 */
    	/* open the output file	*/
    	fin		= new File(fname2);
    	fout	= new File(fname);
    	try {
			bw		= new BufferedWriter(new FileWriter(fout));
			br			= new BufferedReader(new FileReader(fin));
			
			/* read lines		*/
			while ((tmp = br.readLine()) != null) {
//				System.out.println(tmp);
				bw.write(tmp + "\n");
			}//while ((tmp = br.readLine()) != null)
			br.close();
			bw.close();
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("\nPlease close the�@file:�@" + fname + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//try//    	    	
    }//public static void main(String[] args)

    private static String get_project_path(String file_name) {
    	/* variables
    	 * 		project_path		:String
    	 * 		packageName	:String
    	 */
    	String		project_path		= STDLIB.get_file_name();
    	String		packageName	= new Q2().getClass().getPackage().getName();
    	
    	/* get strings			*/
    	packageName	= packageName.replace('.', '/');
    	project_path		= String.format("./%s/%s", packageName, file_name);
    	
    	/* return		*/
    	return project_path;
    }//private static String get_project_path(String file_name)
}//public class Q2 {
