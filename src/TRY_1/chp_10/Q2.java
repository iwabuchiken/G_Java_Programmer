/************************************`
 * Sub3_q1_getParentFile.java
 * Author: Iwabuchi Ken				*
 * Date: 20120305_134335
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. __FILE__	=> http://www.recital.com/index.php?option=com_content&view=article&id=201:howto-use-file-and-line-in-java-programs&catid=67:developers&Itemid=101
 ************************************/
package TRY_1.chp_10;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		File				file;
		String			fname;		/* output file name		*/
		FileWriter		fr;
		String			parent_path;	/* path of the current file	*/
		
		/* initialize			*/
		fname			= "Q2.dat";
		parent_path = new MyUtil().get_parent_path();
		file	= new File(fname);
		try {
			String string = "Hi.";		/* text to be written	*/
			fr		= new FileWriter(file);
//			fr.write("Hi.");
			fr.write(string);
			fr.flush();
			fr.close();
			System.out.println("File written.");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		/* get the current path		*/
		
		
//		FileReader			fr;
//		String					line1;	/* readLine()		*/
//		BufferedReader	bf;		/* instance		*/

//		try {
//			fr		= new FileReader("Q2.dat");
//			bf		= new BufferedReader(fr);
//			line1	= bf.readLine();
//			System.out.println(line1);
//		} catch (FileNotFoundException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
	}//public static void main(String[] args)
	
	public static String get_dirname(String file_name) {
		
	}//public static String get_dirname(String file_name)

}
