package day11_nestedForLoopveMetotOlusturma;

public class C10_FaktoryelDegeriYazdirma {

    public static void main(String[] args) {

        //18'den kucuk pozitif bir tamsayi verildiginde
        //sayinin faktoriyel degerini yazdıracak
        //bir metot olusturun


        faktoryelYazdir(4); // 4! = 24
        faktoryelYazdir(6); // 6! = 720

    }


    public static void faktoryelYazdir(int sayi) {

        int faktoryelDegeri = 1;

        for (int i = sayi; i >= 1; i--) {

            faktoryelDegeri *= i;


        }

        System.out.println(sayi + "! = " + faktoryelDegeri);

    }


}
