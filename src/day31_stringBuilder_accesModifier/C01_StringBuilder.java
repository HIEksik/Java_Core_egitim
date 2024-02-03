package day31_stringBuilder_accesModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

        /*
        String Builder methodle-ar kullanılınca degişiklik kalıcı olarak yapılır ..
        mutable özelliginden dolayı ... sout ile yazılınca bile degişir.
         */

        StringBuilder sb1=new StringBuilder("Java Candir");

        System.out.println(sb1.capacity()); // 27 kapasite 16 + 11
        System.out.println(sb1.length());// 11

        // ekleme yapmak için append() kullanılır

        sb1.append(", bundan suphe eden mi var ?");
        System.out.println(sb1); // Java Candir, bundan suphe eden mi var ?
                                    // String Builder mutable olduğundan method ile yapılan degişiklikler kalıcı olur
        System.out.println(sb1.capacity()); // 56 kapasite 27 * 2 =54 + 2 = 56
        System.out.println(sb1.length());// 39

        // capacity ve lenght i eşitlemek için
        sb1.trimToSize(); // boş olan yerleri capacity i kırpar ve length e eşitler

        System.out.println(sb1.capacity());// 39
        System.out.println(sb1.length());// 39

        String str="Hava cok guzel";

        sb1.append(str,5,9); // String builder a ekle = str ın 5 inci ile 9 uncu karakterlerini ekle
        // 5 dahil 9 dahil degil // cok

        // StringBuilderin sonuna belirtilen karakterleri ekler

        System.out.println(sb1);// Java Candir, bundan suphe eden mi var ?cok

        //  içine eklemek ??? insert arasına ekle demek ... append sona ekle demek

        sb1.insert(5,"niye bu kadar "); // Var olan Stringbuilder in belirlenen indexine istedigimiz metni insert eder
        // silmez üstüne eklemez geriye doğru kaydırır
        System.out.println(sb1);// Java niye bu kadarCandir, bundan suphe eden mi var ?cok

        sb1.insert(18,str,4,8); // Verilen string deki 4 üncü index ile 8 inci index arasını
        // bizim Stringbuilder ı mızın 18 inci index ine insert / ekler eder .

        System.out.println(sb1);// Java niye bu kadar cok Candir, bundan suphe eden mi var ?cok

        // silme delete ile olur ister 1 karakter silinir ister başlangıç ve bitiş indexi verilir

        sb1.delete(5,10);// 5 index ten başlar 10 dahil degil e kadar siler (niye )
        System.out.println(sb1); // Java bu kadar cok Candir, bundan suphe eden mi var ?cok
       // sb1.deleteCharAt(56); Boyut 54 56 diye bir karakter yok hata verdi
        // System.out.println(sb1); hata verdi

        sb1.deleteCharAt(54); // silecegimiz karakteri yazıyoruz / olamayn karakter yazılınca hata veriyor
        System.out.println(sb1); // Java bu kadar cok Candir, bundan suphe eden mi var ?ok
        sb1.delete(52,54);
        System.out.println(sb1); // Java bu kadar cok Candir, bundan suphe eden mi var ?


        // bu cümleyi terse çevirelim

        // kalıcı olarak degişti

        System.out.println(sb1.reverse());//  ? rav im nede ehpus nadnub ,ridnaC koc radak ub avaJ

        System.out.println(sb1); //  ? rav im nede ehpus nadnub ,ridnaC koc radak ub avaJ
        sb1.reverse();
        System.out.println(sb1); // Java bu kadar cok Candir, bundan suphe eden mi var ?


        sb1.replace(24,52,""); // başlangıc index i bitiş index i ve yazılacak sitring girilir
        // aralıkta olan sitringler silinir yerine yeni atanan sityrgin yazılır .
        System.out.println(sb1);//  Java bu kadar cok Candir




    }
}
