package day19_arrays;

public class C03_PozitifSayilariToplama {
    public static void main(String[] args) {
        //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int [] arr={3,5,-4,-10,78,-3,5,3,-9};

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>0){
                toplam+=arr[i];
            }
        }
        System.out.println("Array daki pozitif sayilarin toplami "+toplam);


        System.out.println(pozitifElementleriTopla(arr));


    }

    public static int pozitifElementleriTopla(int [] arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }
        }
        return toplam;
    }

}
