package day23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListOlusturtma {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek
        // bir method olusturun.

        System.out.println(listeOlusturtma());






    }

    public  static List<String> listeOlusturtma(){
        Scanner scanner=new Scanner(System.in);
        List<String> girilenIsimler=new ArrayList<>();
        String girililenIsim="";

        while (!girililenIsim.equalsIgnoreCase("Q")){

            System.out.println("Lütfen isimleri giriniz\n Bitirmek için Q ya basınız");
            girililenIsim=scanner.nextLine();

            if (!girililenIsim.equalsIgnoreCase("Q")){
                girilenIsimler.add(girililenIsim);

            }

        }
        return girilenIsimler;
    }

}
