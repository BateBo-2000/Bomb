package com;

import java.io.File;
import java.io.FileFilter;

public class MyDirectoryFilter {

	public FileFilter Filter() {
		FileFilter filter = new FileFilter() {

			@Override
			public boolean accept(File directory) {
				if (directory.isDirectory()) {
					return true;
				} else
					return false;
			}
		};

		return filter;
	}

}
