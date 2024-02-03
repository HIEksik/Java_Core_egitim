package day21_arrays_multiDimensionalArrays;

import day20_arrays.C04_ArrayeElementEkleme;

import java.util.Arrays;

public class C03_ArrayYeniDegerAtama {
    public static void main(String[] args) {

        // var olan bir arraye yeni derger atanabilir mi ?
        // yeni veri nasıl atanır

        int[] arr1={4,5,6};

        // önce istedigimiz array i ayrı bir array olarak oluşturur sonrada bizim  arraya atama yaparız

        int [] geciciArr={4,2,6};

        arr1=geciciArr;
        System.out.println(Arrays.toString(arr1)); // [4, 2, 6]

        // eger yeni atadığımız array default degerlerden olusun bir array olacaksa
        // new keyword kullanarak direk atama yapabiliriz

        arr1=new int[5];

        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0]

       //  olusturulmuş bir array a uzunlugunu degiştirecek bir elemet eklemek veya element silmek mümkünmüdür


        int[] sayilar={4,2,1};

        // 4 üncü elemet olarak 3 ekleyin

         // sayilar[3]=3; hata verir

        sayilar=C04_ArrayeElementEkleme.arrayElementEkley(sayilar,3);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3]

        // sayilar arrayine 5. elemet olarak 9 ekleyin ?

        sayilar=C04_ArrayeElementEkleme.arrayElementEkley(sayilar,9);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3, 9][4, 2, 1, 3, 9] eklendi

        // Array in ilk elementi olan 4 ü arrayden silin array i 4 elementli hale getirin

        // Var olan bir array e uzunluğu degiştirecek şekilde yeni element ekleyemeyiz veya element silemeyiz

        // Bunun yerine istenen elementlere sahip yeni bir array oluşturup
        // sonra yeni array i eski array e deger olarak ataya biliriz


        // önce uzunlugu eski arrayden bir eksik olan yeni array oluşturalım
        int[] yeniArr=new int[sayilar.length-1];
        // eski arraydeki silinecek element dışındaki elementleri kopyalayalım



        for (int i =0 ; i < yeniArr.length ; i++) {

            yeniArr[i]=sayilar[i+1];


        }

        sayilar=yeniArr;
        System.out.println(Arrays.toString(sayilar)); // [2, 1, 3, 9]





    }
}
