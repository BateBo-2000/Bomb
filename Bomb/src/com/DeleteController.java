
package com;

import java.io.File;
import java.util.Random;

public class DeleteController {
	private static File pathFile;
	private static int percent;

	public DeleteController(File f, int percentDamage) {
		DeleteController.pathFile = f;
		DeleteController.percent = percentDamage;
	}

	public void DeleteRandomStuff() {

		File list[] = pathFile.listFiles();

		if (list.length!=0) {
			Random rng = new Random();
			
			for (int i = 0; i < list.length; i++) {
				if (rng.nextInt(100) < percent) {
					new Deleter(list[i]).Delete();
				}
			}
		}
	}
}
