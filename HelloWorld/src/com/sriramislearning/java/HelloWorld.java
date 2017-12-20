/**
 * Project Code - Hello World Sample
 * @author Sriram Srinivasan
 * Email : sriramislearning@outlook.com 
 * Created Date: 20/12/2017 : 18:31 PM IST
 */
package com.sriramislearning.java;

/**
 * This is the most basic sample of a java code structure and how it works. This sample has a class called "HelloWorld"
 * It's responsibility is to print a greeting to the console. This is as simple as it can get.
 * No variables or methods for this class.
 */
public class HelloWorld {

	/**
	 * main method is the entry point method for a Java class. Java runtime will look for this method in a public class to execute
	 * the same. This method is a public method, means runtime will have access to this method. Static means this method belongs to 
	 * the class not to an instance of this class, void means, no need to return a value, and accepts String array as arguments. 
	 * 
	 * Naturally you may ask, can I overload main method? 
	 * 
	 * Answer is: Yes you can but you have to have a main method with signature as you see below, else JRE will complain that no main method 
	 * available for execution. 
	 * 
	 * So, this is the structure of a Java code. 
	 * 
	 * 1. Declare a package as required.
	 * 
	 * 2. Import packages as required by your program. Nothing imported in this sample because we are not using anything 
	 * that is not available in the basic java.lang package, which is auto imported for us by default. This means, Java compiler 
	 * acts as if java.lang is already imported in the code package that is getting compiled. That's why IDE's also don't complain. 
	 * 
	 * If you want to use say java.util package, this is not auto imported, hence your IDE itsef will complain and will force you to import. 
	 * 
	 * 3. Declare a public class. A .java file should contain one and only public class. 
	 * 
	 * 4. In that public class, declare a main method as declared below. This method should have code that your application should execute.
	 * 
	 * That's it. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Just print the value passed into the println method to console. 
		System.out.println("Hello World");

	}

}
