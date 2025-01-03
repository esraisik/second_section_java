package day08_stringManipulations;

import java.util.Scanner;

public class C08_indexOf {

    public static void main(String[] args) {

        // İndexof metodu tek parametre ile yazılırsa o parametrenin ilk bulunduğu index'i
        // iki parametre olarak yazılırsa da verilen indexten sonraki il kullanımın indexini verir DİKKAT!!!!!


        String str = "Çok çalışmam gerekiyor çok";

        // a harfi ilk olarak hangi indexte
        System.out.println(str.indexOf("a"));//5

        // çalış kelimesi hangi indexten itibaren başlıyor
        System.out.println(str.indexOf("çalış"));//4

        //5. indexten sonra aradığında ilk o harfi hangi indextedir.
        System.out.println(str.indexOf('o', 5));
        //DİKKAT: aramaya verilen indexten başlar fakat index sayarken baştan sayar.


        //metin içinde olmayan bir harf aranırsa
        System.out.println(str.indexOf('x'));// -1
        System.out.println(str.indexOf("murat"));// -1
        // sonuç -1 yazarsa aranan şey metimde yoktur.

        /*
                   ÖDEV: Kullanıcan bir metin alıp
                   metinde birden fazla a harfi varsa
                   a harfinin ikincisinin
                   hangi indexte olduğun yazdırın.
                   Bir tane varsa bir tane var yazdırın


         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz..:");
        String metin = scan.nextLine();
        System.out.print("Hangi harfi arıyorsunuz..?");
        char harf = scan.next().charAt(0);
        int ilkkullanim = metin.indexOf(harf);
        if (ilkkullanim == -1) {
            System.out.println("Aradığınız harf metinde yoktur.");
        } else {
            System.out.println("Aradığınız harfin ilk index no" + ilkkullanim);
        }
        int ikincikullanim = metin.indexOf(harf, ilkkullanim + 1);
        if (ilkkullanim != -1 && ikincikullanim == -1) {
            System.out.println("Aradığınız harften bir tane vardir.");
        } else {
            System.out.println("Aradığınız harfin ikinci index no" + ikincikullanim);
        }

    }

}
