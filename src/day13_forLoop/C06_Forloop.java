package day13_forLoop;

import java.util.Scanner;

public class C06_Forloop {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen başlangıc ve bitiş degerlerini giriniz ");
        int baslangic=scanner.nextInt();
        int bitis=scanner.nextInt();
        int toplam=0;


        // iki yöntem kullanmamız lazım 1.si küçük sayı ile büyük sayı arasındaki işlem için azala azala (--i ) olması lazım
        // girilen ilk sayı büyükse ikinci sayıdan (++1) arta arta gitmesi lazım


        //

        if (baslangic<bitis){

            for (int i = baslangic; i <=bitis ; i++) { // i başlangıçtan başlayacak bitişe devam edecek ve her defasında i yi toplayacak
                toplam+=i;
            }

        }else {  // başlangıçtan başlayıp bitişe gitseydik -- yapacaktık ama bitişten başlangıca gittigimiz için ++ yaptık
            for (int i = bitis; i <=baslangic ; i++) {
                toplam+=i;
            }
        }

        System.out.println("Girilen sayıların toplamı : "+toplam);




    }
}
