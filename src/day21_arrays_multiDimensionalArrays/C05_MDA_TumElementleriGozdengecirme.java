package day21_arrays_multiDimensionalArrays;

public class C05_MDA_TumElementleriGozdengecirme {
    public static void main(String[] args) {

        // Verilen bir array de çift sayılarin toplamını yazdırın

        int[] arrT={3,6,5,4,9,5,2,3,6,4,};

        int toplam=0;

        for (int i = 0; i < arrT.length; i++) {
            if (arrT[i]%2==0){
                toplam+=arrT[i];
            }

        }

        System.out.println(toplam);// 22

        int[][] arrIki={{3,6,5,},{4,9,},{5,2,},{3,6,4,}};

        // iki katli bu arrayde çift sayilarin toplamini yazdirin

        int toplamIki=0;

        for (int i = 0; i <arrIki.length ; i++) {// inner arrayleri kontrol eder dış array
            for (int j = 0; j <arrIki[i].length ; j++) { // inner arraydeki elementleri kontrol eder
                if (arrIki[i][j]%2==0){
                    toplamIki+=arrIki[i][j];
                }
            }
        }

        System.out.println(toplamIki);// 22

    }
}
