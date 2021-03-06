package feature;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface // It is optional
interface Drawable1 {
	public void draw();

	int count = 1;

	default void msg() {
		System.out.println("default method");
	}
}

interface Sayable {
	public String say(String name);
}

interface Addable {
	int add(int a, int b);
}

public class lambda {
	public static void main(String[] args) {
		int width = 10;

		// with lambda
		Drawable1 d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
		d2.msg();
		
		// Single parameter lambda expression
		Sayable s1 = (name) -> ("Hello, " + name);
		System.out.println(s1.say("Sonoo"));

		// Multi parameter lambda expression
		Addable ad2 = (a,b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));
		
		ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));
		
	}
}
