
public class isUniqExp {

	public static void main(String[] args) {

		//elemanların tekrar etmemesi gerek
		
		int[] list = {3,1,8,12,2,9,17,43,-8,46};
		System.out.println(isUniqe(list));

	}
	
	public static boolean isUniqe(int[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = i+1; j < list.length; j++) {  //dinamik olmalı
				if(list[i] == list[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
