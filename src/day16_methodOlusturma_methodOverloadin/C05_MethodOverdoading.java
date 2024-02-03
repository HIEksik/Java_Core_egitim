package day16_methodOlusturma_methodOverloadin;

public class C05_MethodOverdoading {
    public static void main(String[] args) {

        // overloading method aynı methodu farklı parametrelerle oluştura bilmeye denir.



        //verilen iki sayiyi toplayıp , sonucu yazdıran bir method oluşturun


        toplaYazdir(5,7); // iki int'in toplami : 12

        toplaYazdir(7.4,6); // double ve int sayının toplamı : 13.4

        toplaYazdir("ali",5);// String ve int  sayının toplamı : ali5

        //toplaYazdir(5,5.3); bunu kabul etmez çünkü yerleri ters  ( double ve int ) olması lazım

        // data sıralaması nasıl yazılmışsa girilen değer öyle girilmesi gerekiyor

        toplaYazdir('4','a'); // 149 iki int olarak ascıı den topladı char oldugu için

        toplaYazdir(3.5f,5); // double ve int sayının toplamı : 8.5
        // float doble değildir ama Autowidening yaptı ve java  değeri atayıp topladı float double den küçüktür



        // aynı isimde birden fazla method olur fakat aynı Signature de yani degerde method olmaz ..
        // ya parametrelerin yeri veya türleri degişecek () içine yazdığımız



    }

   public static void toplaYazdir(int sayi1,int sayi2){

       System.out.println("iki int'in toplami : "+(sayi1+sayi2));

   }

   // parametre isimlerini değiştirerek aynı methodu 2 kere oluştura bilirmiyiz
    // parametrelerin adını degil data türünü deeğiştirmemiz lazım
    // yukarıda int int varsa başka data türünü yazmanlazım
   /*
   javada method ismi ve parametrelerin data türü birlikte dönüştürüldüğünde
   ortaya çıkan metne METHOD SIGNATURE denir. ==> toplaYazdir(int sayi1,int sayi2)

   java method lardaki parametre isimlerine değil
   method signature ına bakar ==>toplaYazdir(int sayi1,int sayi2)
   aynı method signature ne sahip bir den fazla method oluşturmanıza izin vermez ==>toplaYazdir(int sayi1,int sayi2)
    */
    public static void toplaYazdir(double a,int b ){//Signature leri farklı

        System.out.println("double ve int sayının toplamı : "+ (a+b));
    }

    public static void toplaYazdir(String a,int b ){ //Signature leri farklı
        System.out.println(" String ve int  sayının toplamı : "+  (a+b));
    }


}
