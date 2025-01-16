package day11_nestedForLoopveMetotOlusturma;

public class C09_MethotOlusturmaveKullanma {

    public static void main(String[] args) {


// Verilen iki notun ortalamasını  yazdıran bir metot olusturun.
        double not1 = 78.9;
        double not2 = 56.5;

        notOrtalamasiYazdir(not1, not2); // verilen notların ortalaması : 67.7

        notOrtalamasiYazdir(45.6, 87.34);// verilen notların ortalaması : 66.47
    }

    public static void notOrtalamasiYazdir(double not1, double not2) {

        System.out.println("Verilen notların ortalaması  :" + (not1 + not2) / 2);

    }


}
