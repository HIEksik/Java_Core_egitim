package day13_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
        Başlangıç ve bitiş degerleri bilinen veya
        tekrar sayısı belli olan işlemleri yapmak için
        Forloop kullanılır
         */

        // 10 dan başlayarak 30 dan küçük olan sayıları yan yana  yazdırın

        for (   int i = 10               ;                i < 30          ;              i++      ) {

            // başlancıç degeri                Loop bitirme şartı                    i' nin artış biçimi
            //                                true oldugu sürece loop çalışır

            System.out.print(i + " ");
        }
        System.out.println(" ");// alt satıra geçmek

        // iki basamaklı tek sayıları yan yana yazdırın

        // bu soruyu iki türlü düşüne biliriz
        // 1 - eger biliyorsanız ilk ve son yazdırılacak sayıyı belirler  tek sayı dedigi için ikişer ikişer ilerleriz

        for (int i = 11; i <=99 ; i+=2 ) {

            System.out.print(i + " ");

        }
        System.out.println("");

        // 2 - başlangıç ve bitiş degerlerini bilmeye biliriz
        // biz den istenen 2 basamaklı tek sayılar dedigi için tüm sayıları elden geçiririm

        for (int i = 10; i <100 ; i++) {

            // tek sayıları yazdırmamızı istedigi için
            // sayıyı kontrol edip tekse yazdırırım
            // if ile tekmi degilmi diye kontrol ederiz

            if (i%2==1){
                System.out.print(i + " ");
            }
        }
        System.out.println("");


        // 752 ve 1326 dahil olmak üzere aralarında 19 ile bölünen sayıları yan yanayazdırın
        // 2. yöntem ile çözülecek

        for (int i = 752; i <=1354 ; i++) {// 752,753,754.......1325,1326 bunların içinde 19 ile bölünenleri bulmamız lazım

            if (i%19==0){
                System.out.print(i+" ");
            }

        }

    }
}
