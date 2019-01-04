import java.util.*;
/*
This program should give us compilation error because
printHello() is trying to access the variable hello, which is a
local variable of the main function.

Therefore, hello can only be accessed by the main method.
*/
public class LocalVariable {
	public static void main(String[] args) {
		String hello = "Hello World!";
		System.out.println(hello);
		printHello();
	}
	
	public static void printHello() {
		hello = "changing to something else...";
		System.out.println(hello);
	}

}