package day34_inheritanceConstructorCall;

import java.util.SortedMap;

public class C05_Child extends C04_Parent {

    String str = "Java daha guzeldir";
    String t = "Java Java Java";
    int sayi = 15;
    int b = 25;

    public static void main(String[] args) {

        C05_Child obj=new C05_Child();
        obj.method1();

    }
    public void method1(){
        String t = "Hava Cok Guzel";
        int a=27;
        int b=37;
        String str="Her şey guzel olacak";
        /*
        Her hangi bir Scope da bir variable kullanmak istedigimizde o variablenin degerini bulmak için Java önce
        içinde bulundugu Scope a
        Scope da bulamazzsa class level a
        Class levelde bulamazsa Parent a
        Parent ta bulamazsa Grand Parent lara bakar
        Ve ilk buldugu degeri kullanır.

        Eger this.Variable dersek aramaya içinde bulundugu scope u atlar ve Clas level Scope una bakar
        Eger super.Variable dersek aramaya scope ve class level ı  atlayıp aramaya Parent class tan başlar


       Önemli not : Aramaya başlayacağı yeri Javaya söyledikten sonra
       Java söyledigimiz yerden başlar ve yukarıya doğru yazılan sıralama ile aramaya devam eder
       eger aradıgı variable ı aadığı basamaklarda bulamazsa CTE verir .
       (Geriye dönüş yok )
         */

        System.out.println(s);// Java candir
        System.out.println(this.s);// Java Candir
        System.out.println(super.s);// Java candir

        System.out.println(sayi);// 15
        System.out.println(this.sayi);// 15
        System.out.println(super.sayi);// 20

        System.out.println(b);// 37
        System.out.println(this.b);// 25
        // System.out.println(super.b);// Cte Parentte b diye bir variable yok

        System.out.println(t);// Hava cok guzel
        System.out.println(this.t);// Java Java Java
        //System.out.println(super.t);//CTE

        System.out.println(str);// Her şey guzel olacak
        System.out.println(this.str); // Java daha guzeldir
        System.out.println(super.str);// Java guzeldir

        System.out.println(a);// 27 / önce scope a bakar
        System.out.println(this.a);//  30 / Önce claass a bakar yoksa Parent class a bakar
        System.out.println(super.a);// 30 / ilk calss a gider ve oraya bakar




    }

}
