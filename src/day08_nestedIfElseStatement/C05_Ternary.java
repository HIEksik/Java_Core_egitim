package day08_nestedIfElseStatement;

public class C05_Ternary {
    public static void main(String[] args) {

        // input olarak verilen bir tam sayının pozitif veya pozitif değil yazdırın

        int input = 15;

        if (input > 0) {
            System.out.println("sayı pozitif");
        } else {
            System.out.println("sayı pozitif degil");
        }
        // yazdırmak isteniyorsa

        System.out.println(input>0 ? "sayi pozitif ": "sayı pozitif degil");


        // input olarak verilen sayı çift sayı ise 2 katına çıkartın
        // tek sayı ise degerini 5 arttırın

        // atama isteniyorsa böyle

        input=input % 2 == 0 ? input*2 : input+5;

        System.out.println(input);

        if (input % 2 == 0 ){
            input*=2;
        }else {
            input+=5;
        }




    }
}
