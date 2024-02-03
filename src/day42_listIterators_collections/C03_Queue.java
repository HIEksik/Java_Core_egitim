package day42_listIterators_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        /*
        Queue (Kuyruk) eklenenler otomatik olarak sona eklenir ve
         silinenler baştan silinir
         */
        Queue<Integer> queue=new LinkedList();

        queue.add(6);
        queue.add(9);
        queue.add(2);

        System.out.println(queue); // [6, 9, 2]

        queue.remove();

        System.out.println(queue);//  [9, 2]

        System.out.println(queue.element()); // 9  en baştaki elementi silmeden bize getirir

        System.out.println(queue);// [9, 2]

        System.out.println(queue.peek());// 9 en baştaki elementi silmeden getirir

        Queue<Integer> bosQueue=new LinkedList<>();

       //  bosQueue.element(); // NoSuchElementException

        System.out.println(bosQueue.peek());// null

        // ikisi aynı işlevi yapar ama aralarındaki fark
        // boş que da biri exception fırlatır öteki null döndürür

        queue.offer(7);
        System.out.println(queue); // [9, 2, 7] sona element ekler

        // add ile aynı işlevi yapar aralarındaki fark
        // add her durumda ekler ama Offer kapasite sınırlaması yoksa ekler

        System.out.println(queue.poll());// 9 queue nun başındaki elementi getirir ve siler

        System.out.println(queue);// [2, 7]

       // System.out.println(bosQueue.remove()); // NoSuchElementException

        System.out.println(bosQueue.poll());// null




    }
}
