package day13_dowhileloop_scope;

import java.util.Scanner;

public class C04_doWhileLoop {

    public static void main(String[] args) {

        //kullanıcıdan pozitif bir tam sayı alın
        // sayidan baslayarak 0'a kadar olan tam sayilari yazdırın.

        /*
        Do While Loop için

        Artı özellikleri
        - kontrolden once loop bod'si bir kere calısır
          boylece ilk atamada hata yapma riskini giderir.
        - loop body calısma sayısı ile kontrol sayısı aynı

        Eksi özellikleri
        - kontrolden once loop bod'si bir kere calısır
         eger kullanıc istenmeyen bir deger girmisse
         o deger bir defa loop'da calıstırılır

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz..:");
        int girilenSayi = scanner.nextInt();


        do {
            System.out.println(girilenSayi + " ");
            girilenSayi--;


        } while (girilenSayi > 0);


    }
}
