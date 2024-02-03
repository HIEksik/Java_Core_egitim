package day38_interfaces;

public class C01_FinalVariables {

    final static int SAYI=10;

   // final String STR;  // İZİN VERMEZ FİNAL VARİABLELERE DEGER ATANMADIĞI İÇİN DEGERSİZ VARİABLE TANIMLANMAZ

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Math.PI);

        System.out.println(Character.MIN_VALUE);

        // Math.PI=3.14; //  final olarak işaretlenen bir variable lar degiştirilemezler deger atanamaz

        System.out.println(SAYI); // 10

         // sayi=20; // deger atanamaz.

    }

}
