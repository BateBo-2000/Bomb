
package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DamageGenerator {
	int damage;
	String message[], extentions[];
	File path;
	boolean random = false, doomsDayMode = false, delete = false;

	public DamageGenerator(int damage, File path, String extentions[], String trollMessage[], boolean random,
			boolean doomsday, boolean delete) {
		this.damage = damage;
		this.path = path;
		this.extentions = extentions;
		this.random = random;
		this.doomsDayMode = doomsday;
		this.delete = delete;
		this.message = trollMessage;
	}

	public DamageGenerator(int damage, File path, String extentions[], String trollMessage[]) {
		this.damage = damage;
		this.path = path;
		this.extentions = extentions;
		this.message = trollMessage;
	}

	public DamageGenerator(int damage, File path, String extentions[], boolean random, boolean doomsday,
			boolean delete) {
		this.damage = damage;
		this.path = path;
		this.extentions = extentions;
		this.random = random;
		this.doomsDayMode = doomsday;
		this.delete = delete;
	}

	public DamageGenerator(int damage, File path, String extentions[]) {
		this.damage = damage;
		this.path = path;
		this.extentions = extentions;
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

	}

	public static void randomFlooding() {

	}

}
