package day18_scope;

public class C03_Scope_Class_variable_kullanim {

    /*
    Kural 4 : Static variableler her yere gidebilirler
    static olmayan variable adı ( instance ) lar ise static alanlara giremezler


    Kural 5: Class level variablelar deger atanmadan olusturula bildigi gibi
    deger atanmadan kullanıla bilirler.

    Biz deger atamazsak java default varsayılan deger olarak
    nanprimitivlere null
    Sayısal primitivlere 0
    Boolean variablelara false
    char variablelere : '' hiçlik
    degeri atar
     */
    static  String s; // static olduğu için her yerde kullanılır
    static int a; // static olduğu için her yerde kullanılır
    boolean bl;    // puclic ile oluşturulmuş methodlarda kullanılırlar
    char chr;      // public ile olusturulmuş methodlarda kullanılırlar

    // Not: local  de variable oluşturursak deeger atamadan kullanamayız


    public static void main(String[] args) {

        System.out.println(s); // null
        System.out.println(a);// 0

        // Eger static olmayan class uyelerine static alandan ulasmak istersek
        // önce clastan bir obje olusturmali
        // sonra o obje üzerinden statik olmayan üyeler kullanilmalidir
        C03_Scope_Class_variable_kullanim obj=new C03_Scope_Class_variable_kullanim(); // statik olamayanları da kullanabiliriz
        // Scanner olusturmak gibi clas ismiyle olusturduk ve intance variableleri kullanabiliriz / obje oluşturduk

        System.out.println(obj.bl); // false
        System.out.println(obj.chr); //  hiclik


    }

    public static void method1(){

        System.out.println(" static method calisti ");



    }

    public void method2(){

        System.out.println("static olmayan method calisti");


    }
}
