package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C11_Scanner_slayt {
    public static void main(String[] args) {

        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Cemberin yarı capını giriniz : ");

        double yarıcap=scanner.nextDouble();

        double pi=3.14;

        double cemberinAlanı=(yarıcap*yarıcap)*pi;

        double cemberinCevresi=(yarıcap+yarıcap)*pi;




        System.out.println("Girilen dairenin alanı : "+cemberinAlanı);
        System.out.println("Girilen dairenin Cevresi : "+ cemberinCevresi);



    }
}
