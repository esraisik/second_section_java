package day08_stringManipulations;

public class C02_concat {
    public static void main(String[] args) {

     String str1="Have";
     String str2="Nice";
     String str3="A";
     String str4="Day";
     int sayi= 712;
        System.out.println(str1+str2+str3+str4);
        //HaveNiceADay
        System.out.println(str1+" "+str2+" "+str3+" "+str4);
        //Have Nice A Day
        System.out.println(str1.concat(str2.concat(str3.concat(str4))));
        //HaveNiceADay
        System.out.println(str1.concat(str2+" ").concat(str3+" ").concat(str4+" "));
        //HaveNice A Day
        System.out.println(str1.concat(sayi+""));
        //Have712
         // sayi int olduğu için sonuna hiçlik ekleyerek Stringe cevirdim bçylelikle yazdırdı.

    }
}
