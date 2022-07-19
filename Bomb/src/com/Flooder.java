package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class Flooder {
	File path;
	String name, extention;
	public Flooder(File f, String n, String ext) {
		this.path=f;
		this.name=n;
		this.extention=ext;
	}
	
	public void Flood() {
		try {
			String message[] = new MessageList().getTrollMessage();
			String result = path.getPath() +"\\"+name+"."+extention;
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
