package day13_dowhileloop_scope;

public class C07_Scope_ClassLevelVariable {

    /*

        Class level'da olusturulan variable'ların scope'u tum class'tir.
        yanı her yerden kullanılabilir olmalı

        AMMAA direkt kullanılabilir olması Static keyword'e baglıdır.

         -static variable'lar her yerde direkt kullanılabilir.

         - instance variable'lar static olamyan methodlardan dirak kullanılabilir
           ama satatic methot'lardan direkt KULLANILAMAZ, obje olusturup kullanmamız gerekir

     */


    public String str = "java candir";
    static String isim;
    static int sayi1 = 10;
    public int numara;
    public boolean emekliMi = true;
    public static boolean aktifMi;
    public static char ilkHarf = 'A';
    static char karakter;


    public static void main(String[] args) {

        System.out.println(isim); // null
        System.out.println(ilkHarf);// A
        System.out.println(karakter);// hiclik
        System.out.println(aktifMi);// false
        System.out.println(sayi1); //10


        C07_Scope_ClassLevelVariable obj = new C07_Scope_ClassLevelVariable();

        System.out.println(obj.emekliMi); // true
        System.out.println(obj.str); //java candir
        System.out.println(obj.numara); //0

    }

}
