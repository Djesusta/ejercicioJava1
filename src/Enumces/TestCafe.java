package Enumces;

public class TestCafe {
    public static void main(String[] args) {


        Cafe cafe1= new Cafe ();
        Cafe cafe2= new Cafe ();
        Cafe cafe3= new Cafe ();
        cafe1.setTamanoCafe(TamanoCafe.ALTO);
        cafe2.setTamanoCafe(TamanoCafe.GRANDE);
        cafe3.setTamanoCafe(TamanoCafe.VENTI);
        System.out.println(cafe1.getTamanoCafe() );
        System.out.println(cafe1.getTamanoCafe().getOnzas() );
        System.out.println(cafe1.getTamanoCafe().getTipoTapa() );
        System.out.println(cafe2.getTamanoCafe());
        System.out.println(cafe2.getTamanoCafe().getOnzas() );
        System.out.println(cafe2.getTamanoCafe().getTipoTapa() );
        System.out.println(cafe3.getTamanoCafe());
        System.out.println(cafe3.getTamanoCafe().getOnzas() );
        System.out.println(cafe3.getTamanoCafe().getTipoTapa() );


    }
}
