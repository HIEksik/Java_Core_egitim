package day32_encapsulation;

public class C03_Encapulation {

    private String strPrivate;
    String strDefault;
    protected  String strProtected;
    public  String strPublic;

    private  int satisTutari;
    // Başka class lar satış tutarı variablesine deger ataya bilsin
    // atanan her deger toplam satış tutarına otomatik olarak eklensin
    // ama satış tutarı variable ının degerini kimse yazdıramasın
    // deger atana bilsin ama atanan degerler görülemesin

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari+=satisTutari;
    }

    private  int toplamSatisTutari;


    // toplam satış tutarı dergerini başka class lazr göre bilsin
    // ama kimse toplam satış tutarı variablesine deger atayamasın
    // degeri görüle bilsin ama deger atanamasın

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }


    // toplam satış tutarı dergerini başka class lazr göre bilsin
    // ama kimse toplam satış tutarı variablesine deger atayamasın
    // degeri görüle bilsin ama deger atanamasın



    public static void main(String[] args) {

        /*
        Direk erişim için sadece acces modifire yeterli olmaz
        static key worde de bakmak lazım
         */
        C03_Encapulation obj=new C03_Encapulation();

        obj.strDefault="Default varible";
        System.out.println(obj.strDefault);// Default varible
        obj.strPrivate="Private variable";
        System.out.println(obj.strPrivate);// Private variable

    }



}
