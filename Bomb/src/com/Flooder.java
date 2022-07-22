package com;

import java.io.File;
import java.util.Random;

public class Flooder {
	private static String extentions[];
	private static int damage;
	private static File path;
	private static boolean folders = false, random = false;
	public Flooder(int damage, File pathFile ,String fileExtentions[], boolean folders, boolean random) {
		Flooder.extentions = fileExtentions;
		Flooder.damage = damage;
		Flooder.path = pathFile;
		Flooder.folders = folders;
		Flooder.random = random;
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
	
	private static void folderFlooding() {
		new File(path.getPath() + "\\" + new StringGenerator(10).generateString()).mkdir();
	}
	
	private static void floodChooser() {
		int allOutcomes = extentions.length;
		if (random) {
			allOutcomes++;
		}
		if (folders) {
			allOutcomes++;
		}
		
		int randomInt = new Random().nextInt(allOutcomes);
		
		if (randomInt == (allOutcomes - 1) && random) {
			//create random
			randomFlooding();
		}else if (randomInt == (allOutcomes - 2) && folders) {
			//create folder
			folderFlooding();
		}else {
			// create from extensions
			flooding();
		}
	}
	
}
