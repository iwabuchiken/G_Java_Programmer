/************************************`
 * Sample.java
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


//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

interface MyInterface {
	boolean check(int a, int b);
}

public class Sample implements MyInterface{

	public boolean check(int a, int b) {
	//protected boolean check(int a, int b) {
		return (a == b) ? true : false;
	}

	public static void main(String[] args)
    {
		System.out.println(new Sample().check(3, 3));

    }//public static void main(String[] args)

}//public class sub1_ex_1 {
