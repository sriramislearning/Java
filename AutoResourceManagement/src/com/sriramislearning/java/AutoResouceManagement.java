/**
 * Project Code - Auto Resource Management Sample
 * @author Sriram Srinivasan
 * Email : sriramislearning@outlook.com 
 * Created Date: 20/12/2017 : 20:42 PM IST
 */
package com.sriramislearning.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Sriram Srinivasan
 * Auto Resoure Management got introduced in Java 7. This enables us to 
 * 
 * Write less code
 * Resources are managed automatically 
 * Readable code 
 * Finally block is not needed at all to close opened resources
 * Multiple resources can be opened ; separated.
 */
public class AutoResouceManagement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create resource within the try declaration, this syntax change you should watch out for. 
		try(BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\onelifesiram\\Documents\\file.txt"))) {
			
				System.out.println(br.readLine());
				
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		//Also see no finally block to release resource. In this way, resources are closed automatically for you. 
		
		// Create resource within the try declaration, this syntax change you should watch out for. 
		try( MyResource myResource = new MyResource()){
			System.out.println("Resource Created");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Also see no finally block to release resource. In this way, resources are closed automatically for you. 

	}
	
	//If we create our own resource, then we should implement the AutoCloseable interface.
	static class MyResource implements AutoCloseable{
		
		@Override
		public void close() throws Exception{
			System.out.println("Closing MyResource");
		}
		
	}

}


