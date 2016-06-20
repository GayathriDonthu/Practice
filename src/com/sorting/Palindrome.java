package com.sorting;

public class Palindrome {
	public static void main(String[] args) {
		String a  = "kotdfok";
		String b = "";
		int length = a.length();
		for(int i =length -1 ; i >= 0 ; i --)
			b  = b + a.charAt(i);
		System.out.println(b);
		if(a.equals(b))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
