/**
 * 
 */
package com.sriramislearning.java;

/**
 * @author Sriram Srinivasan
 *
 */
public interface DefaultInterface {
	
	//From Java8 we can provide default implementation for a method on the interface
	//This helps interface to provide it's implementation for a method and that allows interface to grow and
	//does not break the clients using this interface
	//Only catch is if multiple interfaces that extend from the base interface implement a same method, 
	//then the clients using those interfaces should provide it's own implementation else, compiler will fail.
	//This is to avoid the diamond problem. 
	
	default void longPrint() {
		System.out.println("This is a default interface method");
	}

}

