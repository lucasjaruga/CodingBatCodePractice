package map_1;

import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */

public class MapAB2 {
	public static Map<String, String> mapAB2(Map<String, String> map) {
		boolean isAB = map.containsKey("a") && map.containsKey("b");
		boolean areEq = map.get("a") == map.get("b");
		
		if (isAB && areEq) {
			map.remove("a");
			map.remove("b");
		}
		return map;
	}
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aaa");
		map.put("b", "aaa");
		map.put("c", "cake");
		System.out.println(mapAB2(map));
	}
}