package slaytSorular_DataCasting;

public class C11_stringmanipulation {
    public static void main(String[] args) {
        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 26.70 €

        String str1="15.30";
        String str2="11.40";

        double fiyat=Double.parseDouble(str1);
        double fiyat2=Double.parseDouble(str2);

        System.out.println("output : "+(fiyat+fiyat2)+"€");




    }
}
