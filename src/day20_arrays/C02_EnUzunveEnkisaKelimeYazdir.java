package day20_arrays;

public class C02_EnUzunveEnkisaKelimeYazdir {
    public static void main(String[] args) {
        // Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        // aynı uzunluktaki isimler varsa her hangi biri yazdırılabilir

        String[] isimler = {"halil", "veysi", "burhan", "mehmet", "emel", "naz"};

        uzunVeKisaIsimYazdir(isimler);




    }

    public static void uzunVeKisaIsimYazdir(String[] isimler) {

        String enUzunkesime = isimler[0];
        String enKisaisim = isimler[0];

        for (int i = 1; i < isimler.length; i++) {

            if (isimler[i].length() > enUzunkesime.length()) {
                enUzunkesime = isimler[i];
            }
            if (isimler[i].length()<enKisaisim.length()){
                enKisaisim=isimler[i];

            }


        }

        System.out.println("en uzun isim : "+enUzunkesime);

        System.out.println("En kısa isim : "+enKisaisim);
    }


}
