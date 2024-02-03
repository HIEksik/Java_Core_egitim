package day32_encapsulation;

import day31_stringBuilder_accesModifier.C04_Access_Modifire;

public class C02_ChildOlmayanClass {
    public static void main(String[] args) {


        C04_Access_Modifire obj=new C04_Access_Modifire();

       //  System.out.println(obj.strPrivate);  Sadece aynı Clastakiler
       //  System.out.println(obj.sayiDefault); sadece ayni package dekiler
       // System.out.println(obj.blProtected);  Child Class lar
        obj.methodPublic();

    }
}
