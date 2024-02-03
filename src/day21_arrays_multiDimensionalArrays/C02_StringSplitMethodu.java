package day21_arrays_multiDimensionalArrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {
        // verilen bir metinde
        // istenen karakterin kaç kere kullanildigini yazdırın

        String metin= "Java da her gun yeni seyler ogreniyoruz";
        String arananKarakter="a";

        String [] karakterler=metin.split("");

        int sayac=0;

        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(arananKarakter)){

                sayac++;
            }
        }
        System.out.println("Aradıgınız karakter metinde " + sayac +" defa kullanilmistir ");

    }
}
