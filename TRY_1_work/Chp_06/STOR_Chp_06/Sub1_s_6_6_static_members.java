/************************************`
 * Sub1_s_6_6_static_members.java					*
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

class Athlete {
	// member vars
	static int	amount = 0;
	String		name;
	// constructor
	Athlete(String name) {
		this.name = name;
		amount ++;
	}
	// member methods
	static void showAmount() {
		System.out.println("To America: "
				+ amount);
	}
	void showName() {
		System.out.println("Pilgrim: " + name);
	}
}//class Athlete {

public class Sub1_s_6_6_static_members {

	public static void main(String[] args)
    {
		// instance: 1
    	Athlete	ath1 = new Athlete("Calvinism");
    	ath1.showName();
    	ath1.showAmount();
		// instance: 2
    	Athlete	ath2 = new Athlete("Clyfton");
    	ath2.showName();
    	ath2.showAmount();
    	// static access
    	Athlete.showAmount();
    }//public static void main(String[] args)

}//public class Sub1_s_6_6_static_members {
