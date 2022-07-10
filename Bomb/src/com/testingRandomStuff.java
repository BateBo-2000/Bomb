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
		Util utility=new Util();
		File file=new File("C:\\Users\\PC\\Desktop\\test");
		utility.Controler(file, 10, utility.messageList());
		
	}
}
