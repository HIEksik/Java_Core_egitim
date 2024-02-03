package day42_listIterators_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {

        // Double ended queue demektir
        // eklemeler ve silmeler baştan veya sondan olabilir
        // baş veya son bize kalmiştir
        // her özelligin her methodun first ve last tercih eden halleri vardır

        Deque<Integer> deque=new LinkedList<>();

        deque.add(5);
        deque.add(7);
        deque.add(3);

        System.out.println(deque);// [5, 7, 3]

        deque.addFirst(10);
        deque.addLast(11);
        System.out.println(deque);// [10, 5, 7, 3, 11]

        deque.offerFirst(6);
        deque.offerLast(4);
        System.out.println(deque);//[6, 10, 5, 7, 3, 11, 4] bir sınırlama yoksa eleman ekler

        deque.removeLastOccurrence(5);// sondan 5 elemanını arar bulduıgu gibi siler veya baştan

        System.out.println(deque);// [6, 10, 7, 3, 11, 4]



    }
}
