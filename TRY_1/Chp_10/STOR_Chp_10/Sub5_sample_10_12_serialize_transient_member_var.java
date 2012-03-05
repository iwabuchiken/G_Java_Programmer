/************************************`
 * Sub5_sample_10_12_serialize_transient_member_var.java
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
import java.io.*;

public class Sub5_sample_10_12_serialize_transient_member_var {

    public static void main(String[] args)
    {
    	// Inspect the length of args[]
    	if (args.length < 1) {
    		System.out.println(
				"args.length=" + args.length);
    		System.out.println(
				"Please input the second argument.");
    		System.exit(0);
    	}
    	
    	/* Declare members */
    	String	path = args[0];
    	File	file = new File(path);
    	
    	try {
			// Generate input/output stream
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(file));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					file));
			
			// Generate a Pencil object
			Pencil	black = new Pencil("Black", 100);
			Pencil	red = new Pencil("Red", 112);
			
			// Write objects into file
			oos.writeObject(black);
			oos.writeObject(red);
			
			// flush and close the file
			oos.flush();
			oos.close();
			
			// report
			System.out.println(
					"Write: " + black.toString());
			System.out.println(
					"Write: " + red.toString());
			System.out.println("Write complete.");
			
			// Raise tax
//			Pencil.setTax(0.08);
			black.setTax(0.08);
			
			// Read objects from file
			Pencil	a = (Pencil)ois.readObject();
			Pencil	b = (Pencil)ois.readObject();
			
			// report
			System.out.println(
					"Read: " + a.toString());
			System.out.println(
					"Read: " + b.toString());
			
			///debug
			System.out.println(
					"Write: " + black.toString());
			
			// close file
			ois.close();
			System.out.println("Read complete.");
		} catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
    	
    	
	}//public static void main(String[] args)

}//public class Sub5_sample_10_12_serialize_transient_member_var {

class Pencil implements Serializable {
	// Members
//	private static double tax = 0.05;
	private double tax = 0.05;
	private String	color;
	private long	price;
	
	Pencil(String color, long price) {
		this.color = color;
		this.price = price;		
	}//public MemberA(
	
//	public static void setTax(double newtax) {
	public void setTax(double newtax) {
		tax = newtax;
	}
	
	public String toString() {
		return color + ":" + price 
				+ ":tax = " + tax;
	}	
}//class MemberA implements Serializable {
