package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_pozitifTambolenlerListesi {
    public static void main(String[] args) {

        //Verilen pozitif bir tamsayiyi,
        // tam bolebilen tum pozitif tamsayilari bir liste
        //olarak bize donduren bir method olusturun.

        int sayi=20;

        List<Integer> tambolunenlerlistesi=new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
               tambolunenlerlistesi.add(i);
            }
        }
        System.out.println(tambolunenlerlistesi);

        int sayi1=30;

        System.out.println(tambolenlerlistesi(sayi1));


    }
    public static List<Integer> tambolenlerlistesi(int sayi){

        List<Integer> tambolunenlerlistesi=new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                tambolunenlerlistesi.add(i);
            }
        }
        return tambolunenlerlistesi;
    }
}
