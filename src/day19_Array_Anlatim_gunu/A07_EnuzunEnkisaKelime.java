package day19_Array_Anlatim_gunu;

public class A07_EnuzunEnkisaKelime {


    public static void main(String[] args) {

        // Verilen bir String Arraydeki en uzun ve en kısa kelimeleri method içinde yazdırın

        String [] arr={"elma","armut","mandalina","portakal"};

        String enUzunkelime=arr[0];

        String enKisakelime=arr[0];



        for (int i =0; i<arr.length;i++){

            if (arr[i].length()>=enUzunkelime.length()){
                enUzunkelime=arr[i];
            }

            if (arr[i].length()<=enKisakelime.length()){
                enKisakelime=arr[i];
            }

        }

        System.out.println("Array deki en uzun kelime : "+enUzunkelime);
        System.out.println("Array deki en kısa kelime : "+enKisakelime);




    }
}
