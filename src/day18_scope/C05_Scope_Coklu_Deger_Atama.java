package day18_scope;

public class C05_Scope_Coklu_Deger_Atama {
    static String str;
    static  int sayi;

    public static void main(String[] args) {

        System.out.println(str);
        method1();

        str="Java";
        sayi=30;
        System.out.println(sayi);
        method1();
    }

    public static void method1(){

        sayi=20;
        System.out.println(sayi);
        sayi=sayi+15;
        System.out.println(str);
    }

}
