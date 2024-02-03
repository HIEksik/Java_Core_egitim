package day20_arrays;

public class C05_ciftsayilariToplama {
    public static void main(String[] args) {

        // verilen int bir array deki
        // çift sayilarin toplamini yazdirin

        int [] arr={8,3,2,3,5,1,9,7};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                toplam += arr[i];
            }
        }
        System.out.println(toplam);
    }
}
