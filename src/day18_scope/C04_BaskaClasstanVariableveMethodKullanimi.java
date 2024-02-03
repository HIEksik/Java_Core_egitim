package day18_scope;

public class C04_BaskaClasstanVariableveMethodKullanimi {

    public static void main(String[] args) {
        // baska Classtan static clas üyesi kullanmak için clasismi.statikuyeismi yazmanız gerekli
        System.out.println(C03_Scope_Class_variable_kullanim.s);//null
        System.out.println(C03_Scope_Class_variable_kullanim.a);// 0
        C03_Scope_Class_variable_kullanim.method1();// static olan  method calisti

        // statik olan


        // static olmayan variablelere ulaşmak için isöe
        // kullanmak istedigimiz class tan obje oluşturmalıyız scanner gibi

        C03_Scope_Class_variable_kullanim obj=new C03_Scope_Class_variable_kullanim();
        System.out.println(obj.chr); // hiçlik
        System.out.println(obj.bl); // false
        obj.method2();//  ctatic olmayan method çalıştı

        // static olan bir class variablesine statik olmayan yolla ulaşmak istersek java kullanmamıza itiraz etmez ama intelije
        // bizi uyarır
        // static bir class uyesine static olmayan yöntemle ulaşıyorsun
        System.out.println(obj.s);// null
        System.out.println(obj.a);// 0
        obj.method1();// static olan method çalıştı


    }
}
