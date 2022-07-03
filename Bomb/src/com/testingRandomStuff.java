/**
 * 
 */
package com;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;


public class testingRandomStuff {

	public static void main(String[] args) {
		String path="C:\\Users\\PC\\Desktop\\test";
		File file=new File(path);
		//dirReader(file);
		Controler(file);
		
		

	}
	
	
	public static void Controler(File startingPath) {
		//the program starts in the starting path
		File[] listFolders=dirReader(startingPath);
		
		//for cycle to walk around all directories
		for (int i = 0; i < listFolders.length; i++) {
			//search for other paths
			Controler(listFolders[i]);
		}
		//nuke this path last to save the program time
		System.out.println(startingPath+"\t\tnucked");
		
		
	}

	public static File[] dirReader(File file) {
			
		//creates a file fileter and sets it up
		FileFilter filter=new FileFilter() {
			
			@Override
			public boolean accept(File directory) {
				if (directory.isDirectory()) {
					return true;
				}else 
					return false;
			}
		};
		
		
		//creates a file array witch contains the filtered list of addresses
		File[] list=file.listFiles(filter);
		
		/*	methood readDir(File[])
		 * 	is just for reading and testing out this method
		 */
		//readDir(list);

		return list;
	}
}
