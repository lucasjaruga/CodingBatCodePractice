package map_1;

import java.util.Map;

/*
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */

public class MapAB3 {
	public Map<String, String> mapAB3(Map<String, String> map) {
		boolean onlyA = map.containsKey("a") && !map.containsKey("b");
		boolean onlyB = map.containsKey("b") && !map.containsKey("a");

		if (onlyA) {
			map.put("b", map.get("a"));
		} else if (onlyB) {
			map.put("a", map.get("b"));
		}

		return map;
	}
}