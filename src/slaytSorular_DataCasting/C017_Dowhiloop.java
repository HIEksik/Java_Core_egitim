package slaytSorular_DataCasting;

public class C017_Dowhiloop {
    public static void main(String[] args) {
        //Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char harf='k';


        do {
            System.out.print(harf +" ");
            harf++;
        }while (harf<='t');
    }
}
