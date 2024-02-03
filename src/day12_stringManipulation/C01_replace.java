package day12_stringManipulation;

public class C01_replace {
    public static void main(String[] args) {

        // String deki cümleyi degiştirmek için veya cümledeki bir harfi degiştirmek için kullanılır.

        String str="Hava Candir.";

        System.out.println(str.replace("H", "J"));// Java Candir.

        // art arda tek satıerda değişiklik yapar

        str=str.replace("Hava","Java").replace(".","");

        // bir metin parçasını veya bir harfi hiç "" kullanarak replace methodu ile yok edebiliriz.
        System.out.println(str);//Java Candir

        // replaceFirst methodu bulduğu ilk karaktere değişiklik yapar

        System.out.println(str.replaceFirst("a", "A"));//JAva Candir sadece ilk ayı degiltirdi


       // replace bütün a ları A şekline çevirdi.
        System.out.println(str.replace("a", "A"));// JAvA CAndir

        // boşlugu yok edelim?

        System.out.println(str.replace(" ", ""));// JavaCandir

        str = "Ali uzunkavaklaraltındayataruyumazoglu ";

        System.out.println(str.replace('u', 'U'));//Ali UzUnkavaklaraltındayatarUyUmazoglU

        System.out.println(str.replace("l","XYZ"));// AXYZi uzunkavakXYZaraXYZtındayataruyumazogXYZu




    }
}
