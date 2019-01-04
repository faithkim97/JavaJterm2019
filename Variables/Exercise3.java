import java.util.*;

/*
This program shows the idea of having to explicitly converting numbers 
from ints to floats and vice versa. This program shows a specific kind of 
conversion called "casting"
*/
public class Exercise3 {
	public static void main(String[] args) {
		int x = 1;
		//convert the integer to a float
		//using (float). This is called casting
		float y = (float) x;
		System.out.println("Integer: " + x + " Float: " + y);
		
		//this is just extra...converting float to a double
		float z = 2.0f;
		double a = (double) z;
		System.out.println("Float: " + z + " Double: " + a + 
			" may not look that different in its output, but they are actually different!" );
	
	}


}