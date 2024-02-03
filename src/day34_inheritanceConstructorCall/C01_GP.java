package day34_inheritanceConstructorCall;

public class C01_GP {
    C01_GP(){

        System.out.println("GP parametresiz Constructor");
    }
    C01_GP(int sayi){

        this("Ali");

        System.out.println("GP int parametreli Constructor");
    }
    C01_GP(String str){

        System.out.println("GP String parametreli Constructor");
    }
    C01_GP(boolean bl){

        System.out.println("GP boolean parametreli Constructor");
    }
}
