package day38_interfaces;

public interface I01_Interface {

    /*
        Interface ler class degildir.

        KURAL 1 : Interface ler full abstraction sağlar

        KURAL2 : Bir interface içinde oluşturulan methodlar için public veya abstruction keywordlerini yazmak
        redundant dir. yani yazsakta yazmasakta bu özellikleri taşıyacağından yazmak gereksiz olur.

        Kural3 :Bir interface içinde oluşturulan methodlar için public,static veya final  keywordlerini yazmak
        redundant dir. // gereksizdir

        Kural4 : Bir class bir den fazla class ı inherit edemez ..
                 Ama bir den fazla Interface yi implement edebilir
                 Bir class bir class a exdents edeip bunun yanında
                 bir den fazla interfaceye de implement edebilir.
        Kural5 : Class dan class a inherit için extends
                 Class dan interface ye inherit için implement
                 Interface den Internfaceye inherit için extends
                 Interface den class a inherit OLMAZ
        Kural6 : Bir class bir den fazla interface i inherit ettiginde
                 Parent interfacelerde aynı isimde variable varsa
                 Seçim yapmamızı ister interface ismi.variableİsmi şekli,nde kullandırır
                 -Parent interfacelerde  aynı isimde method varsa
                   * eger return type ları aynı ise
                   hangisinden alğdığı önemli olmaz
                   o methodu override eder
                   * Return type ları farklı ise
                   overridding method hengi return type ı seçse diger interface itiraz eder
                   bu durumda 2 interface den birine implement edebilir. Ötekini bırakırız




     */

    public abstract void method1(); // interface de public yazmamıza gerek yok diyor intelij
    // interface nin hiç bir üyesi variablesi için puclik yazmamıza gerek yok

    public  void method2();
    abstract void method3();

    void method4();

    public static final int SAYI=20; // // interface de public yazmamıza gerek yok diyor intelij

    public String stSTRr="Java";
    final boolean guzelmGUZEL_MI=true;
    char  IKL_HARF='H';



}
