package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListSetMethodu {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        harfler.add("j");
        harfler.add("a");
        harfler.add("v");
        harfler.add("a");

        System.out.println(harfler); // [j, a, v, a]

        // eklemek istedigimiz endexi yazıyoruz ve ekliyoruz digerlerini geriye itiyor

        // v ile sonraki a arasına "b " ekleyelim

        harfler.add(3,"b");

        System.out.println(harfler); // [j, a, v, b, a]

        // b ile sonraki "a" arasına "c" ekleyin

        harfler.add(4,"c");

        System.out.println(harfler); // [j, a, v, b, c, a]

        // c harfini b olarak update edin degiştirin

        // Set methodu ile önce index sonra elemenı giriyoruz ve değiştiriyor

        harfler.set(4,"b");

        System.out.println(harfler); // [j, a, v, b, b, a]

        harfler.add(3,"k"); // 3. elemt olarak k ekliyor
        System.out.println(harfler); // [j, a, v, k, b, b, a]

        System.out.println(harfler.set(3, "l"));  //  k   // 3. elemen olarak l yi   degiştiriyor ve  döndürüyor
        // 3. indextekini k yapıcam eskiyi getirecegim

        System.out.println(harfler); // [j, a, v, l, b, b, a]






    }
}
