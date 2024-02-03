package day19_arrays;

public class C04_KullanimadediniBulma {
    public static void main(String[] args) {
        //Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        String [] harfler={"a","g","b","d","p","d"};

        String arananharf="x";

        int sayac=0;

        for (int i = 0; i < harfler.length; i++) {

            if (harfler[i].equals(arananharf)){
                sayac++;

            }


        }
        if (sayac==0){
            System.out.println("verilen "+arananharf+" harfi array de yok");
        }else {
            System.out.println("verilen "+arananharf+" harfi array de "+sayac+" kere kullanılmiş");
        }

    }

    public static void elemanAramah(String[] arr , String  arananEleman){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(arananEleman)){
                sayac++;

            }


        }
        if (sayac==0){
            System.out.println("verilen "+arananEleman+" metni array de yok");
        }else {
            System.out.println("verilen "+arananEleman+" metni array de "+sayac+" kere kullanılmiş");
        }

    }

}
