package day26_constructor;

public class C06_CarRanner {
    public static void main(String[] args) {

        C05_Car car1=new C05_Car("Toyota","Corolla");

        System.out.println(car1);
        // C05_Car{marka='Toyota', model='Corolla', renk='Renk belirtilmemis', yil=1900, fiyat=0}

        C05_Car car2=new C05_Car("Renault","Clio","Gri",2010,3000);

        System.out.println(car2);
        // C05_Car{marka='Renault', model='Clio', renk='Gri', yil=2010, fiyat=3000}


    }
}
