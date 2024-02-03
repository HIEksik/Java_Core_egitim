package day16_methodOlusturma_methodOverloadin;

public class C02_returnTypeileMethodOlusturma {
    public static void main(String[] args) {

        // Verilen isim ve soyismi istenen formata çevirip bize döndüren bir method oluşturun
        // or : A***** B*****

        System.out.println(ismiIstenenFormataCevir("halil", "eksik"));


    }

    public static String ismiIstenenFormataCevir(String isim,String soyIsim){

        String donusmusIsim=isim.substring(0,1).toUpperCase()
                            +isim.substring(1).replaceAll("\\w","*")+
                " "+
                soyIsim.substring(0,1).toUpperCase()
                +soyIsim.substring(1).replaceAll("\\w","*");
     return donusmusIsim;
    }




}
