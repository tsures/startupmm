/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
 import java.util.Date;

class HelloWorldApp {
    public static void main(String[] args) {
	Date date = new Date();
	System.out.println("The Date Today is: "+date.toString()); // Display the string.
    }
}
