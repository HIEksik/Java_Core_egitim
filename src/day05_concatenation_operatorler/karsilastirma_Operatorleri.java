package day05_concatenation_operatorler;

public class karsilastirma_Operatorleri {
    public static void main(String[] args) {

        int a = 20;

        int b = 25;

        b = a;

        a = 2 * a + 5;

        System.out.println(a == b);// false a ile b nin eşitligini kontrol eder

        System.out.println(b = b + 3);// 23

        System.out.println(b);// 23

        System.out.println(b + 27 == a + 5);// true

        System.out.println(a != b);// a b ye eşit degildir . dogru mu ?  true
        // mantıksal ifadelerde ! herzaman tersine çevirir eşit değil / doğru değil / false dedil

        System.out.println(!true);// false

        System.out.println(4 > 7);// false

        System.out.println(5 > 3 == 6 > 7);// false

        System.out.println(!(4>5)); // true




    }
}
