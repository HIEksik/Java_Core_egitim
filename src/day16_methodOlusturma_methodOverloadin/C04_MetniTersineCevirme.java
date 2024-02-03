package day16_methodOlusturma_methodOverloadin;

import java.util.Scanner;

public class C04_MetniTersineCevirme {
    public static void main(String[] args) {


        // verilen bir metni tersine çevirip
        // bize döndüren bir method oluşturun

        // java ile kodyaz cümlesini tersten yazdırın ?

        System.out.println(metniTersineCevir("java ile kodyaz")); // zaydok eli avaj

        // kullanıcıdan bir kelime isteyip palidrom olum olmadığını yazdırın?

        Scanner scanner=new Scanner(System.in);

        System.out.println(" bir metin giriniz");
       String metin1=scanner.nextLine();


       if (metin1.equalsIgnoreCase(metniTersineCevir(metin1))){

           System.out.println(metin1+"   metni  palidromdur");

        }else {
           System.out.println(metin1+"   palidrom degildir");
       }

    }

    public static String metniTersineCevir(String metin){

        String tersmetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersmetin+=metin.substring(i,i+1);
        }

    return tersmetin;

    }




}
