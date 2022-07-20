
package com;

import java.io.File;
import java.util.Random;

public class DeleteController {
	File pathFile;
	int damage;

	public DeleteController(File f, int percentDamage) {
		this.pathFile = f;
		this.damage = percentDamage;
	}

	public void DeleteRandomStuff() {

		File list[] = pathFile.listFiles();

		Random rng = new Random();

		for (int i = 0; i < list.length; i++) {
			if (rng.nextInt(100) < damage) {
				new Deleter(list[i]).Delete();
			}
		}

	}
}
