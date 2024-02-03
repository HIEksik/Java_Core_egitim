package day20_arrays;

import java.util.Arrays;

public class C06_sort {
    public static void main(String[] args) {


        String [] isimler={"Halil","Emel","Songül","Mehmet","ipek"};

        System.out.println(Arrays.toString(isimler));//[Halil, Emel, Songül, Mehmet, ipek]


        // Arraydeki elementleri sıralamak için kullanılır

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));// [Emel, Halil, Mehmet, Songül, ipek]

        // buna : Natural Order / dogal sıralama denir


        // verilen int bir arraydeki en küçük ve en büyük sayıları yazdırın

        int[] arr={5,9,1,0,-3,-13,2};

        Arrays.sort(arr); //  küçükten büyüge doğru sıralar

        System.out.println("en küçük sayi : "+arr[0]); // en küçük sayi : -13
        System.out.println("en büyük element :"+arr[arr.length-1]); // en büyük element :9

        // sıralama da short methodunu kullanarak önce sıralayıp sonra en ucuz ve en pahalı ürünü yazdıra biliriz.





    }
}
