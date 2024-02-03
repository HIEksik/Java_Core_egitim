package day18_scope;

public class C01_ScopeLocalVariables {
    public static void main(String[] args) {

        // Scope/ Kapsam
        // üçe  ayrılır Class variable  Scope u ve Methodun Scope u Loop scope u

        // Kural 1:
        // Bir method içerisinde olusturulan variabnlelara local variable deniz
        // Local variable ler sadece olusturulduklari methodda kullanılır.
        // Diger methodlarda kullanılamaz




        String str="Java Candir";
        //System.out.println(sayi); Aşşagıda tanımladığımız burada çalısmaz

        int a ;
        boolean bl;
        char c;
        // variable oluşturulur ama yazdırılamaz hata verir
        //System.out.println(a);
        //a++;
        bl=true;
        c='a';

        // Krual 2 ;
        // Local variableler deger atanmadan olusturulur ama deger atamadan kullanılamazlar

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);// 0 1 2 3 4 5 6 7 8 9
            String s="Java";
        }
        // Kural 3 :
        // Her nekadar bir methodun icin de olsada Loop lar da ayrı bir local alandır
        // Loop icerisinde olustutulan variable lar Loop dısında kullanilamaz
        // Local olarak olusturulan variableler sadece kendi Scope larinda kullanılır

    }

    public static void method1(){
      //  System.out.println(str); Yukarıda tanımlşandığı için burada çalismaz

        int sayi=10;



    }

}
