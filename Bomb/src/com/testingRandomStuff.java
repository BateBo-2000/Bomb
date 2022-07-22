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
		File file = new File(pathName);
		String exteString[] = {};
		
		Flooder flooder = new Flooder(10, file, exteString, true, true);
		flooder.Flood();
		
	}
}
