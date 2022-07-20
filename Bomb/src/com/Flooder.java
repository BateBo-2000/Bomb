package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Flooder {
	private static File path;
	private static String name, extention;

	public Flooder(File f, String n, String ext) {
		Flooder.path = f;
		Flooder.name = n;
		Flooder.extention = ext;
	}

	public void Flood() {
		try {
			String message[] = new MessageList().getTrollMessage();
			String result = path.getPath() + "\\" + name + "." + extention;
			BufferedWriter writer = new BufferedWriter(new FileWriter(result));
			if (extention.equals("txt")) {
				writer.write(message[new Random().nextInt(message.length)]);
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("failed to flood");
		}
	}

}
