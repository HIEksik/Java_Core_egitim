package slaytSorular_DataCasting;

import java.util.Scanner;

public class C09_switchCase2 {
    public static void main(String[] args) {

        //Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen ay numarasını giriniz :");
      int ay=scanner.nextInt();

       //switch (ay){
       //    case 1:
       //        System.out.println("Ocak");
       //        break;
       //    case 2:
       //        System.out.println("Şubat");
       //        break;
       //    case 3:
       //        System.out.println("Mart");
       //        break;
       //    default:
       //        System.out.println("Lütfen 12 numaraya kadar giriniz");

        //Kullanicidan ay numarasini alip mevsimi yazdirin.


        switch (ay){
            case 1:
            case 2:
            case 3:
                System.out.println("Kış mevsimi");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("ilk bahar");
            break;
                case 7:
            case 8:
            case 9:
                System.out.println("Yaz mevsimi");
           break;
            case 10:
            case 11:
            case 12:
                System.out.println("Kıs mevsimi");
                break;

            default:
                System.out.println("Yanlış ay girildi");

        }

    }
}
