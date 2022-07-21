package com;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Flooder {
	private static String extentions[];
	private static int damage;
	private static File path;
	private static boolean folders = false;
	public Flooder(int damage, File pathFile ,String fileExtentions[], boolean folders) {
		Flooder.extentions = fileExtentions;
		Flooder.damage = damage;
		Flooder.path = pathFile;
		Flooder.folders = folders;
	}
	
	public void RandomFlood() {
		for (int i = 0; i < damage; i++) {
			if (extentions.length!=0) {
				floodChooser();
			}else {
				randomFlooding();
			}
		}
	}
	
	public void Flood() {
		for (int i = 0; i < damage; i++) {
			floodChooser();
		}
	}
		
	
	private static void flooding() {	
			new FileCreator(
					path, 
					new StringGenerator(new Random().nextInt(10) + 5).generateString(),
					extentions[new Random().nextInt(extentions.length)]
				).CreateFile();
		
	}

	private static void randomFlooding() {
			new FileCreator(
					path, 
					new StringGenerator(new Random().nextInt(10) + 5).generateString(),
					"." + new StringGenerator(new Random().nextInt(3) + 2, false).generateString()
				).CreateFile();
	}
	
	private static void floodChooser() {
		if (folders && new Random().nextInt(extentions.length+1)==0) {
			String temp = path.getPath()+"\\"+new StringGenerator(10).generateString();
			new File(temp).mkdir();
		}else {
			if (new Random().nextInt(extentions.length+1)==0) {
				randomFlooding();
			}else {
				flooding();
			}
		}
		
	}
	
}
