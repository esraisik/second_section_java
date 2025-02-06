package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucVsReturn {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4, 6, 1, 9, 3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Cemil", "Ayse", "Fatma", "Hatice"));

        System.out.println(sayilar);  // [4, 6, 1, 9, 3]

        System.out.println(sayilar.set(2, 5)); // 1
        // asıl işi 2. indexteki elementi 5 yapmak
        // asıl isini yaptı, delil olarak eski elementi getirdi


        System.out.println(isimler.remove("Ali")); // true
        System.out.println(isimler.remove("Pelin Su")); // false
        System.out.println(isimler);  // [Veli, Cemil, Ayse, Fatma, Hatice]


        System.out.println(isimler.remove(2)); // Ayse
        System.out.println(isimler); // [Veli, Cemil, Fatma, Hatice]

        System.out.println(sayilar.remove(3));// 9


        Integer silicekSayi = 4;

        System.out.println(sayilar.remove(silicekSayi)); // true


    }
}
