/**
 * 
 */
package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;


public class testingRandomStuff {
	public static void main(String[] args) {
	
			//name of the file
			String pathName = "C:\\Users\\PC\\Desktop\\test\\3\\";
			
			File f = new File(pathName);
			System.out.println(f.getPath());
			
			Flooder flooder = new Flooder(f, "niggers", "ivo");
			flooder.Flood();
			
			
			
			
	}
}
