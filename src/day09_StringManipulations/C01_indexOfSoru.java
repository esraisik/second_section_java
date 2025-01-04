package day09_StringManipulations;

import java.util.Scanner;

public class C01_indexOfSoru {
    public static void main(String[] args) {

        /*
                  Kullanicidan bir String ve aranacak metin alin.
                   Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin
-String aranan metni icermiyor
-Aranan metin String’de sadece 1 kere kullanilmis
-Aranan metin String’de sadece 1’den fazla kullanilmis


         */


          Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen arama yapılacak metni giriniz..:");
        String anaMetin= scanner.nextLine();

        System.out.println("Lütfen aranacak kelime veya metni giriniz..:");
        String arancakMetin= scanner.nextLine();

        //anaMetin= "javayı  cok sevdik hem de cok cok sevdik"
        // aranacakMetin = "java"


          int ilkKullanimindexi=anaMetin.indexOf(arancakMetin);
          int sonKullanımİndexi=anaMetin.indexOf(arancakMetin);

          if(ilkKullanimindexi== -1){
              System.out.println("Ana metin aranacak olan metni içermiyor");
          } else if (ilkKullanimindexi == sonKullanımİndexi) {
              System.out.println("Ana metinde aranacak metin sadce bir defa kullanılmıs");
          } else {
              System.out.println("Ana metinde aranacak metin sadce birden fazla kullanılmıs");
          }












    }
}
