package day30_timeDate_varargs;

public class C03_Varargs {
    public static void main(String[] args) {

        /*
            Varargs : variety of arguments demektir . Farklı argumentler farklı biçimlerde farklılaştırılmış
            argümentler girebilmemiz demektir

            Varargs degişken sayıda argument kullanmamıza imkan sağlayajn array alt yapısını kullanan bir java objesidir.

            Varargs oluşturulamaz .. çoklu argümenler için kullanılır

            kullanıcıdan alınan argümetler için varargs oluşturulmaz ..

            Sadece bir methoıd call sırasında eger argüment sayımız  satandart degilse parametre olarak argüment yazıyoruz
            (int... sayi) gibi
         */

        // verilen iki sayının toplamını yazdıran bir method olusturun

        topla(4,5); // 9

        topla(4,5,6); // 15

        topla(454,4,5,4,5); // 472
        topla(5,6,6,9,7); // 33

        topla(5,6,8,9,3,5,46,2,3,2);// 89



    }

    public static void topla(int... sayi){ // argüment sayısı belli degilse
        // burada sayı bir Varargs dır . bir tek sayı degil argumenttir..
        // kaç tane yollarsak hepsini ala bilecek bir Array dir. bunların toplamı bir for ile bulunur.

        int toplam=0;

        for (int ech:sayi
             ) {
            toplam+=ech;
        }

        System.out.println(toplam);
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println(sayi1+sayi2+sayi3);
    }

    public  static void topla(int sayi1,int sayi2){
        System.out.println(sayi1+sayi2);
    }
}
