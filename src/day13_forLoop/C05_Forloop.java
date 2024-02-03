package day13_forLoop;

import java.util.Scanner;

public class C05_Forloop {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin.
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

      Scanner scanner=new Scanner(System.in);
      System.out.println("Başlangıc ve Bitiş sayılarını giriniz:");
      //int sayi1=scanner.nextInt();
      //System.out.println("Bitiş tam sayısını giriniz");
      //int bitisSayisi=scanner.nextInt();

      //int toplam=0;

      //for (int i = sayi1; i <=bitisSayisi ; i++) {
      //    toplam+=i;
      //}if (bitisSayisi<sayi1){
      //    System.out.println("Bitiş degeri birinci sayıdan küçük olamaz");
      //}
      //System.out.println("Birinci ve ikinci sayının toplamı :"+toplam);

      int baslangic=scanner.nextInt();
      int bitis=scanner.nextInt();

      int toplam=0;

      if (bitis<baslangic){
        System.out.println("Bitiş başlangıçtan  küçük olamaz ");
      }else {

        for (int i = baslangic; i <=bitis ; i++) {
          toplam+=i;
        }
        System.out.println("Başlangıç ve bitiş sayılarının toplamı : "+toplam);
      }



    }
}
