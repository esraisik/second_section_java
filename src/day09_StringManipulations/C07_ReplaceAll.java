package day09_StringManipulations;

import java.util.Scanner;

public class C07_ReplaceAll {
    public static void main(String[] args) {

        //Kullanıcıdan ismini soyismini ve  16 haneli kredi kartı numarasını alın
        //bilgileri aşagıdaki gibi yazdırın.
        // girilen bilgiler: C** D****   **** **** **** 4567

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz:");
        String isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz:");
        String soyisim = scanner.nextLine();
        System.out.println("Lütfen 16 haneli kredi kartı numaranızı giriniz:");
        String kkNo = scanner.nextLine();

        System.out.println(
                isim.substring(0, 1).toUpperCase() + // ismin ilk harfi büyük olarak
                        isim.substring(1).replaceAll("\\w", "*") +// kalanı yıldıza cevirir
                        " " +
                        soyisim.substring(0, 1).toUpperCase() + //soyismin ilk harfi büyük olarak
                        soyisim.substring(1).replaceAll("\\w", "*") +
                        " " +
                        "**** **** ****" + // kredi kartının ilk 12 rakamı
                        kkNo.substring(12)


        );


    }

}
