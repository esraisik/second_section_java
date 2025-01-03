package day08_stringManipulations;

import java.util.Scanner;

public class C07_MailControl {

    public static void main(String[] args) {

        /*
                     SORU : kullanicidan bir mail alin
                     - mail @ icermiyorsa “gecersiz mail”
                      - mail @gmail.com icermiyorsa, “mail gmail olmali”
                     - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
                     yazdirin

         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen mail adresinizi giriniz..:");
        String mail = scanner.nextLine();

        if (!mail.contains("@")) ;
        {
            System.out.println("Geçersiz Mail");
        }
        if (!mail.contains("@gmail.com")) ;
        {
            System.out.println("mail gmail olmali");
        }
        if (!mail.endsWith("@gmail.com")) ;
        {
            System.out.println("mailde yazım hatası var");

        }


        // Ödev: soruyu aynı şartlarda if else statements ile çözün.


    }
}
