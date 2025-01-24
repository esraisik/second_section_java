package day14_scope_arrays;

public class C02_scope {


    public static void main(String[] args) {

        /*
           static variable'ların EN BUYUK AVANTAJI erisim kolaylığıdır.
           - Class icerisinden her yerden direkt ulasılabilir
           -Baska class'lardam da ClassIsmi.staticVariableIsmi seklinde ulasılabilir


           static variable'ların EN BUYUK DEZAVANTAJI Ulasan herkesin DEGISTIREBİLMESİDİR


         */


        System.out.println(C01_Hastane.hastaneIsmi);// Yildiz Hastanesi
        System.out.println(C01_Hastane.hastaneAdresi);// Yenimahalle
        System.out.println(C01_Hastane.bashekim);// Doktor Ali


        C01_Hastane.bashekim = "Dr Oguzhan";

        System.out.println(C01_Hastane.bashekim); // Doktor Oguzhan

    }
}
