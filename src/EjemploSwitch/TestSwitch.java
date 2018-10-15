package EjemploSwitch;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.sql.SQLOutput;

public class TestSwitch {

    public static void main(String[]args){

         int x=4;

         switch (x){
             case 1:
                 System.out.println("x es igual a 1");

             case 2:
                 System.out.println("x es igual a 2");

             case 3:
                 System.out.println("x es igual a 3");

             case 4:
                 System.out.println("x es igual a 4");

             case 5:
                 System.out.println("x es igual a 5");

             case 6:
                 System.out.println("x es igual a 6");

             case 7:
                 System.out.println("x es igual a 7");

             case 8:
                 System.out.println("x es igual a 8");

             case 9:
                 System.out.println("x es igual a 9");

             case 10:
                 System.out.println("x es igual a 10");

             case 11:
                 System.out.println("x es igual a 11");

                 default:
                     System.out.println("no se sabe el valor de x");

         }


          Color colores=Color.NEGRO;

        switch (colores) {
            case ROJO:
                System.out.println("El color es ROJO");
                break;

            case NEGRO:
                System.out.println("El color es NEGRO");
             break;
            case AZUL:
                System.out.println("El color es AZUL");
                break;
            case BLANCO:
                System.out.println("El color es AZUL");
                break;
            default:
                System.out.println("El color  no existe");
        }



    }

}
