package day08_StringManipulations;

public class C03_contains {
    public static void main(String[] args) {

// Verilen bir string variable icinde baska bir string variable olup olmadığını kontrol eder.
//Kontrol edip sonuc olarak kac tane olduğunu vermez. Varsa true , yoksa false verir. yani boolean sonuc döner.
// contains case sensetive'dir. Buna göre arama yapar.
//Parametre olarak sadce string deger kabul eder.

        String str="Ne güzel 1 gün";
        int sayi=1;

        System.out.println(str.contains("e")); // true

        System.out.println(str.contains("ne")); //false

        System.out.println(str.contains("güzel")); // true

        System.out.println(str.contains("üz")); //true
        System.out.println(str.contains(1+"")); // true

        // Contains metodu String dışında parametre kabul  etmez,
        // bu nedenle int olan sayi değerini string'e cevirmek gerekir
        //yanına string bir hiçlik koyduğumuzda bu içerideki tüm değerlerin String algılanmasını saglar.

        System.out.println(str.contains("1")); //true
        System.out.println(str.contains(sayi+""));//  true
        System.out.println(str.contains("Ne  güz"));// false






    }
}
