package day16_methodOlusturma_methodOverloadin;

public class C03_StringMethodlari {
    public static void main(String[] args) {

        String str="Java cok kolay, yeterki anlayalim";

        str.toLowerCase();// metni küçük hale çevirir j
                            // yazdırmadığımız veya atama yapmadığımız için boşa çalışmış olur

        C02_returnTypeileMethodOlusturma.ismiIstenenFormataCevir("halil","eksik");

        // bize birşey döndüren methodları ya uygun bir variableye atamalıyız yada yazdırmalıyız
        // aksi halde method çalışır bize sonucu döndürür (getirir)
        // ama kullanmadığımız için havaya uçar yani birşey yapmaz


        // bu method vois olduğundan sadece çağırabilirim
        C01_voidMethodOlusturma.kisiBilgileriYazdir("ayşe","hancı","4242424242424242");
        //isim : Ayş* Han*ı
        //kart no :  **** **** **** 4242

        C02_returnTypeileMethodOlusturma.ismiIstenenFormataCevir("halil","Eksik");
        // bir şey yapmazsak bu method methodtta dönüştürülen hali getirir
        //H***** E****
        // sout ile yazdırmazsak konsolda bir şey görmeyiz.

        //kaydetme
        String donusmusIsim=C02_returnTypeileMethodOlusturma.ismiIstenenFormataCevir("halil","eksik");

        // istedigimiz anda dönüşmüş isim variable si ile yazdıra biliriz veya kullana biliriz. String methodlar gibi
        System.out.println(donusmusIsim); // H**** E****


    }
}
