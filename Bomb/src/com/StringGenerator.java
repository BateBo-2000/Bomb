package com;

import java.util.Random;

public class StringGenerator {
	private static int stringLength, charLeftLimit = 65, charRightLimit = 123;

	public StringGenerator(int length, int leftLimit, int rightlimit) {
		stringLength = length;
		charLeftLimit = leftLimit;
		charRightLimit = rightlimit;
	}

	public StringGenerator(int length, boolean lettersCase) {
		stringLength = length;
		// true equals Uppercase
		if (lettersCase) {
			charLeftLimit = 65;
			charRightLimit = 91;
		} else { // false equals LowerCase
			charLeftLimit = 97;
			charRightLimit = 123;
		}

	}

	public StringGenerator(int length) {
		stringLength = length;
	}

	public String generateString() {
		Random rng = new Random();
		String result = "";
		int usableRange = charRightLimit - charLeftLimit , temp;
		
		for (int i = 0; i < stringLength + 1; i++) {
			temp = rng.nextInt(usableRange) + charLeftLimit;
			if (temp>96 || temp<91) {
					result += Character.toString((char)temp);
			}
			
		}
		return result;
	}
}
