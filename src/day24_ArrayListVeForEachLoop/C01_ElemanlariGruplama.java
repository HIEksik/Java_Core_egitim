package day24_ArrayListVeForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ElemanlariGruplama {
    public static void main(String[] args) {

        // Verilen bir Arrayde
        // elementleri 3 erli gruplar halinde toplayip
        // bu Toplamlari bir liste olarak yazdırın

        int[]arr={3,6,1,9,2,0,6,3,-1,-5,9,11};
        // Output==> [10, 11, 8, 15]

        List<Integer> yeniarrList=new ArrayList<>();

        int toplam=0;
        int sayac=1;

        for (int i = 0; i < arr.length; i++) {

            if (sayac==3){

                toplam+=arr[i];
                yeniarrList.add(toplam);
                toplam=0;
                sayac=1;
            }else {
               toplam+= arr[i];
               sayac++;
            }
        }
        System.out.println(yeniarrList);

    }
}
