package day16_methodOlusturma_methodOverloadin;

public class C01_voidMethodOlusturma {
    public static void main(String[] args) {


        // input olarak verilen isim, soyisim ve kredi kartı bilgilerini
        // aşşağıdaki formatta yazdıran bir method oluşturun
        //isim : Hal** Eks**
        // kart no : **** **** **** 4535
            kisiBilgileriYazdir("halil  ibrahim","eksik","4242424242424242");

    }


    public static void kisiBilgileriYazdir(String isim, String soyisim, String krediKartno) {

        System.out.println(
                "isim : "+
                        isim.substring(0,1).toUpperCase()+isim.substring(1,3).toLowerCase()+isim.substring(3).replaceAll("\\w","*")+
                 " " + soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,3).toLowerCase()+soyisim.substring(3).replaceAll("\\w","*")+
                        " " +
                        "\nkart no : "+" **** **** **** "+krediKartno.substring(krediKartno.length()-4)


        );

    }


}
