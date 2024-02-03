package day19_arrays;

import java.sql.Array;
import java.util.Arrays;

public class C01_ArrayOlusturma {
    public static void main(String[] args) {

        int arr1=20;

        arr1=30;

        int [] arr2={3,4,5};// data türü : int --  uzunluk : 3

        // Array de herhangi bir elemana ulaşmak veya deger atamak istersek index kullanırız index 0 dan başlar

        System.out.println(arr2[2]); // 5 yazdırır index numarası bu şekilde yazılır
        System.out.println(arr2[1]);// 4

        // arr2 nin içindeki 4 ü 8 yapın

        arr2[1]= 8;  // array in içindeki veri bu şekilde degiştirilir

        // Bu array 3 elemanlı olarak oluştutuldu
        // 4. eleman olarak 3. indexe atama yapılır mı

        // Atama yapmak istersek java sintex olarak işlem doğru olduğundan altını çizmez ama intelij sarıya boyar

        // arr2[3]=20;// Array index is out of bounds sınırların dışında hata verir

        // Array deki tüm elemetleri yazdırın

        System.out.println(arr2[0]+" "+arr2[1]+" "+arr2[2]); // 3 8 5  Burada tek tek yazmış olduk eleman

        // eleman çoksa nasıl yazdıracağız

        // arr3 ün elemanlarını yazdırın


        int [] arr3={2,6,5,4,6,3,5,8,9,6,4,2,6,3,5};

        for (int i = 0; i < arr3.length; i++) { //  i = 2,6,5,4,.......

            System.out.print(arr3[i] + " ");  // tüm elementler bu şekilde yazdırılır

        }
        System.out.println("");
        // Arr3 arry ini yazdırın

        System.out.print(arr3); // [I@1e67b872

        System.out.println("");

        // Array non-primitive bir java objesidir
        // non-primitive lerin bazıları direkt olarak yazdırıla bilir.
        // ancak arraylar direk YAZDIRILAMAZ
        // Eger Array in tamamını yazdırmak isterseniz java daki Arrays clasından yardım almamız gerekir

        System.out.println(Arrays.toString(arr3)); // [2, 6, 5, 4, 6, 3, 5, 8, 9, 6, 4, 2, 6, 3, 5]

        // Arrays.toString(istenenArray) ==> java tüm elemanları ", " olacak şekilde köşeli parantez içinde yazdırır.


        // ÖNEMLİ
        // 1 - Array  İN  ELEMTLERİNİ YAZDIRIN DİYORSA  = forloop ile tüm elementleri yazdırıyoruz
        // 2 - Array in Tüm  elemanlarını isterse = Array.toString(istenan Array)

        int[] arr4= new int[5]; // içine 5 tane int alabilen bir Array oluşturur.

        System.out.println(Arrays.toString(arr4)); // [0, 0, 0, 0, 0]

        // bu durumda deger atanmadığı için java biz deger atayıncnaya kadar elementlere default degerleri tanımlar

        arr4[0]=6;
        arr4[3]=9;
        arr4[1]=2;

        // yukarıdaki aynı kalacak yeni atama degişecek

        System.out.println(Arrays.toString(arr4)); // [6, 2, 0, 9, 0] atadıklarımız güncellendi atamadıklarımız aynı kaldı










    }
}
