package day13_forLoop;

public class C02_ForLoop {
    public static void main(String[] args) {


        // 60 ve 23 dahil olmak üzere
        // 7 ile bölüne bilen sayıları 60 tan geriye doğru yazdırın

        for (int i =60; i >=23 ; i--) { // 60 tan başlıyorsa 23 e doğru gidiyorsa bu defa >=23 ten büyük olacak azalarak
                                         // azalarak dedigi için i-- olarak yazacagız

            if (i%7==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");

        // 3 basamaklı pozitif tüm tam sayıları toplayıp sonucu yazdırın

        // - Sadece yazdırma işlemi yapmayacağız 3 basamaklı bütün sayıları tek tek ele alacağız bunları bir variable a ekleyeceğiz
        // - Toplamların saklanacağı bir variable oluşturacağız


        // toplam her gelen sayıyı bu toplama ekleyelim
        int toplam=0;
        for (int i = 100; i < 1000; i++) { // 3 basamaklı pozitif tam sayılar dediği için

            toplam+=i;  // i yi her seferinde bu toplama ekleyelim for bodysine yazalım
                        // i her değişince toplama ekleyecegiz

        }
        System.out.println("Sayıların toplamı : "+toplam);

        // -1000 ile +1000 arasındaki tüm tam sayıları toplayın

        int toplam1=0;

        for (int i = -1000; i <=1000 ; i++) {

            toplam1+=i;
        }
        System.out.println("Sayıların toplamı : "+toplam1);


    }
}
