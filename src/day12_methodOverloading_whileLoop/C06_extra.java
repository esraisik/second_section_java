package day12_methodOverloading_whileLoop;

public class C06_extra {

    public static void main(String[] args) {


        //ÖDEV:While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.

        String metin= "Java ödevi var.";
/*
        for (int i =metin.length()-1; i >=0 ; i--) {
            System.out.print(metin.charAt(i));

        }

 */
            String tersmetin="";
           int uzunluk=metin.length()-1;

          while(uzunluk>=0){
              tersmetin +=metin.charAt(uzunluk);
              uzunluk--;
          }
        System.out.println("ters metin:" + tersmetin);
    }
}
