package day09_StringManipulations;

public class C08_StringFiyatlarıToplama {


    public static void main(String[] args) {

        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : “15.30 €” , input2 : “11.45 €”
        // output : 26.70 €

        String fiyatstr1 = "15.30 €";
        String fiyatstr2 = "11.45 €";

        System.out.println(fiyatstr1 + fiyatstr2); // 15.30 €11.45 €


        //sondaki para birimini dinamik hale getirmek istersek
        // space'den sonraki kisim diyebiliriz
        // space'in index'ini bulalım

        int spaceIndex = fiyatstr1.indexOf(" ");
        String paraBirimi = fiyatstr1.substring(spaceIndex + 1);


        // parse() kullanabilmek için once digit olmayan her şeyi yok edelim

        fiyatstr1 = fiyatstr1.replaceAll("\\D", ""); //"1530"
        fiyatstr2 = fiyatstr2.replaceAll("\\D", ""); //"1145"


        double fiyat1 = Double.parseDouble(fiyatstr1) / 100;
        double fiyat2 = Double.parseDouble(fiyatstr2) / 100;


        System.out.println("Fiyatlarin toplami  :" + (fiyat1 + fiyat2) + " " + "paraBirimi");


    }


}
