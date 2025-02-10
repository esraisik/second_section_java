package day18_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_FibonacciSayilariniYazdir {
    public static void main(String[] args) {

        System.out.println(ilkNFibonacciSerisi(5));

        System.out.println(ilkNFibonacciSerisi(10));

        System.out.println(ilkNFibonacciSerisi(20));


        // kullanicidan pozitif bir n tamsayisini alip,
        // ilk n tane Fibonacci sayisini liste olarak yazdirin

        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kac adet fibonacci sayisini yazdirmak istediginizi giriniz...");
        int n = scanner.nextInt();

        List<Integer> fibonacciSerisi = new ArrayList<>();

        // kullanici negatif veya 0 girerse ? ==> hata
        // kullanici 1 girerse ? ==> 0
        // kullanici 2 girerse ? ==> 0, 1
        // kullanici 2'den fazla deger girerse ==> 0, 1 .........


        if (n <= 0) {
            System.out.println("Girilen deger pozitif olmalıdır..:");
        } else if (n == 1) {
            fibonacciSerisi.add(0);

        } else if (n == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            // 0 1 1 2 3 5 8 13 21 34 55 89 144 233

            for (int i = 2; i < n; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i - 2) + fibonacciSerisi.get(i - 1));
            }

            System.out.println(fibonacciSerisi);
        }


    }

    // Verilen pozitif bir n tamsayisi alarak
    // bize ilk n tane Fibonacci sayisini bir List olarak donduren
    // bir method olusturun


    public static List<Integer> ilkNFibonacciSerisi(int n) {

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (n <= 0) {
            System.out.println("Girilen deger pozitif olmalıdır..:");
        } else if (n == 1) {
            fibonacciSerisi.add(0);

        } else if (n == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            // 0 1 1 2 3 5 8 13 21 34 55 89 144 233

            for (int i = 2; i < n; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i - 2) + fibonacciSerisi.get(i - 1));
            }


        }
        return fibonacciSerisi;
    }


}