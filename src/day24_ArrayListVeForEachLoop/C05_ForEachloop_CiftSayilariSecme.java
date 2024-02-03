package day24_ArrayListVeForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ForEachloop_CiftSayilariSecme {
    public static void main(String[] args) {

        // Verilen İnt bir array den çift sayilari alıp ayrı bir array olarak kaydedin

        int [] arr={3, 5, 1, 2, 6, 8, 7, 4, 2, 5, 6};

        // istenen elementleri, bir array olarak istedigi için iki şekilde yapa biliriz

        // 1 - önce kaçtane çift sayi oldugunu bulur .. sonra bir array oluşturup .. çift sayıları oraya kopyalarız

        // 2 Arraydeki tüm elementleri gözden geçirip çift olanları bir Listeye atarız ..
        // listenin uzunluğuna göre yeni array oluşrup listedeki elementleri yeni array e kopyalarız

        // 2. yöntemi yapalım

        List<Integer> ciftSayilarListesi=new ArrayList<>();

        for (int each:arr
             ) {
            if (each % 2 ==0 ){
                ciftSayilarListesi.add(each);
            } // [2, 6, 8, 4, 2, 6]
        }

        int[] ciftSayilarArr=new int[ciftSayilarListesi.size()];

        /*
        Mantıklı olan yöntem forlup ile çift sayılar array ine kopyalamaktır

        for (int i = 0; i < ciftSayilarArr.length; i++) {
            ciftSayilarArr[i]=ciftSayilarListesi.get(i);
        }

        System.out.println("Çift sayilar Arrayi : "+ Arrays.toString(ciftSayilarArr));
        // Çift sayilar Arrayi : [2, 6, 8, 4, 2, 6]


         */
        int index=0;

        // For Each loop ile yapmak istersek

        for (int each:ciftSayilarListesi
             ) {
            ciftSayilarArr[index]=ciftSayilarListesi.get(index);
            index++;
        }
        System.out.println("Çift sayilar Arrayi : "+ Arrays.toString(ciftSayilarArr));
        // Çift sayilar Arrayi : [2, 6, 8, 4, 2, 6]

    }
}
