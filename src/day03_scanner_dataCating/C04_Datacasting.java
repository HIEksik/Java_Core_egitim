package day03_scanner_dataCating;

public class C04_Datacasting {
    public static void main(String[] args) {

        int sayiInt = 20;
        short sayiShort = 34;
        double sayiDouble = 22;
        String str = "Java";
        char chr = 'K';
        boolean bl = true;

        // Bir data türündeki variable'a
        // başka data türünden deger atana bilir mi ?

       // String abc=sayiInt;
       //   String abc=bl;
       // String abc=chr;

      //  char c = str;
       // char c = bl;
       // char c = sayiInt; ?

        double dbl = sayiInt;
        dbl=sayiShort;
        dbl=chr;
        // dbl=str;
       // dbl=bl;

        //int in = sayiDouble;

        int in =sayiShort;
        in=chr;

        // short shrt=sayiDouble;
        // short shtr =sayiInt;
        // short shrt= chr;



    }
}
