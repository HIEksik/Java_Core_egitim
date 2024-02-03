package slaytSorular_DataCasting;

public class C017_Whileloopmethod {
    public static void main(String[] args) {
        //While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String metin="java güzeldir";


        System.out.println(terseCeviren(metin));

    }

    public static String terseCeviren(String metin){
        String tersMetin="";

        int sayac=0;
        int i=metin.length()-1;

        while (metin.length()!=sayac){

            tersMetin+=metin.charAt(i);

            sayac++;
            i--;


        }


        return tersMetin;
    }







}
