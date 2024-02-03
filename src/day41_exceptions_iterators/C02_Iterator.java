package day41_exceptions_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);
        System.out.println(sayilar);//[5, 1, 7, 3]

        // İndex kullanmadan listedeki sayıları ikişer arttırın

        for (Integer eac:sayilar
             ) {
            System.out.print(eac+2+" ");
        }
        System.out.println(" ");

        System.out.println(sayilar);// [5, 1, 7, 3]

        // Javada çoklu obje bulunduran her yapı index i desteklemez
        // İndex olmadan da bazı işlemleri yapa bilmek için
        // Java ITERATOR interface sini oluşturmuştur

        // Iterator kullanarak sayılar listessindeki tüm sayıları toplayın

    Integer toplam=0;

        Iterator iterator=sayilar.iterator();

        System.out.println(iterator.hasNext()); // soruyoruz yanında element var mı ? // true

       toplam+=(Integer) iterator.next();
        // İterator ü yanındaki sayıdan sonraya geçirir ve geçtigi sayıyı bize döndürür 5 sayısını toplama ekler

        toplam+=(Integer) iterator.next();
        // İterator ü yanındaki sayıdan sonraya geçirir ve geçtigi sayıyı bize döndürür 1 sayısını toplama ekler

        toplam+=(Integer) iterator.next();
        // İterator ü yanındaki sayıdan sonraya geçirir ve geçtigi sayıyı bize döndürür 7 sayısını toplama ekler

        toplam+=(Integer) iterator.next();
        // İterator ü yanındaki sayıdan sonraya geçirir ve geçtigi sayıyı bize döndürür 3 sayısını toplama ekler

        System.out.println(toplam); // 16

        // bir kere kullanılınca bir daha kellanılmaz
        // İterator ile çalışırken dikkat etmemiz gereken en önemli kopnu iterator ı nerede bıraktığımızdır
        // bu soruda iteratör en sona gitti . next() methodu ile görelim

        //System.out.println(iterator.next()); // NoSuchElementException getirecek elemen yok yanda yok sona gittik çünkü

        // bu durumda iteratör e 0 dan başlayacak bir deger ataması yapmamız lazım

        iterator=sayilar.iterator(); // iteratör sıfırlandı

        // Listedeki tüm sayıları iteratör ile silin

        while (iterator.hasNext()){// iteratörün yanında eleman oldugu sürece true döner
                                    // böylece while loop çalışmaya devam eder
            iterator.next(); // yandaki elemanın üzerine git
            iterator.remove(); // üzerine gittin elemenı sil

        }

        System.out.println(sayilar); // []













    }
}

