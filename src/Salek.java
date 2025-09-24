// tablica wyrazow od uzytkpwnika, on podaje ich liczbe
// znalezc wyrazy ktore maja najmniejsza i najwieksza liczbe samoglosek i podac ich indexy
// wydrukowac ten tekst zlozony z wyrazow oddzielony przecinkami
// a e i o u y

import java.util.Scanner;

public class Salek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę wyrazów: ");
        int count = Integer.parseInt(sc.nextLine());
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Podaj wyraz " + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        int maxNumberOfVowel;
        int indexOfMaxVowel = 0;
        int minNumberOfVowel;
        int indexOfMinVowel = 0;

        int vowelCountFirst = 0;
        for (int i = 0; i < words[0].length(); i++) {
            switch (words[0].charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'y':
                    vowelCountFirst++;
                    break;
            }
        }
        maxNumberOfVowel = vowelCountFirst;
        minNumberOfVowel = vowelCountFirst;

        for (int i = 0; i < words.length; i++) {
            int vowelCount = 0;
            for (int j = 0; j < words[i].length(); j++) {
                switch (words[i].charAt(j)) {
                    case 'a', 'e', 'i', 'o', 'u', 'y':
                        vowelCount++;
                        break;
                }
            }

            if (vowelCount >= maxNumberOfVowel) {
                maxNumberOfVowel = vowelCount;
                indexOfMaxVowel = i;
            }
            else if (vowelCount <= minNumberOfVowel) {
                minNumberOfVowel = vowelCount;
                indexOfMinVowel = i;
            }
        }

        String text = "";
        for (String word : words) {
            text += word + ",";
        }

        System.out.println("Największa liczba samogłosek: " + maxNumberOfVowel + ", na indeksie: " + indexOfMaxVowel);
        System.out.println("Najmniejsza liczba samogłosek: " + minNumberOfVowel + ", na indeksie: " + indexOfMinVowel);
        System.out.println("Tekst to: " + text);
    }
}
