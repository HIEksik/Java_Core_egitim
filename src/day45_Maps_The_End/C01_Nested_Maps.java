package day45_Maps_The_End;

import java.util.HashMap;
import java.util.Map;

public class C01_Nested_Maps {
    public static void main(String[] args) {


      /*
       {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2024-07-21",
                   "checkout" : "2024-08-10"
                      },
            "additionalneeds" : "wi-fi"
            }
       */

        // yukaridaki bilgileri bir map olarak olusturun

        Map<String,Object> bodyMap=new HashMap<>();
        bodyMap.put("firstname","Ahmet");
        bodyMap.put("lasname","Bulut");
        bodyMap.put("totalprice",500);
        bodyMap.put("depositpaid",false);

        Map<String,String> bookingdatesValueMap=new HashMap<>();
        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");

        bodyMap.put("bookingdates",bookingdatesValueMap);
        bodyMap.put("additionalneeds","wi-fi");

        System.out.println(bodyMap);
        /*
        {firstname=Ahmet,
         additionalneeds=wi-fi,
          bookingdates={
          checkin=2024-07-21,
          checkout=2024-08-10},
           lasname=Bulut,
           totalprice=500,
           depositpaid=false}

         */
        // Olusturulan Map teki İsmi yazdırın?

        System.out.println(bodyMap.get("firstname")); // Ahmet

        // Totalprice yi yazdırın ?
        System.out.println(bodyMap.get("totalprice"));//500

        // Checkin tarihini yazdırın ?

        System.out.println( ( (Map<String,String>)  bodyMap.get("bookingdates")).get("checkin"));// 2024-07-21

        // firstname key ine ait value yi kaan yapın ?

        bodyMap.put("firstname","Kaan");
        System.out.println(bodyMap.get("firstname"));// Kaan

        // depositpaid key in value simni true yapın ?

        bodyMap.put("depositpaid",true);

        // checkout tarihini 2024-08-21 yapın

        ((Map<String, String>) bodyMap.get("bookingdates")).put("checkout","24-08-21");

        System.out.println(bodyMap);

        // valuelar arasında Kaan diye bir value varmı ?


        System.out.println(bodyMap.containsValue("Kaan"));// true

        // Valueler arasında "2024-08-21" var mı  ?

        System.out.println(bodyMap.containsValue("2024-08-21")); // False Çünkü diger Mapin içinde kaldığı için

        // Key lerde name varmı ?

        System.out.println(bodyMap.containsKey("name"));// False

        // Key lerde additionalneeds varmı ?

        System.out.println(bodyMap.containsKey("additionalneeds"));// true

    }
}
