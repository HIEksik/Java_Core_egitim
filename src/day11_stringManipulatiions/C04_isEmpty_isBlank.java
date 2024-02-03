package day11_stringManipulatiions;

public class C04_isEmpty_isBlank {
    public static void main(String[] args) {

        String str1="";
        String str2="       ";
        String str3="a b";

        // isEmpty sadece hiç lige true döndürüyor

        System.out.println(str1.isEmpty());//  true   str 1 boş mu
        System.out.println(str2.isEmpty());//  false  str 2 boş mu / hayır space var
        System.out.println(str3.isEmpty());// false

        // isBlank hem hiçlige hemde space e true döndürüyor

        System.out.println(str1.isBlank());// true boşluk var mı diye sorar hiçlik boşluk olarak kabul eders
        System.out.println(str2.isBlank());// true
        System.out.println(str3.isBlank());// false
    }
}
