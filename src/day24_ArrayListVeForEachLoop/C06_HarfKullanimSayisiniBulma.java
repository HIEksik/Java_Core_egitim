package day24_ArrayListVeForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_HarfKullanimSayisiniBulma {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz");
        String cumle=scanner.nextLine();
        System.out.println("Aranacak harfi girin");
        String harf=scanner.next().substring(0,1);

        // cümledeki her bir harfe iki türlü ulaşa biliriz
        // 1 for loop ve substring ile
        // 2 split ile array e çevirip for Each loop ile

        String[] cumleHarfArrayi=cumle.split("");
        // [h, a, l, i, l]

       // System.out.println(Arrays.toString(cumleHarfArrayi));
        //[h, a, l, i, l]

        int sayac=0;

        for (String each:cumleHarfArrayi
             ) {
            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Harf cümlece kullanılmamış");
        }else {
            System.out.println("Verilen harf cümlede "+sayac+" defa kullanılmış");
        }

    }
}
