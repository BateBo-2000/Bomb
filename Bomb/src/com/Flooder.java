package com;

import java.io.File;
import java.util.Random;

public class Flooder {
	private static String extentions[];
	private static int damage;
	private static File path;
	public Flooder(int damage, File pathFile ,String fileExtentions[]) {
		Flooder.extentions = fileExtentions;
		Flooder.damage = damage;
		Flooder.path = pathFile;
				
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
			flooding();
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
					new StringGenerator(new Random().nextInt(3) + 2, false).generateString() 
				).CreateFile();
	}
	
	private static void floodChooser() {
		if (new Random().nextInt(extentions.length+1)==0) {
			randomFlooding();
		}else {
			flooding();
		}
	}
	
}
