package colecciones;

import java.util.*;
import java.util.Map.Entry;

public class ListSetMapSet {

    public static void main(String []args) {


//Generico Se utiliza para crear una lista de un tipo espesifico
        //Organiza los datos
        List<String> lista =new ArrayList<>();
        lista.add("Israel");
        lista.add("Dann");
        lista.add("Serch");
        lista.add("Josman");
        lista.add("Gera");
        lista.add("Josman");
        lista.add("Gera");


        //No almacena valores duplicados
        //No organiza los datos
        Set<String> set=new HashSet<>();
        set.add("Israel");
        set.add("Dann");
        set.add("Serch");
        set.add("Josman");
        set.add("Gera");
        set.add("Josman");
        set.add("Gera");


        //Guarda una clava y un valos
        //Se utiliza para Obtener de un valor complejo por medio de un valor corto
        Map<String, String> mapa=new HashMap();
        mapa.put("Israel", "Israel Segundo");
        mapa.put("Dann","Dann Hernandez");
        mapa.put("Serch","Sergio Rivera");
        mapa.put("Josman","Jose Manuel Moreno");
        mapa.put("Gera","Gerardo Rincon");


        for (String nickname:lista) {
            System.out.println(nickname);
        }

        System.out.println("====================================================================");

        for (String nickname:set) {
            System.out.println(nickname);

        }

        System.out.println("====================================================================");

        for (Entry<String, String> entry:mapa.entrySet()) {

            System.out.println(entry.getKey() + "-"+ entry.getValue());

        }

        System.out.println(new ListSetMapSet().hashCode());





    }//fin del main


}//fin de la clase