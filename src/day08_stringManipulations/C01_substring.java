package day08_stringManipulations;

public class C01_substring {

    public static void main(String[] args) {
        //012345678901234567890123456789
        String str = "Java gün geçtikçe güzelleşiyor";
        // 123456789012345678901234567890
        System.out.println(str.length());

        // 19. karakteri yazdırın.
        System.out.println(str.charAt(19));// ü,  bu harfi charAt kullanarak büyük yazdıramayız,
        // char değerlerde string metotlar calısmaz.

        System.out.println(str.substring(19, 20).toUpperCase()); // Ü

        //10.karakterden başla sona kadar yazdır.
        System.out.println(str.substring(9));//geçtikçe güzelleşiyor

        // 10. karakter ile 10. index farklı şeylerdir.
        // İndex 0'dan basladığı için 10. karakter 9. indexteki karaktere denk gelir.

        //10.İndexten sonrasın yazdır.
        System.out.println(str.substring(10));//eçtikçe güzelleşiyor

        // İlk kelime haric kalanını yazdır.
        System.out.println(str.substring(5));

        // Son altı karakteri yazdır.
        System.out.println(str.substring(str.length() - 6));//eşiyor

        // son harfi yazdırın.
        System.out.println(str.substring(str.length() - 1));//r
        System.out.println(str.substring(29));

        System.out.println(" ");// boşluk
        System.out.println(str.substring(str.length()));// hiçlik
        // System.out.println(str.substring(str.length()+1));//StringIndexOutOfBoundsException
        //System.out.println(str.substring(5,2));//StringIndexOutOfBoundsException

        //İlk on karakteri yazdırın.
        System.out.println(str.substring(0, 10));//Java gün g

        System.out.println(str.substring(12, 12));


    }
}
