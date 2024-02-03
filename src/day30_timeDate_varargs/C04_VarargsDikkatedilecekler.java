package day30_timeDate_varargs;

public class C04_VarargsDikkatedilecekler {
    public static void main(String[] args) {

        // argument olarak verilen sayılardan
        // ilki hariç geriye kalanları toplayıp bulunan
        // toplamı ilk sayı ile çarpıp sonucu yazdıran bir method oluşturun

        // input : 0,3,3,2,6,1 ==> 0 * 10 = 0
        //        : 1,2,3      ==> 1 * 5 = 5


        islemYap(0,3,3,2,6,1); // 0
        islemYap(1,2,3); // 5
        islemYap(2,3,6,5,49); // 126

        islemYap(5); // 5*0= 0
        // Varargs çok elemanı sorun etmediği gibi hiç eleman verilmemesini de sorun etmez

        // islemYap();  // boş olunca itiraz eder çünkü ilk sayı degerini girmemiz gerekiyor Array boş kalabilir.




    }

    public  static void islemYap(int ilkSayi, int ... geriyeKalan){
        int toplam=0;

        for (int ech:geriyeKalan
             ) {
            toplam+=ech;
        }

        System.out.println(toplam*ilkSayi);
    }

}
