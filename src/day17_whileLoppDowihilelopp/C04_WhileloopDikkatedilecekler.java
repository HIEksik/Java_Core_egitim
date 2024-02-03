package day17_whileLoppDowihilelopp;

import java.util.Scanner;

public class C04_WhileloopDikkatedilecekler {
    public static void main(String[] args) {
        //1-While parantezinde kontrol ettigimiz degişşken  Loop içerisinde degiştirilmezse sonsuz loop oluşur
        int sayi = 5;
        int sayaac = 0;

        while (sayi <= 10) {
            sayaac++;
            System.out.print(sayaac);
            sayi++;
        }

        // 2- Eger loop oluşturulmadan önce ihtiyaz duydugumuz variable leri biz oluşturuyorsak
        // loop un ilk defa çalışmasını ve kullanıcıdan degrler almasını engellemeyecek
        // bir degr atamaya dikkat etmeliyiz.

        // ör kullanıcıdan  sayılar isteyin
        // verilen sayılar pozitif oldugu müddetçe sayıları toplayalım ve negatif sayı girildiginde toplamı yazdıralım


        sayi=20;
        Scanner scanner=new Scanner(System.in);
        int toplam=0;
        while (sayi>0){
            System.out.println("Lütfen toplanmak üzere pozitif tam sayılar girin");
            sayi=scanner.nextInt();

            if (sayi>0) {       // kontrol yapılacaksa if kullanılmalıdır mesajdan sonra
               toplam += sayi;
           }
        }
        System.out.println(toplam);

        // eger loop parantezinde yazdığımız degişken için loop içerisinde kullanıcıdan degr alıyorsak
        // aldığımız degerin loop u bitirme özelligi olmayan bir deger olduğundan emin olduktan sonra
        // işlemimizi yapmalıyız

    }
}
