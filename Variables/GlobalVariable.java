import java.util.*;

/*
This code shows that the global variable hello can be accessed
by both the main method and the printHello method 
*/
public class GlobalVariable{
	//ignore why this needs to be static...
	//We eventually won't make our global variables static
	//but for sake of running this code, i'll make it static. ^^;;
    static String hello = "Hello World!";

    public static void main(String[] args) {
	//should print out "Hello World!"
	System.out.println(hello);
	//should print out "changed to something else..."
	printHello();

    }//endmain

    public static void printHello() {
	hello = "changed to something else...";
	System.out.println(hello);
    }


}//endclass