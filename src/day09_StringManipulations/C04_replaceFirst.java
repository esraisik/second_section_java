package day09_StringManipulations;

import java.util.Scanner;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str = "Java ile yazilim dunyasına giris yap";

        System.out.println(str.replaceFirst("a", "A")); //JAva ile yazilim dunyasına giris yap

        //str.replaceFirst('a','A'); replaceFirst() char parametre kabul etmez

        str = "Java 1-3 ayda ogrenilir";

        System.out.println(str.replace("1", " 2)")); //Java 2-3 ayda ogrenilir


        // Kullanıcıdan bir cümle isteyin
        // eger cumle içinde rakam varsa, ilk rakam yerine X yazın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz..:");
        String cumle = scanner.nextLine();


        /*

              \\d	Bir rakam (0-9)
               \\D	Rakam olmayan karakter
               \\w	Bir kelime karakteri (a-z, A-Z, 0-9 ve _ )
                \\W	Kelime karakteri olmayan bir karakter
                  \\s boşluk karakteri (boşluk, tab, yeni satır vb.)
                \\S	 boşluk olmayan karakter

         */

        System.out.println(cumle.replaceFirst("\\d", "X"));


    }

}
