package day45_Maps_The_End;

import java.util.HashMap;
import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        //Soru : Verilen bir array’de kullanilan harfleri ve kacar defa kullanildigini yazdirin.
        //
        //Input : {a,b,c,d,e,c,d,b,e,a,c,b,d,a}
        //output :  a kullanimi : 3 adet   a=3
        //	        b kullanimi : 3 adet   b=3
        //	        c kullanimi : 3 adet   c=3
        //	        d kullanimi : 3 adet   d=3
        //	        e kullanimi : 2 adet   e=2


        String[] harfler={"a","b","c","d","e","c","d","b","e","a","c","b","d","a"};

        // bir map olusturalım key harfler vaelue ise kullanım adedi olsun

        Map<String,Integer> harfKullanimMapi=new HashMap<>();

        for (String each:harfler
             ) {

            if (harfKullanimMapi.containsKey(each)){// gelen harf map te var
                int harfinEskikullanimSayisi=harfKullanimMapi.get(each);
                harfKullanimMapi.put(each,harfinEskikullanimSayisi+1);

            }else {// gelen harf mapte yok
                harfKullanimMapi.put(each,1);// map te yoktu biz ekledik
            }


        }
        System.out.println(harfKullanimMapi);



    }
}
