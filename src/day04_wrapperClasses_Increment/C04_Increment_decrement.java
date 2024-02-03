package day04_wrapperClasses_Increment;

public class C04_Increment_decrement {
    public static void main(String[] args) {

        // ARTTIRMA VE AZALTMA

        int a = 10;

        // a nın degerini oluşturacağımız bir b variable na atayın
        // sonra a nın degerini 1 arttırın.

        int b = a ;

        a++;

        System.out.println("a : "+a+", b :"+b); // a : 11, b :10

        a=10 ;

        // a nın degerini 1 arttır ve b ye ata

        a++;

        b=a;

        System.out.println("a : "+a+", b :"+b);// a : 11, b :11

        a= 10;
        // a nın degerini yazdırın sonra a nın degerini 1 arttırın

        System.out.println("a nin degeri : "+a);//10

        a++;

        // a nın degeri 11 olur

        a=10;

        // anın degerini 1 arttırın sonra a nın degerini yazdırın

        a++;

        System.out.println("a nın degeri :"+ a );// 11

        // burada da a nın degeri 11 dir



    }
}
