package day19_arrays;

import java.util.Arrays;

public class C01_Tekrar {
    public static void main(String[] args) {

        // 3 elmentli bir array oluşturalım

        int[] arr2={3,4,5};
        int [] arr3={8,5,6,};
        int [] arr4={6,3,5,};
        int [] arr5={7,6,9,6,6,8,5,8,9,3,5,6,3,};
        int [] arr6={8,6,2,6,3,2,3,6,5,3};
        // ulaşıp deger atamak için index kullanalım

        System.out.println(arr2[2]);
        System.out.println(arr5[1]);
        System.out.println(arr6[0]);
        System.out.println(arr2[1]);

        arr2[1]=9;
        arr3[0]=9;
        arr5[2]=7;
        System.out.println(arr3[0]);

        System.out.println(arr2[0]+" "+arr2[1]+" "+arr2[2]);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println(" ");

        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i]+" ");
        }

        System.out.println(Arrays.toString(arr5));

        System.out.println(Arrays.toString(arr6));

    }
}
