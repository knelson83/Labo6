
package com.mycompany.exercise;


public class MainClass {

public static void main(String[] args){
	String myPlainText = "attack at noon";
	String myEncryptedText = encrpt(myPlainText, 50);
	
	System.out.println("Plain Text: " + myPlainText);
	System.out.println("Encrypted Text: " + myEncryptedText);
	
}

public static String encrpt(String plainText, int key){
	
	String alphabet = "abcdefghijklmnopqrstuvwxyz ";
	
	char currentChar;
	int currentCharPos;
	int encryptedCharPos;
	char encryptedChar;
	String encryptedText = "";
	
	for(int i = 0; i <plainText.length(); i++){
		
		
		currentChar = plainText.charAt(i);
		currentCharPos = alphabet.indexOf(currentChar);
		encryptedCharPos = (currentCharPos + key)% 26;
		encryptedChar = alphabet.charAt(encryptedCharPos);
		
		encryptedText = encryptedText + encryptedChar;
	}
	
	
	return encryptedText;
}
}