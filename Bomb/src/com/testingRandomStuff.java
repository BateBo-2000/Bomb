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
			String pathName = "C:\\Users\\PC\\Desktop\\test";
			
			File f = new File(pathName);
			File []files = new DirectoryScanner(f).Directories();
			System.out.println(files[3]);
	}
}
