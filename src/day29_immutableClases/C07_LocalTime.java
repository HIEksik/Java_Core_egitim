package day29_immutableClases;

import java.time.LocalTime;

public class C07_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat); // 00:44:02.260674900 saat kaç

        // bir for loop ile 1000000 milyon işlem yaptırıp süreyi hesaplayalım

       LocalTime baslangic=LocalTime.now();

        long nanoBaslangic=baslangic.toNanoOfDay();
        int toplam=0;

        for (int j = 1; j <=10000 ; j++) {
           toplam=0;

           for (int i = 0; i <=100000 ; i++) {


            toplam+=i%10;
        }
        }

        System.out.println(toplam);
        LocalTime bitis=LocalTime.now();
        long nanoBitis=bitis.toNanoOfDay();

        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println("İşlem süresi = "+(nanoBitis-nanoBaslangic));
    }
}
