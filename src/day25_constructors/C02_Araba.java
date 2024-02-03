package day25_constructors;

public class C02_Araba {

    String marka="Marka belirtilmemis";
    String model= "Model belirtilmemis";
    String renk="Renk belirtilmemis";
    int yil= 1900;
    int fiyat;

    @Override
    public String toString() {
        return "C02_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    C02_Araba(){  // Bu Constructor Default Constructor ile aynı işleve sahiptir
                    // Görünür oldugundan default Constructor denmez Parametresiz denir
                    // Bu Constructor ın body sine kod yaza bilir ama defaultun bodysinde kod olmaz (varsayılanı çalıştırır)

    }

    public void motor(){

        System.out.println("Tum arabalarin motoru olur");

    }
    public void guvenlik(){
        System.out.println("Tüm arabaların guvenlik donenimlari olmalidir");
    }
}
