package feature;

// Default and Static Methods in interfaces are features of Java 8

/**
 * Interface with static method.
 * Static Methods in interfaces can only be accessed by their interface names in implemented classes.
 */
interface Drawable {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

/**
 * We can write default methods in interfaces. We can't extend default methods
 * with same names in child interface/class. If it is override in the
 * implemented class then no exception is thrown. Default methods can be
 * override in child interface or implemented class.
 */
interface Showable {
	void show();

	default void msg() {
		System.out.println("default method");
	}
}

interface Printable {
	int count = 1;

	void print();

}

interface Changeable extends Printable, Showable {
	void change();
@Override
	default void msg() {
		System.out.println(" Changeabledefault method");
	}
}

/**
 * @author dineshkumaran_n class can implement multiple interfaces
 */
class interfacesExample implements Changeable, Drawable {
	public void print() {
		System.out.println("Print");
	}

	public void show() {
		System.out.println("Show");
	}

	public void change() {
		System.out.println("Change");
	}

	public void msg() {
		System.out.println(" interfacesExample msg method");
	}
	
	public void draw() {
		System.out.println("Draw");
	}
	
	static int cube(int x) {
		return x * x ;
	}

	public static void main(String args[]) {
		interfacesExample obj = new interfacesExample();
		//Drawable draw = new interfacesExample();
		obj.print();
		obj.show();
		obj.change();
		obj.msg();
		System.out.println(Drawable.cube(3));
		System.out.println(interfacesExample.cube(3));
		System.out.println(obj.count);
	}
}