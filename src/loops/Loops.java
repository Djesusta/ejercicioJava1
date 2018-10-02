package loops;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Loops {

    public void  iterarConFor(){
        //iteracion con ciclo For Normal
        for (int i=0; i<10; ++i){
            System.out.println("Dentro del ciclo FOR" + i);
        }

        //Iteracion con ciclo FOR EACH
        ArrayList<Integer> numeros= new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        for (Integer numero: numeros){
            System.out.println("Dentro de FOREACH "+numero);
        }

        //Iteracion con Ciclo While
        int x=0;
        while (x<5){
            System.out.println("Dentro de WHILE " + x++);

        }
        //Iteracion con ciclo Do While
        do{
            System.out.println("Dentro de DO WHILE +" + x++);

        }while (x==0);

    }
}
