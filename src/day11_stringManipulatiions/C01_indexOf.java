package day11_stringManipulatiions;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java cok guzel bir programlama dili.";

        System.out.println(str.contains("a"));// true a var mı diye sorduk true verdi
        System.out.println(str.indexOf("a"));// 1  a nın hangi indexte olduğunu sorduk.

        System.out.println(str.indexOf('c'));// 5 sadece string degil char da veriyor

        System.out.println(str.charAt(5));// c 5. index teki karakteri sorduk

        System.out.println(str.indexOf("a "));// 3 ilk bulduğu karakterin indexini verir

        System.out.println(str.indexOf("guzel")); // 9 buldugu ilk harfin indexini verir

        System.out.println(str.indexOf(" "));// 4 ilk space olan indexsi verir

        System.out.println(str.indexOf(" ", 10));// 14 // iki parametreli arama .. 10 uncu indexten sonraki spaceyi bul dedik

        // ikinci space in indexini bulun ?

        System.out.println(str.indexOf(" ", 5)); // 8 / ilk space den bir fazlasını yazmamız lazım

        // ikinci i nin indexsini bulun ?

        System.out.println(str.indexOf("i"));// 16 (ilk i yi bulduk )

        System.out.println(str.indexOf("i", 17));// 32 bu şekilde bulmak dinamik degil bunun yerine

        System.out.println(str.indexOf("i", str.indexOf("i") + 1)); // 32 aradığımız karakterden sonraki index böyle bulunur

        System.out.println(str.indexOf("a", str.indexOf("a") + 5));// 24

        // ikinci a nın indexsini yazdırın?

        System.out.println(str.indexOf("a", str.indexOf("a") + 1));// 3 ilk indexten sonraki indexi verdi

        // olamayan bir Stringin indexsini istersek

        System.out.println(str.indexOf("x"));// -1  olmayan karakterde -1 olarak döndürür

        System.out.println(str.indexOf("Phyton"));// -1

        // ikinci  c olup olmadığını yazdırın ?

        int ilkcindex=str.indexOf("c");

        if (ilkcindex==-1){
            System.out.println("Verilen metinde c yok");
        }else if (str.indexOf("c",ilkcindex+1)==-1){
            System.out.println("2. c yok ");
        }else {
            System.out.println("2. c var");
        }



    }
}
