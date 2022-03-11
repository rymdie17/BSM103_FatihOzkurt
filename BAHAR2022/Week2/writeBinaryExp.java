
import java.util.Scanner;

public class writeBinaryExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı yaz: ");
		System.out.println(writeBinary(scanner.nextInt()));
    }

    public static int writeBinary(int n) {
        if(n <= 2) {
            return 1;
        }
        return writeBinary(n/2)*10+n%2;
    } 
}
