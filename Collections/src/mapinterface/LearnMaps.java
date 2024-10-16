package mapinterface;

import java.util.*;
public class LearnMaps {

	public static void main(String[] args) {
		
	//	List<Integer> list = new ArrayList<>();

		Map<String, String> map = new HashMap<>();
		
		map.put("us","United states");
		map.put("in","India");
		map.put("in","India2");
		map.put("en","India");
		map.put("pn","poland");

		
		System.out.println(map);
		
		map.remove("us","US");
		map.remove("us");
		
		System.out.println(map);
		
		System.out.println(map.containsKey("in"));
		
		System.out.println(map);
		System.out.println(map.get("in"));
		System.out.println(map.get("en"));
		System.out.println("Contains value : " + map.containsValue("Indian"));
		
		System.out.println(map.keySet());
		Set<String> keys = map.keySet();
		System.out.println(keys);
		System.out.println(map.values());
		Collection<String> val = map.values();
		System.out.println(val);
		
		System.out.println("--------------------");
		
		Map<String, String> map2 = new HashMap<>();
		map2.putAll(map);
		System.out.println(map2);
		System.out.println(map);
		
		Set<Map.Entry<String, String>> entries = map.entrySet(); // It returns entry set, Entry is a class by which our map is made

		System.out.println(entries);
	}

}
