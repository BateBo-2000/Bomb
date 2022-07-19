
package com;

import java.io.File;
import java.util.ArrayList;

public class DamageGenerator {
	int damage;
	String message[];
	File path;
	boolean random = false, doomsDayMode = false, delete = false;
	
	public DamageGenerator(int damage, File path,  String trollMessage[], boolean random, boolean doomsday, boolean delete) {
		this.damage = damage;
		this.path = path;
	}
	public DamageGenerator(int damage, File path ,String trollMessage[]) {
		this.damage = damage;
		this.path = path;
	}
	public DamageGenerator(int damage, File path,  boolean random, boolean doomsday, boolean delete) {
		this.damage = damage;
		this.path = path;
	}
	public DamageGenerator(int damage, File path) {
		this.damage = damage;
		this.path = path;
	}
	
	
	
	
	
	
}
