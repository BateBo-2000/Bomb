
package com;

import java.io.File;
import java.io.FileFilter;

public class reading_directories {
    public static void main(String[] args) {
    	String pathString="C:\\Users\\PC\\Desktop\\test";
    	File file=new File(pathString);
    	File[] list = dirReader2(file);
    	
    	System.out.println(list.length);
    	for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
    	
    	
    }
    //testing 
    public static File[] dirReader2(File file) {
		//creates a file object for the directory
		
		
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
		
		
		return list;
	}
    //reads the adresses
    public static void read(File[] list) {
    	if (list!=null) 
	    	for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
    }

}
