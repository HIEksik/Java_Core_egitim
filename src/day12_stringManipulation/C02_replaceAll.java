package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {

        // Tek satırda Temizleme kısaltmalarını kullanarak metnimizdeki istemedigimiz karakterlerden kurtulabiliriz

        String str="J1a34va12 C87an90d654ir";

        // metinden tum sayilari temizleyip metni kaydedin

        // ReplaceAll tek tek harfleri rakamları degil tum harfleri yada tüm rakamları diyebilecegimiz durumlarda kullanılır

        // ornegin bu saoruda oldugu gibi " tum sayilari yok etmemiz" lazim

      /*
        Regex (Regular Expressions)
        \\s : space
        \\S : space olmayan hersey
       \\s+ : yanyana birden fazla space
        \\d : digits
        \\D : digit olmayan hersey
        \\w : harf, rakam veya _
        \\W : harf, rakam veya _ olmayan hersey

       */

        str=str.replaceAll("\\d","");

        System.out.println(str); // Java Candir


    }


}
