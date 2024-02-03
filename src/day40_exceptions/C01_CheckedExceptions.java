package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException { // sorunun farkındayım sen yoluna devam et throws keyword ü
        // Kodun çalışmasını sağlar  Exception u kontrol altına almaz exception  oluşursa oluşur

        String dosyaYolu="src/day40_exceptions/yazi.txt";


        // Java da bilgisayarımızda var olan bir dosyaya ulaşmak için
        // FileInputString Class ı kullanılır

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlış");
        }
        /*
        Java bir dosyaya ulaşmak istedigimizde o dosyaya ulaşabileceginden emin olmak ister.
        ve bizi bu konuda bir eylem yapmaya zormak için kodun altını kırmızı çizer

        kodun altını kırmızı çizmesini
        bu güne kadar kodda hata var düzeltmemiz lazım diye yorumlamıştık

        Ancak check exception larda Java riski görür önlem almamız için altını çizer

        Java da dosyadan bilgi alma veya dosyaya bilgi yazdırma (inpu / output IO)ile ilgili
        exceptionlar check exceptionlardır
        yani daha compile anında riskleri fark eder ve bizden çözüm ister

         */

        /*
        Checked Exceptionlar için java bize iki alternatif sunar
        1- Şuana kadar yaptığımız gibi Try catch ile sarmalayıp sorun oluşsa bile çalışmaya devam ederiz

        2- Eger exceptionu kontrol altına alıp çalışmaya devam etmesini istemiyorsanız
        sadece kırmızı çizgiyi yok etmek kodlarımızı çalışır hale getirmek ve exception oluşursa
        kodlarımızın çalışmayı durdurmasını istersek
        method deklerasyonuna riskin farkında olduğumuzu beyan eden
        throws keyword yazmamız yeterlidir
         */
        FileInputStream file=new FileInputStream(dosyaYolu);



    }
}
