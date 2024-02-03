package day16_methodOlusturma_methodOverloadin;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // 1 den 20 ye kadar olan tam sayıları toplayın

        int toplam=0;

        for (int i = 1; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);// 210

        // while loop oluşturulurken başlangıç degeri , bitiş şartı  ve artış şeklini otomatik oluşturmaz.
        // bunları bizim manuel olarak yapmamız gerekiyor


        // eger foor loop ile yapıla bilen bir soru varsa forloop tercih edilir.

        toplam=0;
        int baslangic=1;

        while (baslangic<=20){
            toplam+=baslangic;
            baslangic++;
        }

        System.out.println(toplam);// 210

        // eger tekrar sayısı belli degilse forloop yerine whileloop kullanmayı tercih ederiz
        // or kullanıcıdan şifre alın şifre doğru girilene kadar tekara etsin deniyorsa whileloop

    }
}
