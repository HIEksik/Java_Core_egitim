package day17_whileLoppDowihilelopp;

import java.util.Scanner;

public class C08_KarekokBulma {
    public static void main(String[] args) {
        //Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //bulunuz, tamkare ise true
        // değilse false yazdırınız.
        //Ornek : input : 16, output: 4


        Scanner scanner=new Scanner(System.in);

        System.out.println("Karesini bulacagınız bir sayi giriniz");

        int sayi=scanner.nextInt();
        int karekok=1;
        int flag=10;


        // florloop ile yapalım

        for (int i = 1; i*i <=sayi ; i++) {
            if (i * i ==sayi){
                flag++;
                break;
            }
        }
        if (flag==10){
            System.out.println(false);
        }else {
            System.out.println(true);
        }

        // Do while ile yapalım


        do {
            if (karekok*karekok==sayi){
                flag++;
                break;
            }
            karekok++;
        }while (karekok*karekok<=sayi);

        if (flag==10){
            System.out.println(false);
        }else {
            System.out.println(true);
        }

    }
}
