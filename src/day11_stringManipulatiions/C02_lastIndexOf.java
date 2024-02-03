package day11_stringManipulatiions;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str="Bu Java ogrenilecek";

        // e nin ilk kullanımının indexini yazdırın

        System.out.println(str.indexOf("e"));// 11 ilk kullanımındaki index

        // e nin son kullanılan indexsini yazdırın

        System.out.println(str.lastIndexOf("e"));// 17  Aramaya sondan başlayacak ve ilk e nin indexini yazacak

        // u nun ilk kullanım ve son kullanım indexlerini yazdırın

        System.out.println("ilk kullanılan u :"+str.indexOf("u")+"\nikinci kullanılan u : "+str.lastIndexOf("u"));

        // J harfinin bu metinde hiç olmadığını veya sadece 1 kere kullanılmadığını yazdırın


        if (str.indexOf("J")==-1){
            System.out.println("j hiç kullanılmadı ");
        } else if (str.indexOf("J")==str.lastIndexOf("J")){
            System.out.println("Metinde j sadece 1 kere kullanılmış");
        }

        System.out.println(str.lastIndexOf("e", 15));// 15  Stringi söyle ve şu indexten itibaren ara

        System.out.println(str.lastIndexOf("e", 14));// sondan başlayıp başa doğru arama yaptı

        System.out.println(str.lastIndexOf("x"));// -1 olmayan karakter -1 veriyor


    }
}
