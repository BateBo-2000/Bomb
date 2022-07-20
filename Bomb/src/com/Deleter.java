package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Deleter {
	File file;

	public Deleter(File file) {
		this.file = file;
	}

	public void Delete() {
		try {
			file.delete();
		} catch (Exception e) {
			System.out.println("can't delete file " + file);
		}

	}
}
