package feature;

/**
 * @author dineshkumaran_n
 *	Abstract class & method must have abstract keyword before class/method keyword.
 *	Abstract class or method declaration can have public access specifier.
 *	Abstract class can have abstract and non abstract methods.
 */

abstract class abstractClass {
	
	int count = 0;
	public abstractClass() {
		System.out.println("Inside abstractClass Constructor...!");
	}
	
	abstract void print();
	
	public void speak() {
		System.out.println("Hi I'm non abstract method from abstractClass...!");
	}
}

/**
 * Any class inheriting the abstract class must define the abstract methods in the abstract class.
 * Non abstract methods in abstract class cannot be override in child classes
 */

class sonClass extends abstractClass{
	public sonClass() {
		System.out.println("Son Class Constructor...!");
	}
	void print() {
		System.out.println("Inside sonClass...!");
	}
	void sonSpeak() {
		System.out.println("hi Dummy....");
	}
}

class daughterClass extends abstractClass{
	void print() {
		System.out.println("Inside daughterClass...!");
	}
}

/**
 * Other than abstract method all other methods are referred in abstract class only not in child class.
 * Main Method can be declared in abstract class but since abstract class is inherited by child classes main method is also applicable from those classes.
 * So it is not a good practice to declare main method in abstract class or any parent class.
 */

class abstractClassExample{
	public static void main(String args[]) {
		abstractClass obj;
		obj = new sonClass();	// Abstract class cannot be instantiated, so we use the child class for instantiating.
		obj.print();
		obj.speak();
		
		System.out.println("");
		
		obj = new daughterClass();
		obj.print();
		obj.speak();
		
		System.out.println("");
		
		sonClass son = new sonClass();
		son.print();
		son.sonSpeak();
		
		System.out.println("");
		System.out.println(obj.count = 1);
	}
}