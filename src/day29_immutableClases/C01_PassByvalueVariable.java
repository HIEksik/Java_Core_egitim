package day29_immutableClases;

public class C01_PassByvalueVariable {
    public static void main(String[] args) {

        // Pass by Value = Javanın çalışma mantığıtır.. Methodlar arası geçiş yapmayı ifade eder..
        // Methodlar arası geçiş yaparken main methoddan oluşturulan methoda Variable degil
        // DEGER gönderir ve Yeni degeri tekrardan bize döndürür


        // bir method yapıp verilen sayının karesini döndürün?

    int sayi=11;

        System.out.println(getSquare(sayi)); //121

    }

    public static int getSquare(int a){
        return a*a;
    }
}
