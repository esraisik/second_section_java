package day13_dowhileloop_scope;

import java.util.Scanner;

public class C03_kullanicidanAlinanSayilariToplama {

    public static void main(String[] args) {


        // kullanıcıdan toplanmak üzere tam sayılar isteyın
        // kullanıcı 0!a basıncaya kadar işlemi devam ettirin
        // kullanıcı 0'a bastığında (0hariç) kaç sayi girdiğini ve
        // toplamlarının kaç olduğunuyazdırın


        Scanner scanner = new Scanner(System.in);

        int girilenSayi;
        int toplam = 0;
        int sayac = 0;

        //    while (girilenSayi != 0) {
        //    System.out.println("lütfen toplanmak üzere bir sayi giriniz....\nbitirmek icin 0'a basiniz");
        //    girilenSayi= scanner.nextInt();

        //     if (girilenSayi != 0){

        //         toplam += girilenSayi;
        //         sayac++;


        //    }
        // }


        // bizim ilk atama yaptığımız degeri while kontrolune sokmadan
        // kullanıcıda deger alıyor
        //boylece ilk deger ataması yaparken hata yapmamızı engelliyor

        do {
            System.out.println("lütfen toplanmak üzere bir sayi giriniz...: \nbitirmek için 0'a basınız");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }

        } while (girilenSayi != 0);


        System.out.println("Girilen" + sayac + "adet sayinin toplamı :" + toplam);

    }
}
