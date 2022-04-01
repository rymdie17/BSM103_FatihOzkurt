package setsIntro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {
		
		// Setler eleman tekrarina izin vermeyen listlerdir
		
		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("kalem");
		lists.add("masa");
		lists.add("bilgisayar");
		lists.add("defter");
		lists.add(3, "dolap");
		lists.add("kalem");
		lists.add("masa");
		
		System.out.println(lists);
		System.out.println(lists.size());
		
		// setler treeSet ve hashSet ten turetilir.
		// setlerde elemanlara indexleri ile erisemiyoruz.
		// kume gibidir.
		Set<String> sets = new HashSet<>();
		
		sets.add("kalem");
		sets.add("masa");
		sets.add("bilgisayar");
		sets.add("defter");
		sets.add("kalem");
		sets.add("masa");
		
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("dolap"));
		
		sets.clear();		// sets in icindekileri silme
		System.out.println(sets);
		
		sets.addAll(lists);	// sets e listsi ekleme
		System.out.println(sets);
		
		
		
	}
}
