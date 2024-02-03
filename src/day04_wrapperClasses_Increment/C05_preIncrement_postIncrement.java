package day04_wrapperClasses_Increment;

public class C05_preIncrement_postIncrement {
    public static void main(String[] args) {

        int a = 10 ;

        a++;


        System.out.println("a nın degeri : "+a);// 11 olur



        a=10;

        ++a;

        System.out.println("a nın degeri : "+a );// 11

        /*
            Javada 3 farklı şekilde deger arttırma mümkündür

            * sayi=sayi+1;

            * sayi+=sayi;

            * sayi++;

            PreIncremen ve postıncremen sadece üçüncü a++ veya ++a için geçerlidir.

            iki farklı kullanımı vaerdır .  ++a veya a++

         */

        int b = 10 ;

        System.out.println("++b yazdigimda konsolda yazdirilan :"+ ++b);//11
        //  deger arttırma ve yazdırma işlemi var önce arttırır sonra yazdırır. + işareti solda olduğu için

        System.out.println("++b 'den 1 satir sonra konsaolda b degeri :"+ b);// 11

        int c = 10 ;

        System.out.println("c++ yazdigimda konsolda yazdirilan :"+ c++);// 10
        // deger önce yazılır sonra arttırılır + işareti sağda olduğu için

        System.out.println("c++ 'den 1 satir sonra konsaolda b degeri :"+ c);//11



        // ( x++ ) post - Increment  önce atama yapar,  sonra arttırır.

        int x = 10 ;

        int y = x++;

        // ++ işareti x ten sonra olduğu için arttırmayı x ten sonra yapacak


        System.out.println("x : " + x + " y :"+y ); // x 11 y 10

        // ( ++x ) Pre Increment önce arttırır, sonra atama yapar

        x=10;

        y=++x;

        System.out.println("x : " + x + " y :"+y );//  x : 11  y :11





    }
}
