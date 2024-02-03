package day08_nestedIfElseStatement;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
        Ternary if else nin alternatifi degildir
        Sadece basit işlemlerde if else nin yerine tercih edilebilir

        Ternarry bir sonuç üretir java tek başına ternary nin sonucunu ne yapacağını bilemez
        yazdırma veya atama yapmalısınız

       Eger şart boolean şart true olduğunda elde edilen sonuç ile false olduğunda elde edilen sonuç farklı data türlerine
       sahipse bir variable ' a atama yapamazsınız sadece yazdırabilirsiniz.
         */
       int input=24;

       // iki basamaklı mı ?
        // iki basamaklı ise sayıyı 2 katına çıkarın
        // iki basamaklı degilse "iki basamaklı degil " yazdırın

        System.out.println(input >= 10 && input <= 99 ? input=input * 2 : "iki basamaklı değil");
        System.out.println(input);

    }
}
