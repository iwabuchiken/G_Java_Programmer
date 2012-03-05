/************************************`
 * Sub6_sample_10_13_serialize_extension_class.java
 * Author: Iwabuchi Ken				*
 * Date: 20120210_083551
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/

//import java.lang.*;
import java.io.*;

class Food {
	String	category	= null;
	boolean	eatable		= false;
	// Constructor
	Food (String category, boolean eatable) {
		this.category	= category;
		this.eatable	= eatable;
		System.out.println("A Food instance");
	}//Food (String category, boolean eatable) {
	Food () {
		this("default", true);
		System.out.println("Food2 Constructor");
	}//Food () {
}//class Food {

class Fruit extends Food implements Serializable {
	String	kind;
	// constructor
	Fruit (String category, boolean eatable, 
			String kind) {
		super(category, eatable);
		this.kind = kind;
		System.out.println("Fuit constructor");
	}
	
	Fruit () {
		System.out.println("Fuit2 constructor");
	}
	public String toString() {
		return category + ":" + eatable 
				+ ":" + kind;
	}
}//class Fruit extends Food implements Serializable {

class Apple extends Fruit {
	String	color	= "red";
	String	taste;
	// constructor
	Apple(String category, boolean eatable, 
			String kind, String color, 
			String taste) {
		super(category, eatable, kind);
		this.color	= color;
		this.taste	= taste;
		System.out.println("Apple Constructor");
	}
	Apple() {
		System.out.println("Apple2 Constructor");
	}
	// method
	public String toString() {
		return category + ":" + eatable 
				+ ":" + kind + ":" + color
				 + ":" + taste;
	}
}//class Apple extends Fruit {

public class Sub6_sample_10_13_serialize_extension_class {

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
    	
    	// Declare members
    	String	path	= args[0];
    	File	file	= new File(path);
    	
    	try {
    		// object streams
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(file));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					file));
			
			// instance: Apple
			Apple	apple = new Apple(
					"Fruit", true, "round", 
					"red", "sweet");
			
			// write objects to file
			oos.writeObject(apple);
			
			// flush and close
			oos.flush();
			oos.close();
			
			// report
			System.out.println(
					"Write: " + apple.toString());
			System.out.println(
					"Write -> complete.");
			//    	Food	food1	= new Food();
			//    	Fruit	fruit1	= new Fruit("blue", true, "round");
			
			// read an object from file
			Apple	a = (Apple)ois.readObject();

			// process object
			System.out.println(
					"Read: " + a.toString());
			
			// close file
			ois.close();
			
			// report
			System.out.println(
					"Read -> complete.");
			
		} catch (IOException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		// report
//    	System.out.println(fruit1.toString());
	}//public static void main(String[] args)

}//public class Sub6_sample_10_13_serialize_extension_class {
