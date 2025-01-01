package day08_StringManipulations;

import java.util.Scanner;

public class C04_contains {

    public static void main(String[] args) {

  /*

    Kullanıcıdan bir metin isteyin
    metin ev içeriyorsa "Ev gibisi yok"
    metin iş içeriyorsa "Çalışmak ne güzel"
    metin hem ev hem iş içeriyorsa "Evden çalışmak ne güzel"
    her ikisi de yoksa "Çalışmak lazım" yazdıran kodu yazınız

 */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Gününüzü nasıl geçiriyorsunuz?");
        String metin = scanner.nextLine();


        if (metin.toLowerCase().contains("ev")&& metin.toLowerCase().contains("iş")){
            System.out.println("Evden çalısmak ne güzel");
        }else if(metin.toLowerCase().contains("ev")){
            System.out.println("Ev gibisi yok");
        } else if (metin.toLowerCase().contains("iş")){
            System.out.println("Çalışmak ne güzel");

        } else {
            System.out.println("Çalısmak lazım");
        }



    }
}
