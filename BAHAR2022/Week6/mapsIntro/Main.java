package mapsIntro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		// ilk kisim yani key kismi set gibi davranir yani ayni key den sadece bir tane olabilir.
		// ikinci kisim yani value kismi ayni olabilir.
		Map<Integer, String> cities = new HashMap<>();
		
		cities.put(34, "Istanbul");
		cities.put(17, "Canakkale");
		cities.put(35, "Izmir");
		cities.put(74, "Bartin");
		cities.put(17, "Antalya");
		
//		System.out.println(cities);
//		System.out.println("Keys: " + cities.keySet());
//		System.out.println("Values: " + cities.values());
		
		Map<Integer, Set<String>> plates = new HashMap<>();
		
		plates.put(34, new TreeSet<String>());
		plates.get(34).add("Istanbul");
		plates.get(34).add("Besiktas");
		plates.get(34).add("Eminonu");
		
		plates.put(06, new TreeSet<String>());
		plates.get(06).add("Ankara");
		plates.get(06).add("Cankaya");
		
		System.out.println(plates);
		
		
	}
}	
