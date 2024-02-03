package day17_whileLoppDowihilelopp;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

        /*
        While loopta parantez içinde kontrol edilen degişkene loop tan önce deger iatıyoruz


      Eger  bu degişkene uygun olmayan bir deger ataması yaparsak loop hiç çalışmaz

    -----java bu durumun önüne geçmek için yani kullanıcıdan
      --deger aldıktan sonra yapmamız için Do whileloop oluşturmuştur.
      --önce çalışıyor sonra kontrol ediyor

      Do-while loop kullanıldığında loop bodysinin çalışmama ihtimali yoktur en az bir kere çalışır

         */

        // Bir öğretmenden not ortalaması bulmak için notları alın
        // ögretmen işlemi bitirmek için negatif bir sayi girmelidir
        // negatif sayı girdiginde toplam kaç not girdigini
        // not ortalamasının kaç oldugunu yazdırın

        Scanner scanner=new Scanner(System.in);

        double not=0; // ilk degeri - atama yaparsak whileloop çalışır ve biter sonuç sıfır olur
        double toplam=0;
        int sayac=0;

        /*
        while (not>=0){ // while da  degişken body içerisinde degişmelidir
            System.out.println("ortalama için notları giriniz\n bitirmek için negatif sayı girin");

            not=scanner.nextDouble();
           if (not>=0){
               toplam+=not;
               sayac++;
           }


        }

        */

        // Do whiledeloop da  üstte tanımladığımız not= 0 wariablesi kullanıcıdan aldığımız no gri oldu çünkü önemi kalmadı zaten
        // kullanıcıdan alınıyor
        // ilk tanımlanan while up ilk degişkene yanlış deger verirsek çalışmıyor
        // dowhileloop ise kullanıcıdan deger aldıktan sonra kontrol ettigi için program çalışıyor



        do{
            System.out.println("ortalama için notları giriniz\n bitirmek için negatif sayı girin");

            not=scanner.nextDouble();
            if (not>=0){
                toplam+=not;
                sayac++;

        }
        }
            while (not>=0);
        System.out.println("Toplam giri,len not "+sayac+" \nGirilen not ortalaması  "+toplam/sayac);




    }
}
