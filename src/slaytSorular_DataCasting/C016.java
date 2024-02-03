package slaytSorular_DataCasting;

public class C016 {
    public static void main(String[] args) {
        // input olarak verilen isim, soyisim ve kredi kartı bilgilerini
        // aşşağıdaki formatta yazdıran bir method oluşturun
        //isim : Hal** Eks**
        // kart no : **** **** **** 4535
    bankaBilgisiKaydetme("halil ibrahim","eksik","4242424242424242");

    }

    public static void bankaBilgisiKaydetme( String isim,String soyIsim, String krediKartno ){

        System.out.println(

            "isim : "+isim.substring(0,1).toUpperCase()+isim.substring(1,3).toLowerCase()+isim.substring(3).replaceAll("\\w","*")+" "+
                    soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1,3).toLowerCase()+soyIsim.substring(3).replaceAll("\\w","*")+
                "\nkart no : "+"**** **** **** "+krediKartno.substring(krediKartno.length()-4)




        );




    }


}
