package day31_stringBuilder_accesModifier;

public class C05_ChildOfC04 extends C04_Access_Modifire {
    public static void main(String[] args) {
        /*
        Aynı package içinde farklı bir Class tayız ama Child Class tayız
         */

        C04_Access_Modifire obj=new C04_Access_Modifire();

     //   System.out.println(obj.strPrivate);
        //   tüm Accses modifire lere ulaşıldı ama private ye ulaşılamadı çünkü sadece o class a özel

      // Deger de atana bilir
        System.out.println(obj.sayiDefault);
        obj.sayiDefault=30;

        System.out.println(obj.blProtected);
        obj.blProtected=true;

        obj.methodPublic();


    }
}
