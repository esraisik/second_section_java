package day09_StringManipulations;

import java.util.Scanner;

public class C03_replace {
    public static void main(String[] args) {


        String str = "Java ogrenmek cok guzel";

        System.out.println(str.replace("a", "A")); //JAvA  ogrenmek cok guzel

        System.out.println(str.replace("e", "E")); // Java ogrEnmEk cok guzEl

        System.out.println(str.replace("ogrenmek", "bilmek")); // Java bilmek cok guzel


        // tüm boşluklaarı silip metni bosluk olmadan yazdırın

        System.out.println(str.replace(" ", ""));// Javaogrenmekcokguzel


        // Kullanıcıdan cümledeki değiştirmek istediği kısmı
        // ve yerine koymak istediği metni alın
        // cümleyi yeni haliyle yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümledeki değiştirmek istediğiniz kismi yazin :");
        String eskiMetin = scanner.nextLine();

        System.out.println("Yerine yazmak istediğiniz metni söyleyin..:");
        String yenimetin = scanner.nextLine();

        System.out.println(str.replace(eskiMetin, yenimetin));


    }
}
