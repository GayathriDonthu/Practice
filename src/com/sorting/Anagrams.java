package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String1:");
		String s1 = br.readLine();
		System.out.println("Enter String2:");
		String s2 = br.readLine();
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		int value = 1;
		
		if(s1.length() != s2.length())
			System.out.println("Not anagrams");
		else {
			
			for(int i=0; i<s2.length(); i++) {
				map1.put(s1.charAt(i), map1.get(s1.charAt(i)) == null ? value : map1.get(s1.charAt(i)) + 1);
				map2.put(s2.charAt(i), map2.get(s2.charAt(i)) == null ? value : map2.get(s2.charAt(i)) + 1);
			}
			System.out.println("Map1:"+map1);
			System.out.println("Map2:"+map2);
			
			//comparing maps
			
			if(map1.entrySet().equals(map2.entrySet()))
				System.out.println("Anagrams");
			else
				System.out.println("Not anagrams");
		}
	}
}
