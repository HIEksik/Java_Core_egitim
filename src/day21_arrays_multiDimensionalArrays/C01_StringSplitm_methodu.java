package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C01_StringSplitm_methodu {
    public static void main(String[] args) {


        String str="java gun gectikce guzellesiyor";


        // e harflerinden str ı  parçalara ayırın

        // önce e leri işaretliyecek ve her enin olduğu yerden itibaren bir virgükl kayarak bir array halinde yazdıracak
        // istersek kaydedebiliriz array olarak


        System.out.println(Arrays.toString(str.split("e")));
        // [java gun g, ctikc,  guz, ll, siyor]

        // cümleyi kelimelere ayırın .... Spacelerden ayıracagız
        System.out.println(Arrays.toString(str.split(" ")));
        // [java, gun, gectikce, guzellesiyor]

        // cümleyi gec metninden itibaren ayırın
        System.out.println(Arrays.toString(str.split("gec")));
        //[java gun , tikce guzellesiyor]



        //Verilen bir arama sonucunda arama sonucunun 1000 den fazla olduğunu test edin

        String aramaSonusu = "1-48 of over 5,000 results for java";


        String[] kelimeler=aramaSonusu.split(" ");

        System.out.println(Arrays.toString(kelimeler));
        //[1-48, of, over, 5,000, results, for, java]

        String aramaSoncSayisiStr=kelimeler[3];// 5,000

        aramaSoncSayisiStr=aramaSoncSayisiStr.replaceAll("\\D",""); // 5000

        int aramasonucsayisi=Integer.parseInt(aramaSoncSayisiStr);//5000

        if (aramasonucsayisi>1000){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else {
            System.out.println("Failed");
        }





    }
}
