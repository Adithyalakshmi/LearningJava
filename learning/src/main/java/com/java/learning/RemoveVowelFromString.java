package com.java.learning;

import java.util.Scanner;

public class RemoveVowelFromString {

	public static void main(String[] args) {
		
		RemoveVowelFromString removeVowels = new RemoveVowelFromString();
		removeVowels.removeVowelUsingReplaceAll();
	}
	
	public void removeVowelUsingReplaceAll() {
	       String str1, str2;
	       Scanner scan = new Scanner(System.in);
	       System.out.print("Enter a String : ");
	       str1 = scan.nextLine();
	       str2 = str1.replaceAll("[aeiouAEIOU]", "");
	       System.out.println("All Vowels Removed Successfully..!!");
	       System.out.println("New String is : "+str2);
		
	}
}
