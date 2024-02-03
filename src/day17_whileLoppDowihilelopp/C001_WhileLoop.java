package day17_whileLoppDowihilelopp;

public class C001_WhileLoop {
    public static void main(String[] args) {
        // 1 den 20 ye kadar sınırlar dahil sayıları topla

        int toplam = 0;

        for (int i = 1; i <=20; i++) {
            toplam+=i;
        }
        System.out.println(toplam);

    // While lopp oluışturulurken başlangıc degeri bitis sarti ve artıs seklini otomatik oluştuırmaz
        // bunları bizim yazmamız lazım

        // eger forloop ile yapıla bilen bir soru varsa forloop tercih edilir

        toplam =0;   // önce 2 variable tanımlıyoruz
        int basla=1;

        while (basla<=20){ // sonra şartı yazıyoruz
            toplam+=basla;
            basla++;       // sonra şarı arttırmamız gerekiyor


        }
        System.out.println(toplam);

        // eger tekrar sayısı belli degilse forloop yerine whileloop kullanmayı tercih ederiz



    }


}
