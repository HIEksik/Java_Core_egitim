package day13_forLoop;

import java.util.Scanner;

public class C04_Forloop {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz :");

        int sayi=scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {


            if (i%7==0){
                System.out.print(i+" ");
            }

        }


    }
}
