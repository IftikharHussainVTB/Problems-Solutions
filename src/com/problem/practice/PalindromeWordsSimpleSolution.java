package com.problem.practice;

import java.util.Arrays;

public class PalindromeWordsSimpleSolution {
	
	/*
	 * given an input array check how many words are palindrome 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	public static long countPalindrome(String[] palindrome){
		
		
		return Arrays.stream(palindrome)
				.filter(word-> new StringBuilder(word).reverse().toString().equalsIgnoreCase(word)).count();
		
	}
	
	public static void main(String args[]) {
		
		String[] palindrome = {"solos","Anna","Civic","not palindrome"};
		System.out.println(countPalindrome(palindrome));
		
		
	}

}
