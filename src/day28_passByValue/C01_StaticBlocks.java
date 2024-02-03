package day28_passByValue;

public class C01_StaticBlocks {

   C01_StaticBlocks(){
       System.out.println("Constructor Calisti ");
   }



    public static void main(String[] args) {

        System.out.println("Main method ccalisti");

        C01_StaticBlocks obj=new C01_StaticBlocks();



    }

    static {
       // bu yapıya static blok denir // static bloklar herşeyden hatta main den bile önce çalışır // çağrılmadan da çalışır
        // main method çalışmadan yapılması gereken ön ayar varsa
        // static blok kullanılarak yapılır
        // bir den fazla static blok kullanılabilir
        // kendi içlerinde önce yukarıda olan çalışır aşşagıya doğru
        System.out.println("Static blok calisti");
    }
    static {
        System.out.println("İkinci static blok çalıştı ");
    }

    public static void method1(){
        System.out.println("Method1 calisti");
    }


}
