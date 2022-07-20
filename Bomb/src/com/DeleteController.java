
package com;

import java.io.File;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class DeleteController {
	private static File pathFile;
	private static int percent;

	public DeleteController(File f, int percentDamage) {
		DeleteController.pathFile = f;
		DeleteController.percent = percentDamage;
	}

	public void DeleteRandomStuff() {

		File list[] = pathFile.listFiles();

		Random rng = new Random();
		
		for (int i = 0; i < list.length; i++) {
			if (rng.nextInt(100) < percent) {
				new Deleter(list[i]).Delete();
			}
		}

	}
}
