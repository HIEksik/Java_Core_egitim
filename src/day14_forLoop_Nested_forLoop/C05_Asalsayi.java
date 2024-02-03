package day14_forLoop_Nested_forLoop;

import java.util.Scanner;

public class C05_Asalsayi {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayi giriniz ");
        int sayi=scanner.nextInt();

        // Asal olmadığını bulmak için flag kullanacagız

        int flag=10;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag++;
            }
        }
            // flag 10 sa girilen sayi alsal dır degilse asal degil

        if (flag==10){
            System.out.println("girilen sayi asal ");
        }else {
            System.out.println("girilen sayi asal degil");
        }


    }
}
