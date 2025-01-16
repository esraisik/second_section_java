package day11_nestedForLoopveMetotOlusturma;

public class C12_ToplamHesapla {

    public static void main(String[] args) {

        // verilen iki tamsayi ve aralarindaki tum tamsayiları toplayıp
        // sonucu donduren bir metot olusturun

        araliktakiToplamiGetir(4, 6); // calisir ama yazdirmadiğimiz için göremeyız
        // ve kaydetmediğimiz için kullanamayız

        System.out.println(araliktakiToplamiGetir(8, 10)); // 27
        //yazdırır ama tekrar kullanmayız


        int ikiBasSayilarToplami = araliktakiToplamiGetir(10, 99);
        // yazdırmadığımız için konsolda görmeyiz
        // ama istediğimiz zaman yazdırabilir ya da kullanabiliriz.

        //iki basamaklı sayilarin toplamının asal olup olmadığını yazdırın


    }


    public static int araliktakiToplamiGetir(int baslangic, int bitis) {


        int toplam = 0;
        if (baslangic < bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }
        } else {
            for (int i = baslangic; i >= bitis; i--) {
                toplam += i;
            }


        }
        return toplam;
    }

}
