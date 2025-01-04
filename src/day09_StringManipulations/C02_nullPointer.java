package day09_StringManipulations;

public class  C02_nullPointer {
    public static void main(String[] args) {


              String isim1;
        //System.out.println(isim1);
        //Bir metot içinde oluşturulan String variable'lara
        // değer atamadan kullanamayız.


        String isim2="Ali";
        String isim3="";
        String isim4="Buse Sena";

        //isim3'e hiçlik değeri atanmıştır.


        // EĞER bir variable'a değer atamadan
        // variable'ı listeleyebilmek istersek;
        //o variable'ı null olarak işaretleyebiliriz.

        String isim5= null;

        System.out.println(isim5); //null


        //NOT: null olarak işaretlenen variable'lar YAZDIRILABİLİR
        // AMA BAŞKA METOTLARLA KULLANILAMAZ.


        System.out.println(isim2.length()); //3
        System.out.println(isim3.length()); //0
        System.out.println(isim5.length()); // nullPointerExeptions


        System.out.println("5. öğrenci" + isim5); // 5. öğrenci : null














    }
}
