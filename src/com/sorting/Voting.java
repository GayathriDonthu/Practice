package com.sorting;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Voting {
	public static void main(String[] args) {
		
		// first method
		
		/*String[] votings = { "a", "b", "a", "c", "b", "a", "a", "b", "b", "d" };
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
		System.out.println("maxValue:"+ maxValue + " and winner is:"+winner);*/
		
		// second method
		
		String[] votings = { "d", "b", "a", "c", "d", "b", "a", "b", "b", "d", "a" , "d"};
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		int maxValue=0;
		for (int i = 0; i < votings.length; i++) {
			map.put(votings[i], map.get(votings[i]) == null ? 1:map.get(votings[i])+1);
			maxValue = (maxValue < map.get(votings[i]) ? map.get(votings[i]) : maxValue);
		}
		System.out.println("Map:" + map);
		System.out.println("maxValue:"+ maxValue);
				
		List<Map.Entry<String, Integer>> list = new ArrayList();
		list.addAll(map.entrySet());
		
		for(int i = list.size()-1 ; i >= 0 ; i--){
			if(list.get(i).getValue() == maxValue){
				System.out.println("Winner is:"+ list.get(i).getKey());
				break;
			}
		}
		
	}
}
