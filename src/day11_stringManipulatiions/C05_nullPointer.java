package day11_stringManipulatiions;

public class C05_nullPointer {
    public static void main(String[] args) {

        String str ;
       // System.out.println(str);
        // Bir variable yi deger atamadan oluştura biliriz ama deger atamadan kullanamayız

        String str2="";
        System.out.println("Str2 nin degeri :"+str2+"======");
        System.out.println("Str2 nin uzunlugu :"+str2.length());// 0

        // str2 ye "" ataya biliriz
        // bu durumda java bu variable ye bir deger atandığını kabul eder
        // deger atan mamış elementleri say dediğimizde "" degeri atananları dolu kabul eder
        // baska data türlerinde "" atama şansımız da olmaz

        // null pointer java tarafından özel bir görev ile oluşturulmuştur
        // bir variable ın deger atanmamış olduğunu işaretler
        // null bir deger değil işaretçidir.

        String str3=null;

        System.out.println(str3);// null / yazdırmamıza izin verir ve null yazdırır


        System.out.println(str3+"Java");// nullJava / olarak yazdırır

        // str3 null olarak işaretlenmiştir deger atanmamıştır

        // null primitive variable lere yazılamaz
        // sadece non-primitivlere yazıla bilir

        // özel bir keyword tür
        // null olarak işaretlenen variable ler sadece yazılabilir
        // deger atamadan başka işlem yapmak isterseniz NullPointerException verir

        System.out.println(str3.length());// başta itiraz etmez ama yazdırdıktan sonra hata verir çünkü deger atanmamış
        System.out.println(str3.concat("Java"));// NullPointerException

        // str3 + "java" yazdıra biliriz
        // ama st3+concat("java") methodu ile birleştiremeyiz





    }
}
