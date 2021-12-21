package evdeDeneyinHomework;

public class ChristmasTree {
	
	public static final int N = 11;
	
	public static void main(String[] args) {
		
		int satir,sutun,bosluk;
		
		for(satir = 1; satir <= N; satir++) {
			for(bosluk = 1; bosluk <= N-satir; bosluk++) {
				System.out.print(" ");
			}
			for(sutun = 1; sutun <= satir; sutun++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(satir = 1; satir <= N; satir++) {
			for(bosluk = 1; bosluk <= N-satir; bosluk++) {
				System.out.print(" ");
			}
			for(sutun = 1; sutun <= satir; sutun++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
