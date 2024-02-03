package day42_listIterators_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
    public static void main(String[] args) {

        // ListIterator interface i iteratör interface inin Child idir.
        // ListIterator dolayısıyla daha fazla method barındırır

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);
        System.out.println(sayilar);//[5, 1, 7, 3]

        // Listedeki tüm sayıları index kullanmadan 2 arttırın

        ListIterator lit= sayilar.listIterator(); // interface oldugundan sayılar listesini ile bu şekilde iterator oluşturuyoruz

        while (lit.hasNext()){ // yan tarafında eleman varmı diye bakar true veya false

        Integer sayi= (Integer) lit.next(); // bir yana geçip üzerinden geçtigi elementi bize getirir / kullanmak için kaydetmemiz lazım
        lit.set(sayi + 2); // ilk elemanı sayı variablesine kaydettik set methodu ile 2 arttırıp update yaptık
                            // yanı 2 artııtırdık yeni halini sayı variablesine kaydettik

        }

        System.out.println(sayilar); // [7, 3, 9, 5]

        // İterator de takip etmemiz gereken en önemli konu
        // İterator u nerede bıraktığımızdır.
        // örnegin bu soruda iterator en son elemanda

        // Listedeki elementleri index kullanmadan sondan başa doğru yazdırın

        while (lit.hasPrevious()){

            System.out.print(lit.previous() + " "); // İterator sondaydı .. Previous ()  ile başa doğru gelirken her elemanı bize getirecek


        }

        System.out.println(" ");

        // index kullanmadan sondan başa bir kere daha tüm elementleri yazdırın

        // şu anda iterator en başta
        // tekrar sondan başa gelebilmesi için
        // önce iteratoru sona yollamalıyız

        while (lit.hasNext()){
            lit.next();

        }

        // bu loop iteratoru sona götürdü.

        while (lit.hasPrevious()){

            System.out.print(lit.previous() + " "); // 5 9 3 7

        }
        System.out.println(" ");

        // Tüm elementleri gozden geçirip
        // 5 ten büyük olanları silin

       // ilk düşünecegimiz iterator nerde
        // iteratorun nerde oldugundan emin degilsek
        // yeniden deger ataya biliriz

        lit= sayilar.listIterator(); // iterator başa geldi

        while (lit.hasNext()) { // yanında elemant oldugu müddetçe

            if ((Integer) lit.next()>5){
                lit.remove();
            }

        }
        System.out.println(sayilar); // [3, 5]

        //Listedeki sayıları kontrol edip
        // 0'dan büyük olanlara 7 ekleyin

        // Önce iteratör nerde emin degiliz

        lit= sayilar.listIterator();

        while (lit.hasNext()){

            Integer sayi= (Integer) lit.next();

            if (sayi>0){
                lit.set(sayi+7);
            }

          // if ((Integer) lit.next()>0){
          //     lit.set((Integer)lit.next()+7);
          // }

        }
        System.out.println(sayilar); // [3, 12] -- İlk elemanın degerini degiştirmedi çünkü next() iki kere kullandık
          // [10, 12]            // önce if içinde kullandık sonra arttırmada kullandık onun için ikinci next teki elemanı arttırdı







    }
}
