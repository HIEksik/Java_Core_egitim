package day21_arrays_multiDimensionalArrays;

public class C09_MDA_SayilarinCarpimi {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

        int[][] arr={{3,6,-5,},{-4,-9,},{-5,2,},{3,-6,4,}}; // -2332800

        System.out.println(elementlerinCarpimi(arr));


    }

    public static int elementlerinCarpimi(int[][] arr){

        int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];
            }

        }

        return carpim;
    }


}
