package com.sorting;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Voting {
	public static void main(String[] args) {
		String[] votings = { "a", "b", "a", "c", "b", "a", "a", "b", "b", "d" };
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < votings.length; i++) {
			int value = 1;
			if (map.containsKey(votings[i])) {
				int temp = map.get(votings[i]) + 1;
				map.replace(votings[i], temp);
			}
			else {
				map.put(votings[i], value);
			}
		}
		System.out.println("Map:" + map);
		
		int maxValue=0;
		String winner=null;
		Set<String> keys = map.keySet();
		for(String k : keys){
			if(maxValue < map.get(k)){
				maxValue = map.get(k);
				winner = k;
			} 
			else if( maxValue == map.get(k) && !winner.equals(k)){
				if(winner.compareTo(k) < 0)
					winner = k;
			}
		}
		System.out.println("maxValue:"+ maxValue + " and winner is:"+winner);
		
	}
}
