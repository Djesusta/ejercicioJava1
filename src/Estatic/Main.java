package Estatic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args){

        Galleta galleta1= new Galleta ("Chocolate","Redonda","Chica","cafe");
        Galleta galleta2= new Galleta ("Vaninilla","Redonda","Chica","cafe");
        Galleta galleta3= new Galleta ("Capuchino","Redonda","Chica","cafe");
        Galleta galleta4= new Galleta ("Chocolate","Redonda","Chica","cafe");


        List <Galleta> galletas = new ArrayList<>();
        galletas.add(galleta1);
        galletas.add(galleta2);
        galletas.add(galleta3);

        for (Galleta galleta:galletas){

            System.out.println(Galleta.getCantidad()+" - "+   galleta);
        }





    }


}
