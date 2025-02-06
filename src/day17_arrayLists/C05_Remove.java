package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4, 6, 1, 9, 3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Cemil", "Ayse", "Fatma", "Hatice"));

        System.out.println(isimler); // [Ali, Veli, Cemil, Ayse, Fatma, Hatice]

        //Listeden Ali'yi silin
        isimler.remove("Ali");

        System.out.println(isimler);  // [Veli, Cemil, Ayse, Fatma, Hatice]


        isimler.remove(2);

        System.out.println(isimler); // [Veli, Cemil, Fatma, Hatice]

        // Eger list sayilardan olusuyorsa
        // Java girilen sayiyi direkt index olarak alır,
        // eger sayi olan 4'u silmek isterseniz
        // bunu once object olarak olusturmalisiniz

        sayilar.remove(4);

        System.out.println(sayilar); // [4, 6, 1, 9]

        // sayilar listesinden 9'u silin

        //sayilar.remove(9); //IndexOutOfBoundsExeption

        Integer silinecekSayi = 9;

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar);  // [4, 6, 1]


    }
}
