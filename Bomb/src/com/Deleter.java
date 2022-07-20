package com;

import java.io.File;

public class Deleter {
	private static File file;

	public Deleter(File file) {
		Deleter.file = file;
	}

	public void Delete() {
		try {
			file.delete();
		} catch (Exception e) {
			System.out.println("can't delete file " + file);
		}

	}
}
