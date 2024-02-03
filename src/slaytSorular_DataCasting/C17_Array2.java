package slaytSorular_DataCasting;

import java.util.Arrays;

public class C17_Array2 {
    public static void main(String[] args) {

        int[] a = {2,2,2,2,2};
        int[] b ={4,4,4,4,4};



        int[] boskova=new int[a.length];

        for (int i = 0; i <a.length ; i++) {
            boskova[i]=a[i];

        }

        for (int i = 0; i < b.length; i++) {
           a[i]=b[i];
        }
        for (int i = 0; i < a.length; i++) {
            b[i]=boskova[i];

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
}
