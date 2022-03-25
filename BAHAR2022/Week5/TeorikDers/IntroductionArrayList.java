package TeorikDers;

import java.util.ArrayList;
import java.util.List;

public class IntroductionArrayList {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();// List sınıfından ArrayList objesi oluşturduk.
//      ArrayList<String> words = new ArrayList<>();  Bu şekilde de olabilirdi.
//      Hoca 8. satırdaki gibi görürseniz şaşırmayın dedi.
//      Bu ArrayList ve LinkedList ler List interface inden türetilmişmiş.

        System.out.println("Her eklenilen eleman bir öncekinin sonuna eklenir");
        friends.add("Burak");
        System.out.println("Liste: " + friends);
        friends.add("Baturalp");
        System.out.println("Liste: " + friends);
        friends.add("Kaan");
        System.out.println("Liste: " + friends);

        System.out.println("Listenin 2. indexindeki eleman nedir: " + friends.get(2));

        System.out.println("Listenin boyutu: " + friends.size());

        friends.add(1, "Cem");
        System.out.println("1. indexe Cem elemanı eklendikten sonra Liste: " + friends);

        System.out.println("Cem elemanı eklendikten sonra Listenin boyutu: " + friends.size());

        System.out.println("Listenin 2. indexindeki eleman nedir: " + friends.get(2));

        System.out.println("Liste Burak'ı içeriyor mu: " + friends.contains("Burak"));
        System.out.println("Baturalp listenin kaçıncı indexinde: " + friends.indexOf("Baturalp"));
        // listede 0 dan başlayarak arar ve eğer birden çok kere Baturalp olsaydı ilk bulduğu Baturalp in indexini
        // yazdırırdı















    }
}
