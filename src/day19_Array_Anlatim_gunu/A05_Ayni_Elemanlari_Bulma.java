package day19_Array_Anlatim_gunu;

public class A05_Ayni_Elemanlari_Bulma {

    public static void main(String[] args) {

        // verilen array in için tekrarlan eleman sayısını bulunuz

        int [] sayilar={4,65,5,3,8,6,3,2,5,8,7,};

        int sayac=0;

        int arananSayi=7;


        for (int i = 0; i < sayilar.length; i++) {


            if (sayilar[i]==arananSayi){
                sayac++;
            }

        }

        System.out.println(sayac);









    }
}
