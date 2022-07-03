
package com;

import java.io.File;
import java.io.FileFilter;

public class reading_directories {
    public static void main(String[] args) {
    	String pathString="C:\\Users\\PC\\Desktop\\test";
    	dirReader2(pathString);
    	
    }
    //testing 
    public static String[] dirReader2(String path) {
		//creates a file object for the directory
		File file=new File(path);
		
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
		File[] list2=file.listFiles();
		
		read(list);
		
		
		return null;
	}
    //reads the adresses
    public static void read(File[] list) {
    	if (list!=null) 
	    	for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
    }

}
