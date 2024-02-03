package day29_immutableClases;

import java.util.ArrayList;
import java.util.List;

public class C03_Mutable_Immutable_Classes {
    public static void main(String[] args) {

        /*
           String Class ı immuteble oldugu için
           Yapılan degişiklikler kalıcı degişiklik yapmaz

           Sadece o satır için degişikligi uygular

           Ancak list veya array list mutable oldugundan method ile yapılan degişiklikler kalıcı olur.

         */

        String isim="Ramazan";

        isim.toUpperCase();
        isim.replace("a","i");
        isim.concat(" Tatar");

        System.out.println(isim);//Ramazan


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.remove(1);
        sayilar.set(1,40);
        System.out.println(sayilar); // [10, 40]
    }
}
