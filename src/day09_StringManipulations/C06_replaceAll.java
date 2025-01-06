package day09_StringManipulations;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        //Kullanıcıdan bir metin isteyiniz
        // metindeki  boşluk ve harf olmayan her seyi silin.
        // ornek :J1a4v*a )G*&^56uzel_!dir.
        //         Java guzeldir.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz..:");
        String metin = scanner.nextLine(); //J1a4v*a )G*&^56uzel_!dir.


        // önce sayılardan kurtulalım

        metin = metin.replaceAll("\\d", ""); //Jav*a )G*&^uzel_!dir.

        // ozel karakterleri silmeden önce
        // " "  boslukları korumaya almamız gerekiyor
        // yukarıda sayıları yok etmiştik. space yerine herhangi bir rakam yazalım

        metin = metin.replace(" ", "8");


        // özel karakterlerden kurtulalım
        metin = metin.replaceAll("\\W", ""); //JavaGuzel_dir // \\W harf rakam ve Altcizgi dısındaki her seydır

        // _'yi yok edelim
        metin = metin.replaceAll("_", "");

        // space yerine 8 yazmıştık, onu yeniden space yapalım

        metin = metin.replaceAll("8", " ");


        // en sona bir nokta koyalım
        metin += ".";


        System.out.println(metin);


    }
}
