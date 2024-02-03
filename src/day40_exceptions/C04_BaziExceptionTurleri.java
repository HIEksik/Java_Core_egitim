package day40_exceptions;

public class C04_BaziExceptionTurleri {
    public static void main(String[] args) {

        // NullPointerException
        // null olarak işaretlenen bir String method ile kullanılırsa oluşur

        String str=null;

        System.out.println(str+555); // null555

        // System.out.println(str.concat("555")); // .NullPointerException

        // 2 - StringİndexOutOfException

        // verilen Stringte sınırların dışında index kullanılırsa

        str="Java candir";

       // System.out.println(str.substring(15,19)); // StringIndexOutOfBoundsException

        // 3 - ArrayİndexOutOfBandsException
        // verilen array de sınırların dışında index kullanılırsa

        // 4 -NumberFormatException
        // içinde sayı olmayan karakter barındıran bir String integer a parse edilmeye çalışılırsa

        str="12";// "12*";

        // String olarak verilen sayının karesini yazdırın

        System.out.println(Integer.parseInt(str)*Integer.parseInt(str));//144

        // 5 -ClassCastException
        // cast edilmesi mümkün olmayan bir degeri object üzerinden bir variable ye atamak isteyince oluşur


      //   Integer a=6;
       // Object b=a;
      //  String s= (String) b;

       // System.out.println(s); // ClassCastException



    }
}
