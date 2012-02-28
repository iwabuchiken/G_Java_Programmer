/************************************`
 * Sub1_sample_10_8_Console_class.java
 * Author: Iwabuchi Ken				*
 * Date: 20120209_090456
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.Console;

public class Sub1_sample_10_8_Console_class {

    public static void main(String[] args)
    {
    	/* Declare members */
    	Console	console	= System.console();
    	String	id;
    	char[]	password;
    	
    	/* Get an input from the console */
    	try {
			id = console.readLine("%s", "ID : ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			id = "Exception";
		}
    	
    	/* Show id */
    	console.printf("id is: %s \n", id);
    	
    	/* Input: password */
    	password = 
    			console.readPassword("%s", "password: ");
    	
    	/* Show password */
    	console.printf("password: ");
    	for (char c:password) {
    		console.printf("%c", c);
    	}
    	console.printf("\n");
    	
	}//public static void main(String[] args)

}//public class Sub1_sample_10_8_Console_class {
