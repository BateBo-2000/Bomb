package com;

import java.io.File;
import java.io.FileFilter;

public class DirectoryScanner {
	private static File file;

	public DirectoryScanner(File f) {
		file = f;
	}

	public File[] Directories() {
		// creates a file fileter and sets it up
		MyDirectoryFilter myDirectoryFilter = new MyDirectoryFilter();
		FileFilter filter = myDirectoryFilter.Filter();

		// creates a file array witch contains the filtered list of addresses
		File[] list = file.listFiles(filter);

		return list;
	}

}
