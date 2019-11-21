package com.shadow.basiccipher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHelper {

	public static String encrypt(String key, String plainText) {
		String cipherText = "";
		
		int currPos = 0;
		int length, skip;
		
		do {
			length = plainText.length();
			skip = (int)(Math.random() * 3);
			
			currPos += skip;
			
			cipherText = plainText.substring(0, currPos) + key + plainText.substring(currPos);
			currPos += key.length();
			
			plainText = cipherText;
			
		}while(currPos < (length - 1));
		
		return plainText;
		
	}

	public static String decrypt(String regex, String sequence) {

		Pattern pattern = Pattern.compile(regex);

		Matcher regexMatcher = pattern.matcher(sequence.trim());

		return regexMatcher.replaceAll("");

	}

}
