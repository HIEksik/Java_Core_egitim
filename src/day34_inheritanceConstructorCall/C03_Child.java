package day34_inheritanceConstructorCall;

public class C03_Child extends C02_Parent {
    C03_Child(){
        super("halil");
        System.out.println("Child parametresiz Constructor");
    }
    C03_Child(int sayi ){
        System.out.println("Child int parametreli Constructor");
    }
    C03_Child(String str ){
        super(true);
        System.out.println("Child String parametreli Constructor");
    }
    C03_Child(boolean a ){
        System.out.println("Child boolean parametreli Constructor");
    }

    public static void main(String[] args) {

       // C03_Child child1=new C03_Child();
       // C03_Child child2=new C03_Child(5);
        C03_Child child3=new C03_Child("Kamil");


    }
}
