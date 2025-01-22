package day13_dowhileloop_scope;

import java.util.Scanner;

public class C02_doWhileLoop {


    public static void main(String[] args) {


        // kullanicidan bir sayi alin
        // sayidan baslayarak 0'a kadar(0 haric) olan sayilari yazdirin
        // ornek input : 5    output : 5 4 3 2 1


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz..:");
        int girilenSayi = scanner.nextInt();


        //  1. negatif durum: loop body calısma sayısından, daha fazla kontrol var

        //  while (girilenSayi>0) {

        //  System.out.println(girilenSayi + " ");
        //  girilenSayi--;
        // }


        // loop body calısma sayısı ile kontrol sayısı aynı

        do {
            System.out.println(girilenSayi + " ");
            girilenSayi--;

        } while (girilenSayi > 0);


    }
}
