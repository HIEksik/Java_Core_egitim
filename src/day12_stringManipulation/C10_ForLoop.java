package day12_stringManipulation;

public class C10_ForLoop {
    public static void main(String[] args) {

        // Javada başlangıç ve bitiş degeri belli olan
        // veya tekrar sayisi verilmiş olan işlemler için Loop (döngü) kullanırız



        // 5 kere hello world yazdırın

        String str="Hello World\n";

        System.out.println(str.repeat(5));

        // 1'den 10 a kadar sayilari tek tek yazdırın.

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i+" ");

        }
    }
}
