/**
 * Project Code - ClassLoader Sample
 * @author Sriram Srinivasan
 * Email : sriramislearning@outlook.com 
 * Created Date: 21/12/2017 : 05:45 AM IST
 */
package com.sriramislearning.java;

import com.sun.nio.zipfs.*;
import org.apache.maven.*;

/**
 * @author Sriram Srinivasan
 * This example demonstrates the three types of class loading 
 * 1. Bootstrap Class Loader - loads JDK internal classes like java.lang package classes
 * 2. Extensions Class Loader - loads classes present in the JDK extension directory <JAVA_HOME/lib/ext.
 * 3. System Class Loader - loads classes from the current classpath.
 */
public class ClassLoaderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Bootstrap class loader will load this class and hence we would get an output of null
		System.out.println ("Class loader for System class: " + java.lang.System.class.getClassLoader());
		
		//Extension class loader will load this class.
		System.out.println("Class loader for ZipFileSystem class: " + com.sun.nio.zipfs.ZipFileSystem.class.getClassLoader());
		
		//System class loader will load this class
		System.out.println("Class loader for ArtifactFilterManager class: " + org.apache.maven.ArtifactFilterManager.class.getClassLoader());
		
		//System class loader will load this class
		System.out.println("Class loader for our ClassLoaderExample class: " + com.sriramislearning.java.ClassLoaderExample.class.getClassLoader());
	}

}
