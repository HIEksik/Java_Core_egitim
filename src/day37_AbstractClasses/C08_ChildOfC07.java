package day37_AbstractClasses;

public class C08_ChildOfC07 extends C07_AbstractParent {


    @Override
    public String method2() {
        return "Child method2";
    }

    @Override
    public int method3() {
        return 0;
    }

    @Override
    public void method6() {
        System.out.println("Child method6");

    }

    @Override
    public void method7() {

        System.out.println("Child method7");
    }

    public static void main(String[] args) {

        C08_ChildOfC07 Child1=new C08_ChildOfC07();
        C07_AbstractParent Child2=new C08_ChildOfC07();
        C06_AbstrackGP Child3=new C08_ChildOfC07();



    }
}
