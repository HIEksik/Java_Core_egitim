package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove2 {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        System.out.println(sayilar);// [3, 5, 2, 0]

        /*
        remove 2 şekilde yapılır
        remove index
        remove object

        sayilar(0)

        elemen (0 ) mı index (0) mı

        eger listemiz integer lardan oluşuyorsa  indexi alır

        önce object olarak bir sayı tanımlayıp sonra silmeliyiz


         */

        System.out.println(sayilar.remove(0)); // 3 getirir
        System.out.println(sayilar);// [5, 2, 0]  // 3 ü siler

        // eleman olarak 5 i silmesini istersek

       // önce bir obje olarak 5 i tanımlamalıyız

        Object silinecekeleman=5;


        // deklerasyon yani oluşturma bir kere olur ... her defa atama yapa biliriz.

        System.out.println(sayilar.remove(silinecekeleman)); // true 5 i buldu // silinecek eleman yoksa false döner

        System.out.println(sayilar); // [2, 0]




    }
}
