package TeorikDers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Readsome {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;

        scanner = new Scanner(new File("C:\\Users\\Rymdie\\IdeaProjects\\Workspace\\AlgoritmaHafta\\Week5\\TeorikDers\\words.txt"));

        List<String> wordList = new ArrayList<>();

        while (scanner.hasNext()) {     // dosya içinde string verisi devam ettiği sürece
            wordList.add(scanner.next());  // words listesine verileri ekle
        }

        System.out.println(wordList);      // listeyi yazdır

        String word = wordList.get(0);      // bir problem olmadan eşitledik.
        System.out.println(word);

        System.out.println("----------------------------------------------------------------------------------");

        List<Integer> numberList = new ArrayList<>();

        scanner = new Scanner(new File("C:\\Users\\Rymdie\\IdeaProjects\\Workspace\\AlgoritmaHafta\\Week5\\TeorikDers\\numbers.txt"));

        while (scanner.hasNext()) {     // dosya içinde string verisi devam ettiği sürece
            numberList.add(Integer.valueOf(scanner.next()));  // numbers listesine verileri ekle
        }

        System.out.println(numberList);      // listeyi yazdır

        int number = numberList.get(0);
        System.out.println(number);
    }
}
