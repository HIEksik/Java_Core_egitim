package day15_methodOolusturma;

import java.util.Scanner;

public class C01_KendiSubSitringMethodumuz {
    public static void main(String[] args) {
        /*
        Verilen bir String ve başlangıç ve bitiş indexleri için
        aşşagıdaki görevi tamamlatın.
        1- Başlangıç indexi bitiş indexinden büyükse hata yazdırın
        2- Başlangıç ve/veya bitiş indexi verilen stringin dışında ise hata yazdırın
        3- İndexler sınırlar içerisinde ise başlangıç indexi dahil bitiş indexi hariç olacak şekilde iki index
           arasındaki harfleri yazdırın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen başlangıç indexisini giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis indexisni giriniz");
        int bitis=scanner.nextInt();

        if (baslangic>bitis){
            System.out.println("Baslangıc indexi bitiş indexinden küçük olmalıdır");
        } else if (baslangic>=metin.length()||bitis>=metin.length()) {
            System.out.println("Verilen indexler metnin disinda");
        }else {

            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println(" ");
        System.out.println(metin.substring(baslangic, bitis));

    }
}
