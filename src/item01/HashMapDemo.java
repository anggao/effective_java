package item01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static <K, V> HashMap<K, V> newInstance(){
		return new HashMap<K,V>();
	}
	
	public static void main(String[] args) {
		Map<String, List<String>> m = HashMapDemo.newInstance();
	}
}
