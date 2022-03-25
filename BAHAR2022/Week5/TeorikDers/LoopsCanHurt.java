package TeorikDers;

import java.util.ArrayList;
import java.util.List;

public class LoopsCanHurt {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); // <..> içine yazılacak olan veri tipi primitive olmamalı
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);
        }
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            numbers.remove(i);
        }
        System.out.println(numbers);   //--> Bunun çıktısı [20, 40, 60, 80, 100] şeklinde olacaktır
        // Çünkü 0. indexdeki elemanı kaldırdığında 1. eleman 0. nın yerine geçer
        // ve loopun counterı i bir artarak 1 olur ve artık yeni 0. eleman olan 20 yi elinden kaçırır
        // bu şekilde devam eder.
        // Bunu düzeltmek için
        for (int i = 0; i < numbers.size(); i++) {
            numbers.remove(i);
            i--; // şu şekilde bir kontrol sağlanabilir.
        }
        System.out.println(numbers);

/*
        // Veya son indexten başlayarak sondan başa silinebilir
        for (int i = numbers.size() - 1; i >= 0; i--) {
            numbers.remove(i);
        }
        System.out.println(numbers);
 */
    }
}
