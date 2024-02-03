package day41_exceptions_iterators;

public class C01_Exceptions {

    public static void main(String[] args) {


        // bir yerde kontrollü exception fırlatmak istiyorsak böyle yapı kurmalıyız

        int sayi=11;
        // eger sayi negatifse sadece birinci satir çalışsın sonra 5 satırdan sonra normal çalışmaya devam etsin
        // sayi çift ise 1. ve 2. satır çalışsın sonra 5 satırdan sonra normal çalışmaya devam etsin
        // diger durumlarda 5 satırda çalışsın


        try {
            System.out.println("satir1");
            if (sayi<0)throw  new IllegalArgumentException();
            System.out.println("satir2");
            if (sayi%2==0)throw new RuntimeException();
            System.out.println("satir3");
            System.out.println("satir4");
            System.out.println("satir5");
        } catch (IllegalArgumentException e) {

            System.out.println("Sayi negatif oldugundan 2,3,4,5 atlandı");

        }catch (RuntimeException e){

            System.out.println("Sayi çift oldugundan 3,4,5 atlandı");


        }

        System.out.println("buradan itibaren çalışmaya devam et");

    }

}
