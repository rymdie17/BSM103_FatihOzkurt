
public class isSortedExp {

	public static void main(String[] args) {
	
		double[] list = {1.5, 4.3, 7, 19.5, 40, 25.1, 46.2};
		System.out.println("Liste sıralı mı: " + isSorted(list));

	}
	
	public static boolean isSorted(double[] list) {
		for (int i = 0; i < list.length-1; i++) {
			if (list[i] > list[i+1]) {
				return false;
			}
		}
		
		return true;
	}

}
