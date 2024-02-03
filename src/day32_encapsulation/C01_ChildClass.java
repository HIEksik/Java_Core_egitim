package day32_encapsulation;

import day31_stringBuilder_accesModifier.C04_Access_Modifire;

public class C01_ChildClass extends C04_Access_Modifire {
    // extends key word içinde bulundugumuz C01_ChildClass ını C04_AccessModifire class ının child i yapar

    public static void main(String[] args) {

        C04_Access_Modifire obj=new C04_Access_Modifire();

     //   System.out.println(obj.strPrivate);  Sadece kendi Classından ulaşabiliriz
      //  System.out.println(obj.sayiDefault); kendi package si ulaşabilir// diger adı package private dir ( package ye özel )
      //  System.out.println(obj.blProtected); Eger Child class sa kendi protected bilgilerine ulaşıla bilir yoksa O class için obje oluşturulur
        obj.methodPublic();

        C01_ChildClass objChild=new C01_ChildClass();
        System.out.println(objChild.blProtected);

        objChild.blProtected=true;
    }
}
