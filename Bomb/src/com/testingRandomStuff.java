/**
 * 
 */
package com;

import java.io.File;
import java.util.Random;

public class testingRandomStuff {
	public static void main(String[] args) {

		// name of the file
		String pathName = "C:\\Users\\PC\\Desktop\\test\\1";
//		
		
		
		File file = new File(pathName);
		new Flooder(10, file, new String[] {".asdf"}, true).Flood();
		
		
	}
}
