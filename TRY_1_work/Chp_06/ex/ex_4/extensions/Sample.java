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

package extensions;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

class ClassA {
	public void show() {
		System.out.println("ClassA shows");
	}

	public void show_name() {
		System.out.println("The name is ClassA");
	}
}

class ClassB extends ClassA {
	public void show_name() {
		System.out.println("The name is ClassB");
	}
}

class ClassC extends ClassB implements Methods{
	public void eat() {
		System.out.println("ClassC eats.");
	}
	public void show() {
		System.out.println("ClassC shows.");
	}
}

public class Sample {

	public static void main(String[] args)
    {
		//ClassB b = new ClassC();
		ClassC b = new ClassC();

		b.show();
		b.eat();
		b.show_name();

    }//public static void main(String[] args)

}//public class sub1_ex_1 {

interface Methods {
	public void eat();
}
