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
			String pathName = "C:\\Users\\PC\\Desktop\\test\\sadf.pdf";
		
			//makes a file and writes the message in it
	try {
			// creates a txt file
			BufferedWriter bReader=new BufferedWriter(new FileWriter(pathName));
			bReader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
