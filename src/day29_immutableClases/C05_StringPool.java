package day29_immutableClases;

public class C05_StringPool {
    public static void main(String[] args) {

        // Java String için her seferinde yeniden obje oluşturmamak içinm basit nbir mekasnizma üretmiştir.
        // Buna String Pool diyoruz
        // Java basit şekilde oluşturulan String .....="...."; String objeleri String pool da tutar
        // sonradan yine basit yöntemle yeni bir String olusturursanız once String pool u kontroleder
        // orada aynı degere sahip eski bir String varsa yeni oluşturdugumuz Stringe aynı referansı verir


        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String str4="Ja"+"va";
        String s="Ja";
        String t="va";
        String str5=s.concat(t);


        // == Hem referansa hemde metne bakar

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true
        System.out.println(str1==str5);//false
        System.out.println(str1=="java");//true


        System.out.println("================================");


        // Equals ise sadece metne bakar

        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// true
        System.out.println(str1.equals(str4));// true
        System.out.println(str1.equals(str5));// true
        System.out.println(str1.equals("Java"));// true



    }
}
