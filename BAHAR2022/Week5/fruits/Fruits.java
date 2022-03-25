package fruits;

import java.util.ArrayList;

public class Fruits {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("elma");
		list.add("muz");
		list.add("portakal");
		
		for (String fruit : list) {
			System.out.println(fruit);
		}
		

	}

}
