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

		// name of the file
		String pathName = "C:\\Users\\PC\\Desktop\\test\\1";

		File f = new File(pathName);
		File listFile[] = f.listFiles();

		for (File file : listFile) {
			System.out.println(file.getPath());
		}
		DeleteController deleteController = new DeleteController(f, 50);
		deleteController.DeleteRandomStuff();

	}
}
