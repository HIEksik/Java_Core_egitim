package slaytSorular_DataCasting;

public class C017_whileloop {
    public static void main(String[] args) {
        //While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        // yazdirin.


        int sayi=10;

        while (sayi<=99){

            sayi++;

            if (sayi%7==0){

                System.out.print(sayi+" ");
            }
        }

    }
}
