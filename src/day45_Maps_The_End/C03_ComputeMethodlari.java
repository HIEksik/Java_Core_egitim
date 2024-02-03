package day45_Maps_The_End;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C03_ComputeMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler=new HashMap<>();

        harfler.put("K",20);
        harfler.put("B",30);
        harfler.put("C",50);
        harfler.put("Z",80);

        System.out.println(harfler); // {B=30, C=50, Z=80, K=20}

        // K nın degerini 2 katına çıkarın

        int eskiDeger=harfler.get("K");// 20

        harfler.put("K",2*eskiDeger);

        System.out.println(harfler);// {B=30, C=50, Z=80, K=40}

        // eger map te A yok sa value = 44 olarak A ekleyin ?

        if (!harfler.containsKey("A")){
            harfler.put("A",44);
        }

        System.out.println(harfler);// {A=44, B=30, C=50, Z=80, K=40}

        //Eger Z içeriyorsa value sünü  10 arttırın ?

        if (harfler.containsKey("Z")){
            eskiDeger=harfler.get("Z");
            harfler.put("Z",eskiDeger+10);
        }
        System.out.println(harfler);// {A=44, B=30, C=50, Z=90, K=40}

        // B nin value sünü 20 arttırın ?

        harfler.compute("B",(k,v)->v+20);

        System.out.println(harfler);// {A=44, B=50, C=50, Z=90, K=40}

        // C nin degerini 3 katının 10 eksigi yapın

        harfler.compute("C",(a,b)->b*3-10);

        System.out.println(harfler);// {A=44, B=50, C=140, Z=90, K=40}

        // D nin degerini 5 arttır ?

      //  harfler.compute("D",(k,v)->v+5); // olmayan bir element kullanılırsa : NullPointerException
        // System.out.println(harfler);// NullPointerException

        // Eger key olarak D varsa valusunu 5 arttır ?

        System.out.println(harfler.computeIfPresent("D", (k, v) -> v + 5)); // D degeri yok //  null

        System.out.println(harfler);//  {A=44, B=50, C=140, Z=90, K=40} Hiç bir şey eklemedi

        // Eger key olarak D varsa degerini 5 arttır ?

        harfler.computeIfPresent("B",(k,v)->v+5);

        System.out.println(harfler);// {A=44, B=55, C=140, Z=90, K=40}

        // Eger mapte T yoksa value = 20 olarak T  ekleyin ?

        harfler.computeIfAbsent("T",v->20);
        System.out.println(harfler);// {A=44, B=55, C=140, T=20, Z=90, K=40}




    }
}
