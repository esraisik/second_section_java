package day08_stringManipulations;

public class C05_startsWith {

    public static void main(String[] args) {

        /*
             Bir string'in baska bir string ile baslayıp baslamadığını kontrol eder.
             İki kullanımı vardır:
             İlkıinde bastan bakar
             İkincisinde istediğiniz index'in istediğiniz bir String ile
             baslayıp baslamadığını kontrol eder.

         */



     String str="Java öğrenmek çok güzel çok";
        System.out.println(str.startsWith("J")); //true J
        System.out.println(str.startsWith("Java "));// true Java
        System.out.println(str.startsWith("Java öğrenmek çok güzel çok "));// true Java öğrenmek çok güzel çok


        System.out.println(str.startsWith("öğrenmek",5)); // true



    }
}
