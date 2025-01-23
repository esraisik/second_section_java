package day13_dowhileloop_scope;

public class C05_Scope {

    public static void main(String[] args) {

        String str = "Java candir";

        // System.out.println( sayi);

        // sayi= 6;

        for (int i = 0; i < 5; i++) {

            System.out.println(i + " ");
            String isim = "Ali can";

            System.out.println(str);
        }

        //System.out.println(i);

        //System.out.println(isim);

    }


    public static void method1() {

        // System.out.println(str);

        int sayi = 5;
    }
}
