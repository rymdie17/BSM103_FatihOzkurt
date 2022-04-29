package linkedLists;

public class Main {

	public static void main(String[] args) {
		LinkedIntList linklist = new LinkedIntList();
		
		linklist.add(5);
		linklist.add(7);
		linklist.add(9);
		
		System.out.println(linklist.indexOf(0));
		System.out.println(linklist);
		
		linklist.add(0, 13);

		linklist.add(2, 31);
		
		int count = linklist.size();
		
		System.out.println(linklist);
		System.out.println(count);
		
	}	

}
