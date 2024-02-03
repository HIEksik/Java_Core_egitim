package day12_stringManipulation;

public class C05_stringManipulations {
    public static void main(String[] args) {
        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.35 €” , input2 : “11.40 €”
        //output : 26.70 €

       // String str1="15.30";
       // String str2="11.40";
//
       // double fiyat=Double.parseDouble(str1);
       // double fiyat2=Double.parseDouble(str2);
//
       // System.out.println("output : "+(fiyat+fiyat2)+"€");


        String str1="15.35";
        String str2="11.40";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        double fiyat=Double.parseDouble(str1);
        double fiyat2=Double.parseDouble(str2);

        System.out.println("Fiyatlar toplamı : "+(fiyat+fiyat2)/100+" €");




    }

}
