package day33_inheritance;

public class C04_RunnerClass {

    public static void main(String[] args) {

        C03_DizelCorolla dc1=new C03_DizelCorolla();

        System.out.println(dc1.sanzuman);// Belirtilmemiş A


        System.out.println(dc1.marka);// Toyota / Toyota Classından yazdıracak - En alttaki clastan başlar okumaya
        System.out.println(dc1.guvenlik);// Extra guvenlik T


        System.out.println(dc1.model);//Corolla  DC
        System.out.println(dc1.motor);// Dizel  DC
        System.out.println(dc1.yakit);// Dizel dc
        System.out.println(dc1.uretimYeri);// Sakarya dc
        System.out.println(dc1.aku);// Incı aku dc
        System.out.println(dc1.teker);// pirelli 15 inc DC
        System.out.println(dc1.renk);// belirtilmemis DC
        System.out.println(dc1.fren);// abs dc





    }

}
