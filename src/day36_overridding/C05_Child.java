package day36_overridding;

public class C05_Child extends C04_Parent {

    public void method1(int sayi ){
        // Method ismi parent  Clastaki ike aynı olursa Overrriding olur
        // Over riddingde daha günceli kullanmak için method Body si degiştirilir
        // Eger Methodun Signaturesi ı değiştirilirse parentle farklı olursa ozaman OVERRİDDİNG yapmaz
        // parametresi ve method adını degiştirirsek


    }
    public void method2(){


    }

    @Override // Overridding notasyonu denir buna
    public void method3() {

        // intelij tarafından yapılan overridding methodu @Override Notasyonu alır
        // Bu notasyonu alan method parent classtan silinirse method hata vermez fakat @Override CTE verir

    }
    public static void method4(){
        // static method olursa Overridding yapmaz // static silinirse de kabul etmez CTE verir
        // overridding için Static yapılmaz
    }
    // child daki method parentteki methoddan daha geniş olmalıdır veya default olmalıdır .
    // returne type lari aynı olmalıdır
    // Parent te oluşturulan method child te çalışırış ama en günceli çalışır ikisi birlikte çalışmakz
    // iki method da çalıştırılacak sa super.method() olarak chidl ten çagırmamız gerekiyor.

}
