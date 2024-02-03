package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CokluCheckedException {
    public static void main(String[] args){ //throws FileNotFoundException, IOException, Exception { // hataların derecesine göre yakalar

        /*
        Eger kodumuzda birden fazla Exception oluşma ihtimali varsa
        tek Try , birden fazla catsh blogu kullana biliriz
        catch blokları sıralanırken exception türleri dikkate alınmalıdır.

        - Eger oluşa bilecek exceptionlar arasında
        parent child ilişkisi yoksa bir birinden farklı ise
        istedigimiz sıralamada yaza biliriz

        - eger oluşa bilecek exceptionlar parent child ilişkisine sahip iseler
        üstte child olanı üste
        parent olanı alta yazmalıyız aksi takdirde parent üstte olursa
        tüm exceptionları yakalar ve child exceptionu yazmak anlamsız olur.



         */



        String dosyaYolu="src/day40_exceptions/yazi.txt";


        try {
            FileInputStream fis=new FileInputStream(dosyaYolu); // dosya ya ulaşma yolu

            int k=0;
            while ((k=fis.read())!=(-1)){ // dosyayı okuyup bize getir
                System.out.print((char)k );
            }
        } catch (FileNotFoundException e) {
            System.out.println("Yazilan dosya yolunda sorun var");

        }catch (IOException e) {
            System.out.println("Dosya okunurken hata oşluştu");

        }catch (Exception e) {
            System.out.println("On görülemeyen bir Exception olustu");

        }


    }
}
