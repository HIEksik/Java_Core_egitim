package day24_ArrayListVeForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayiListHalineDonusturme {
    public static void main(String[] args) {

        //1-yöntem ==> array i liste çevirmenin en doğru yolu bir loop ile tüm elementleri liste kopyalamaktır

        // daha kısa bir yol vardır ama iki büyük yan etkisi vardır bunlara dikkat etmek gerekir


        Integer[] sayilarArr={1,5,6,8,9,7,5,3,6,4,9,8,7};

        List<Integer> sayilarListesi= Arrays.asList(sayilarArr); // arryi liste çevirme,

        // her iki listeyi bir birine bsağlar Array de yapılan bütün değişiklikler listtede olur ...bu olay önerilmez
        // silme = Uzunluğunu etkileyecek işlemlerde hata verir çalışmaz
        //  değiştirme = Arrayde yapılan her değişiklik Listte de meydana gelir


        System.out.println("Sayilar listesi : "+sayilarListesi);// Sayilar listesi : [1, 5, 6, 8, 9, 7, 5, 3, 6, 4, 9, 8, 7]

        // Dezavantajları
        //  Sayilar listesine 9 u ekleyin

       // sayilarListesi.add(2); // UnsupportedOperationException hava verdi

        // listeden 7 yi silin

        Object silinecekElement=7;

      //  sayilarListesi.remove(silinecekElement); //UnsupportedOperationException

        // 1 - Oluşturdugumuz liste Arrays Clasi ile oluşturuldugundan ekleme ve çıkarma gibi listenin uzunluğıunu degiştirecek
        // bişlemlere izin vermez

        System.out.println(sayilarListesi); // [1, 5, 6, 8, 9, 7, 5, 3, 6, 4, 9, 8, 7]
        System.out.println(Arrays.toString(sayilarArr)); // [1, 5, 6, 8, 9, 7, 5, 3, 6, 4, 9, 8, 7]

        // Array in 2 indexindeki sayiyi 10 yapın?

        sayilarArr[2]=10;

        System.out.println(sayilarListesi); // [1, 5, 10, 8, 9, 7, 5, 3, 6, 4, 9, 8, 7]
        System.out.println(Arrays.toString(sayilarArr)); // [1, 5, 10, 8, 9, 7, 5, 3, 6, 4, 9, 8, 7]
        // Array de degişiklik yapılınca ikisi de değişiyor bir birine bağımlı oldu
        // bu olay önerilmez

        // KULLANIM YERİ ŞÖYLE OLABİLİR
        // sadece kontrol için olur ekleme degiştirme çıkarma yoksa kullanılır

        List<Integer> fiyatList=new ArrayList<>();
        fiyatList.add(30);
        fiyatList.add(40);
        fiyatList.add(50);

        Integer[] fiyatKontrolArray={30,40,50};

        // Yukarıdaki Array list ve Arrayi aynı olup olmadığını test edin

        List<Integer> kontrolListesi=Arrays.asList(fiyatKontrolArray);

        if (fiyatList.equals(kontrolListesi)){
            System.out.println("Test Passed");  // Test Passed
        }else {
            System.out.println("Test Failed");
        }



    }
}
