package com.x.qa.test.collection;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapBasedOnValues {
	
	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<>();
		map.put("Rinku", -12);
		map.put("Arvind"
				+ "", -12);
		map.put("Ramesh", -5);
		map.put("Suresh", -7);
		Map<String, Integer> sortedMap= new HashMap<>();
		
		String[] negativeNames=sortByNegative(map);
		System.out.println("negavtive names - " +negativeNames[0] + " "+ negativeNames[1] );
		
		
	}

	private static String[] sortByNegative(Map<String, Integer> map) {
		Map<String, Integer> sortedMap;
		sortedMap=map.entrySet().stream()
					.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
							(e1, e2)->e1, LinkedHashMap::new));
		
		
		List<Map.Entry<String,Integer>> list=new LinkedList<Map.Entry<String, Integer>>(sortedMap.entrySet());
		List<String> listOfStr= new ArrayList<String>();
		listOfStr.add(list.get(0).getKey());
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(0).getValue()==list.get(i+1).getValue()) {
				listOfStr.add(list.get(i+1).getKey());
				continue;
			} 
			break;
		}
		if(listOfStr.isEmpty()){
			return new String[]{
			        "Nobody has a negative balance"
		    };
		}else if (listOfStr.size()==1) {
			return listOfStr.toArray(new String[0]);
		}else {
			return listOfStr.stream().sorted().collect(Collectors.toList()).toArray(new String[0]);
		}
	}
	
	public static void test(Map<String, Integer> map) {
		Set<String> set=map.keySet();
		Set<Map.Entry<String, Integer>> entrySet= map.entrySet();
		List<Map.Entry<String, Integer>> entryList= new LinkedList<Map.Entry<String, Integer>> (map.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
	}

}
