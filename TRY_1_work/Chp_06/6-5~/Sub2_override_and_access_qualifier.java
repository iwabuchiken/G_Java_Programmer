/************************************`
 * Sub2_override_and_access_qualifier.java
 * Author: Iwabuchi Ken				*
 * Date: 20120212_090617
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
import static java.lang.System.out;

class SuperClass {
	public void disp() {
		out.println(
				"SuperClass: public void disp()");
	}
}//class ClassA {

class SubClass extends SuperClass {
	public void disp() {
		out.println("SubClass: public void disp()");
	}
}

class SubClass2 extends SuperClass {
//	void disp() {
//		out.println("SubClass: void disp()");
//	}

//=> 
//	Sub2_override_and_access_qualifier.java:35: SubClass2 の disp() は SuperClass の
//	 disp() をオーバーライドできません。スーパークラスでの定義 (public) より弱いアク
//	セス特権を割り当てようとしました。
}

public class Sub2_override_and_access_qualifier {

	public static void main(String[] args)
    {
		SubClass	s = new SubClass();
		s.disp();
	}//public static void main(String[] args)	
}//public class Sub2_override_and_access_qualifier {
