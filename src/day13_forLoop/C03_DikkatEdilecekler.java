package day13_forLoop;

public class C03_DikkatEdilecekler {
    public static void main(String[] args) {

            // Eger i' nin ilk degeri için bile bitiş sarti true olmazsa
            // loop body si hiç devreye girmez loop çalışır ama hiç bir işlem yapmaz
            // loop un yapacagı işlem body de oldugu için ilk sorgulamada false olur ve body çalışmaz loop çalışır işlem yapmaz

        for (int i = 10    ; i >20 ;      i++) { // i 10>20 diye sorar false loop çalışmaz loop boydsi devreye girmez

            System.out.println("Bu loop body si hiç çalışmaz"+i);

        }

        //eger  i nin bütün degerleri için bitiş şartı true oluyorsa
        // for sonsuz döngüye girer çünkü
        // int i= 10 ; ilk çalıştı
        // i>0 true  (10>0)
        // i++ i yi arttırdı
        // i>0  true (11>0)
        // i++ i yi arttırdı
        // i>0 true (12>0)
        // i++ i yi arttırdı
        // i>0 true (13>0 )
        // i++ i yi arttırdı
        // böylece sonsuz döngü oluşmuş oldu

       for (int i = 10        ;      i > 0        ;    i++) {

            System.out.println(i+" ");

        }



    }
}
