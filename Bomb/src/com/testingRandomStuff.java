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

		File f = new File(pathName);
		// random percent damage delete
		DamageGenerator damageGenerator = new DamageGenerator(10, f, new String[]{"asdf"},true , 10 , false , true);
		damageGenerator.DoDamage();
	}
}
