/************************************`
 * sub1_ex_1.java					*
 * Author: Iwabuchi Ken				*
 * Date: 20120205_133224			*
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 *									*
 ************************************/

//import java.lang.*;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

public class sub1_ex_1 {
	private static int		id = 100;
	private static String	name = "Radio ";

	/* Constructor */
	public sub1_ex_1() {
		name = "Television ";
	}

    public static void main(String[] args)
    {
    	name += "DVDPlayer ";

    	System.out.println("<display()>");
    	display();

    	System.out.println("<new sub1_ex_1().display()>");
    	new sub1_ex_1().display();
    }//public static void main(String[] args)

    public static void display() {
    	System.out.println(name);
    }
}//public class sub1_ex_1 {
