package day11_nestedForLoopveMetotOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {

         /*
   Kullanicidan satir sayisini
   ve her satirdaki * sayisini isteyip
   Girilen degerlere gore
   asagidaki sekli olusturacak bir kod yaziniz

   orn :   satir 4, satirdaki * sayisi 7

   * * * * * * *
   * * * * * * *
   * * * * * * *
   * * * * * * *
*/

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz..:");
        int satirsayi= scanner.nextInt();

        System.out.println("Lütfen satırdaki * sayısını giriniz..:");
        int sutunsayi= scanner.nextInt();

        for (int i = 1; i <satirsayi ; i++) { //satirlari

            for (int j = 0; j <sutunsayi ; j++) { //sutunları
                System.out.println("* ");
            }

            System.out.println("");
        }



    }
}
