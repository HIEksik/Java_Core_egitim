package day34_inheritanceConstructorCall;

public class C02_Parent extends C01_GP {
    C02_Parent(){
        System.out.println("Parent parametresiz Constructor");
    }
    C02_Parent(int a){
        System.out.println("Parent int parametreli  Constructor");
    }
    C02_Parent(String b){
        this();
        System.out.println("Parent String parametreli  Constructor");
    }
    C02_Parent(boolean c){
        super('c');
        System.out.println("Parent boolean parametreli  Constructor");
    }

}
