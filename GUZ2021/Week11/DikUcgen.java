package evdeDeneyinHomework;

public class DikUcgen {

	public static int N = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int satir, yildiz;
		for(satir = 1; satir <= N; satir++) 
		{
			for(yildiz = 1; yildiz <= satir; yildiz++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
		/* 		int satir, yildiz;
		for(satir = N; satir >= 1; satir--) 
		{
			for(yildiz = 0; yildiz <= N + (-1*satir); yildiz++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
}
