package day27_constructorCall;

public class C01_ConstructorCall {

    /*
    Bazen bir Constructyor in içinden
    Başka bir constuructor çağırılabilir. Method kol gibi

    Eger Constructor ismi ve parametyre yazarsınız Java bu sintax in method kol oldugunu söyler ve method arar
    Bulamadığı içinde CTE verir.ü

    Eger Consturctor call yapmak istiyorsanız Constructorın adı yedire this yazarız..

   this(parametreler)  java bunun Constructor call olduğunu anlar.

     */
    int sayi = 20;

    String isim = "Ali";


    C01_ConstructorCall() {

        this(44);

        sayi = 15;

    }

    C01_ConstructorCall(int sayi) {

        this(44,"halil");

        this.sayi = sayi;

    }

    C01_ConstructorCall(int sayi, String isim) {
        this.sayi = 40;
        this.isim = isim;

    }

    public static void main(String[] args) {

        C01_ConstructorCall obj=new C01_ConstructorCall();
        System.out.println(obj.isim+", "+obj.sayi); // halil, 15


    }

}
