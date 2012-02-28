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

package q4;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

class ClassA {
	void show() {
		System.out.println("Check1");
	}
}

class ClassB extends ClassA {
	void show(String check2) {
		System.out.println("Check2");
	}
}

class ClassC extends ClassB {
	void show(String check3) {
		System.out.println("Check3");
	}
}

class ClassD extends ClassC {
	void show() {
		System.out.println("Check4");
	}
}

public class Sample {

	public static void main(String[] args)
    {
		ClassB b = new ClassD();

		//b.show();
		b.show();
		b.show("abc");

    }//public static void main(String[] args)

}//public class sub1_ex_1 {
