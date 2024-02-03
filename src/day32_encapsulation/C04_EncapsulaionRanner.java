package day32_encapsulation;

public class C04_EncapsulaionRanner {
    public static void main(String[] args) {

        // Access Modifire ile bir variableye erişim yetkimiz varsa
        // onu hem yazdıra bilir
        // hemde deger ataya biliriz
        // ulaşamıyorsak yazdıramayız ve deger atayamayız hiç bir işlem yapamayız.


        C03_Encapulation obj=new C03_Encapulation();


        obj.strDefault = "Default";
        System.out.println(obj.strDefault);
        obj.strProtected="Protected";
        System.out.println(obj.strProtected);
        obj.strPublic="Public";
        System.out.println(obj.strPublic);

        // Erişim yani degerini görüntüleme yani okuma ile write yani deger ataya bilme yetkisini ayıra bilirmisiniz???

        // İlgili variableleri private yaptıgımız için
        // Acces modifire yaptığımız için onları kullanmamıza izin vermnez

        System.out.println(obj.getToplamSatisTutari());//0
        obj.setSatisTutari(50);
        obj.setSatisTutari(100);
        obj.setSatisTutari(100);

        System.out.println(obj.getToplamSatisTutari());// 250

    }
}
