package day11_nestedForLoopveMetotOlusturma;

public class C07_ekstra {

    public static void main(String[] args) {


           /*
              asagidaki sekli cizdirecek kodu yaziniz
               1
              1 2
             1 2 3
            1 2 3 4

         */


        for (int i = 1; i <= 4; i++) {  // satirlari

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) { // her satirdaki sutunlari

                System.out.print(j + " ");

            }
            System.out.println("");


        }


/*

        1
       1 1
      1 2 1
     1 2 2 1
    1 2 3 2 1
   1 2 3 3 2 1

                */


        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }


            for (int j = 1; j < i; j++) {

                System.out.print(j + " ");

            }
            System.out.println("");
        }


    }
}



















