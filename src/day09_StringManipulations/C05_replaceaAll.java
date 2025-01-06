package day09_StringManipulations;

public class C05_replaceaAll {

    public static void main(String[] args) {

        String str = "Ali okula gitti. 3saat sonra gelecek.";

        // Tum t'leri "T"yap

        System.out.println(str.replace("t", "T")); // Ali okula giTTi. 3saat sonra gelecek.

        // 3 yerine 2 yazın


        System.out.println(str.replace("3", "2"));// Ali okula gitti. 2 saat sonra gelecek.


        // replace metodu verilen metinde aranan char veya strin'in
        // tüm kullanımlarını bulur ve değiştirir.

        // replaceAll()' un farkı  regex kullanılabilmesidir.

        str = "ben 2 veya 3 saat sonra gelirim.";

        // tüm sayıları 5 yapın

        System.out.println(str.replaceAll("\\d", "5")); // ben 5 veya 5 saat sonra gelicem


    }
}
