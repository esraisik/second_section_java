package day08_stringManipulations;

public class C09_lastİndexOf {

    public static void main(String[] args) {

        // lastindexof  metodu index of metoduna benzer fakat
        // bu metot sondan itibaren aranan değerin nerede olduğuna bakar.
        // sondan başa doğru arar fakat bulunca hangi indexte olduğunu
        // bastan sayarak söyler

        //0123456789012345678901234567
        String str = "Benim çok çalışmam lazım çok";

        System.out.println(str.indexOf("çok"));
        System.out.println(str.lastIndexOf("çok"));

        // Benim kelimesi ne kadar kullanılmıs

        int a = str.indexOf("Benim");
        int b = str.lastIndexOf("Benim");


        if (a == b) {
            System.out.println("Benim kelimesi 1 kez kullanılmış");
        } else {
            System.out.println("Benim kelimesi 1'den fazla kullanılmıs");
        }


    }
}
