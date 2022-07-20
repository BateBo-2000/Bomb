package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class FileCreator {
	private static File path;
	private static String name, extention;

	public FileCreator(File f, String n, String ext) {
		FileCreator.path = f;
		FileCreator.name = n;
		FileCreator.extention = ext;
	}

	public void CreateFile() {
		try {
			String message[] = new MessageList().getTrollMessage();
			String result = path.getPath() + "\\" + name + "." + extention;
			BufferedWriter writer = new BufferedWriter(new FileWriter(result));
			if (extention.equals("txt")) {
				writer.write(message[new Random().nextInt(message.length)]);
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("failed to flood "+e);	
		}
	}

}
