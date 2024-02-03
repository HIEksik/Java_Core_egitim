package day18_scope;

public class C02_ScopeClassVariablesStaticKeyword {
    /*
    Static keyword bir nevi statu belirler
    Static unvani alan keyword veya methodlar
    static olmayan class uyelerini kabul etmezler

     Static variableler her yerde çalışır fakat Static olmayanlar staticlerde çalışmıyor
     */

    /*
    Clas level daki variable lerde static olarak veya static keyword kullanilmadan olusturulabilir
     */
    static  String s; // static olduğu için her yerde kullanılır
    static int a; // static olduğu için her yerde kullanılır
    boolean bl;    // puclic ile oluşturulmuş methodlarda kullanılırlar
    char chr;      // public ile olusturulmuş methodlarda kullanılırlar


    public static void main(String[] args) {
        staticMethod1();
        // staticOlmayanMethod2() - Static olmayan bir method Static olan bir methodda çağırılamaz çalışmaz
         s="Java";
         a=20;

         // static olmadıkları için staticle olusturulmus methodlarda kullanılamazlar
     //    bl=true;
     //    chr='a';
    }

    public static void staticMethod1(){

        s=  "HAva";
        a=30;

    }

    public void staticOlmayanMethod2(){

        System.out.println(s);
        System.out.println(a);
        System.out.println(bl);
        System.out.println(chr);
    }
}
