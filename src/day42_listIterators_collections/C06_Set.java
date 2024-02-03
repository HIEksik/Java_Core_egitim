package day42_listIterators_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_Set {
    public static void main(String[] args) {

        // Set in iki özelligi mutlaka bilinmeli

        // 1 - Her elemandan sadece bir tane olabilir unik dir
        // var olan elementi yeniden eklemek istersek eskiyi siler aynı elementin yenisini kaydeder
        // 2 - İndex desteklemez

        int [] arr={2,6,5,8,6,3,4,5,2,6,8,2};

        // verilen array i unique elementlerden oluşan tekrarsız bir array haline getirin

        Set<Integer>uniqSet=new HashSet<>();

        // bir loop ile array deki tüm sayıları uniqSet e ekleyelim

        for (int each:arr
             ) {
            uniqSet.add(each);
        }
        System.out.println(uniqSet); // [2, 3, 4, 5, 6, 8]

        // Bizim uniq sayılarla elle ettigimiz set
        // bu set teki elementleri kendi arr mize atamalıyız

        arr=new int[uniqSet.size()];// [0, 0, 0, 0, 0, 0]

       int index=0;

        for (Integer each:uniqSet
             ) {
            arr[index]=each;
            index++;
        }

        System.out.println("Array in son hali : "+Arrays.toString(arr)); // Array in son hali : [2, 3, 4, 5, 6, 8]

    }
}
