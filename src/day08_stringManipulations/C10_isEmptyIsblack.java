package day08_stringManipulations;

public class C10_isEmptyIsblack {

    public static void main(String[] args) {

     /*
         isEmpty:  Verilen String'in içinin boş olup olmadğını kontrol eder.
                   Hiçlikleri boş kbul ederken space ile boş bırakılırsa boşluk değil der.

         isBlank: isEmpty'den farklı olarak sade hiçlik için değil
                  spaceiçin de bırakılan boşlukları boşluk kabul eder.

      */

        String str1 = "Java çok güzel";
        String str2 = "";
        String str3 = "         ";


        System.out.println(str1.isEmpty()); // false
        System.out.println(str2.isEmpty()); // true
        System.out.println(str3.isEmpty()); //false
        System.out.println("..........................");
        System.out.println(str1.isBlank()); // false
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); //true

    }
}
