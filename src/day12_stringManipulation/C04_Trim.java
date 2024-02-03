package day12_stringManipulation;

public class C04_Trim {
    public static void main(String[] args) {


        // Trim baştaki ve sondaki Spaceleri temizler

        String str="    Ali topa        vur.   ";

        // Metindeki kullanılan fazla spaceleri temizleyin

        // baştaki ve sondaki. space leri sildik
        str=str.trim();

        // ortadaki Spaceleri temizledik
        str=str.replaceAll("\\s+"," ");

        System.out.println(str);// Ali topa vur.







    }
}
