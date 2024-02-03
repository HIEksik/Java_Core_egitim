package day24_ArrayListVeForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoopileListedekiSayilariToplama {
    public static void main(String[] args) {

        /*
        For Each loop birden fazla element barındaıran yapılar için kullanılır
        For Each loop verdiğimiz çok eleman barındıran yapıdaki tüm elementleri bize getirmöektir

        Sadece çok elemen barındıran yapıdaki tüm elementleri getirmek için kullanılır.
        Bunun için For Each loopa 3 bilgi gereklidir.
        1- Getirecegi elementlerin data türü - Integer
        2- Loop içinde Bu elementlere verecegimiz isim - ( fordaki i gibi )variable lazım
        3- Bu elementleri nereden alıp bize getirecegi

        For Each lopp index kullanmadığından elemantleri sıralı getirmeye bilir Sıralı getirmek için kullanılmaz
         */




        Integer[] arr={3,5,1,2,6,8,7,4,2,5,6};

        List<Integer> sayilar=new ArrayList<>();

        // index kullanmadan arr deki tüm elementleri sayilar listesine kopyalayın

        for (Integer each: arr               // arr deki bütün elemanları bana getir
             ) {

            sayilar.add(each);
        }
        System.out.println("For each loop : "+sayilar); // [3, 5, 1, 2, 6, 8, 7, 4, 2, 5, 6]





     //  for (int i = 0; i < arr.length; i++) {
     //      sayilar.add(arr[i]);
     //  }
//
     //  System.out.println("For kullanarak : "+sayilar); // [3, 5, 1, 2, 6, 8, 7, 4, 2, 5, 6]




        // index kullanmadan Sayilar listesindeki tüm elementlerin toplamını yazdırın

        int toplam =0;

        for (Integer each :sayilar
             ) {
            toplam+=each;
        }
        System.out.println(toplam); // 49





      //  for (int i = 0; i < sayilar.size(); i++) {
      //      toplam+=sayilar.get(i);
//
      //  }
//
      //  System.out.println(toplam);// 49




    }
}
