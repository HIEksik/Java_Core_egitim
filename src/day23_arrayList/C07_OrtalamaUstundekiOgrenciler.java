package day23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciler {

    public static void main(String[] args) {

        // bir öğretmenden ögrenci ismini ve notunu isteyin
        // ogretmen Q ya bastiginda islemi bitirip
        // ortalama uzerinde not alan ögrencilerin isimlerini list olarak yazdırın

        // ipucu = isimleri ve notlari ayrı iki liste olarak tutun

        Scanner scanner=new Scanner(System.in);

        List<String> isimleListesi=new ArrayList<>();
        List<Double> notlarListesi=new ArrayList<>();

        double girilennot=0;
        double notToplami=0;
        String girilenisim="";

        while (!girilenisim.equalsIgnoreCase("Q")){

            System.out.println("Lütfen ögrenci ismini girin");
            girilenisim=scanner.nextLine();

            if (!girilenisim.equalsIgnoreCase("Q")){
                isimleListesi.add(girilenisim);


                System.out.println("Lütfen öğrencinin notunu giriniz");
                girilennot=scanner.nextDouble();

                scanner.nextLine();
                System.out.println();
                notToplami+=girilennot;
                notlarListesi.add(girilennot);
            }


        }

        double ortalama=notToplami/notlarListesi.size();

        // elimizde notlar listesi ve isimler listesi var
        // aynı index teki isimve no ilintili dir
        // notlar listesindeki notları gözden geçirip ortalamanın üstünde olanları
        // önce ismini yanına notunu yazdırın

        System.out.println(" Ortamala not ="+ortalama);
        System.out.println("oortalamanın üstünde not alan öğrenciler ");

        for (int i = 0; i < isimleListesi.size(); i++) {
            if (notlarListesi.get(i)>=ortalama){
                System.out.println(isimleListesi.get(i)+" "+notlarListesi.get(i));
            }
        }




    }

}
