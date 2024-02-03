package slaytSorular_DataCasting;

import java.util.Scanner;

public class C15_MethodOlusturma {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen İsminizi giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lütfen Soyisminizi giriniz");
        String soyIsim=scanner.nextLine();

        System.out.println(IsimSoyisiIlkHarfBuyukYapma(isim,soyIsim));

    }

    public static String IsimSoyisiIlkHarfBuyukYapma(String isim ,String soyIsim){

        String tamIsim1 = null;
        String soyIsim2 = null;

       if ((isim.charAt(0)>='a'&&isim.charAt(0)<='z')||(isim.charAt(0)>='A'&&isim.charAt(0)<='Z')){
          tamIsim1 = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        }

       if ((soyIsim.charAt(0)>='a'&&soyIsim.charAt(0)<='z')||(soyIsim.charAt(0)>='A'&&soyIsim.charAt(0)<='Z')){
           soyIsim2 =soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).toLowerCase();
        }

       return tamIsim1+" "+soyIsim2;


    }


}
