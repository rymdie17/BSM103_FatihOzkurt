package TeorikDers;

import java.util.ArrayList;
import java.util.List;

public class ChangesOnObjectsPermanent {
    // ArrayList bir obje olduğu için metodların içine yollandığında referansı ile aktarılır.
    // Bu yüzden herhangi bir yerde ArrayList objesi üzerinde yapılan değişiklik onunla kalır.
    // İlk dönem anlattığını tekrar hatırlattı yani sınavda soru da sormuşlardı ya mystery() şeysi

    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            prices.add(i * 10.0);
        }
        System.out.println(prices); // listeyi yazdırdık

        removeElements(prices);     // elemanlarını silen metoda yolladık

        System.out.println(prices); // listeyi yazdırdık

    }

    public static void removeElements(List<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            i--;
        }
    }
}
