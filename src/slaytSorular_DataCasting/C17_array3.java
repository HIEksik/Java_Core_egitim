package slaytSorular_DataCasting;

import java.util.Arrays;

public class C17_array3 {
    public static void main(String[] args) {


        int [] sayilar={2,0,16,15,9,6,18,21};

        int sayac=0;




        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%3==0){
                sayac++;
            }

        }
        int[] ucilebolunenler=new int[sayac];

      int index=0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]%3==0){

                ucilebolunenler[index]=sayilar[i];
                index++;

            }
        }
        System.out.println(Arrays.toString(ucilebolunenler));

        int sayac2=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%2==0){
                sayac2++;
            }
        }

        int[] ikiyebolunenler=new int[sayac2];

        int index2=0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%2==0){
                ikiyebolunenler[index2]=sayilar[i];
                index2++;
            }
        }
        System.out.println(Arrays.toString(ikiyebolunenler));

        int [] birlesim=new int[ikiyebolunenler.length+ucilebolunenler.length];



        for (int i = 0; i < ucilebolunenler.length; i++) {
            birlesim[i]=ucilebolunenler[i];

        }

        int index4=0;
        for (int i = ucilebolunenler.length; i <birlesim.length ; i++) {
            birlesim[i]=ikiyebolunenler[index4];
            index4++;
        }

        System.out.println(ucilebolunenler.length); // 6
        System.out.println(ikiyebolunenler.length); // 5

        System.out.println(Arrays.toString(birlesim));
    }
}
