package day14_forLoop_Nested_forLoop;

public class C06_nestedForLoop {
    public static void main(String[] args) {
        // 1 2 3 4 yazdırın

        for (int i = 1; i <= 4 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // loop kullanarak 2 4 6 8 yazrırın

        for (int i = 1; i <= 4 ; i++) {
            System.out.print( 2*i + " ");
        }
        System.out.println("");

        // Loop ile 3 6 9 12 yazdırın
        for (int i = 1; i <= 4 ; i++) {
            System.out.print( 3* i + " ");
        }

        System.out.println("");

        System.out.println("================================");
        /*
        Foor loop kullanarak bunu yazdırın
        1 2 3 4
        2 4 6 8
        3 6 9 12

        eger yazdırmamız istenen şekil dik dörtgen biçinde ise iç içe 2 loop oluştururuz

      dışardaki loop satırları konrol eder. bu soruda 3 satır var
      içerdeki loop ise her satırdaki sütunları kontrol eder
      (bu soruda her satırda 4 sütun var )
         */

        for (int i = 1; i <=3 ; i++) { // satırları kontrol eder

            for (int j = 1; j <=4 ; j++) { // satırdaki sütunları kontrol eder

                System.out.print( i*j + " "); // satırdaki için print
            }

            System.out.println(" "); // sütunlar için println
        }

    }
}
