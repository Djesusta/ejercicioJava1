package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;

public class EjerciciosDvd {

    public static void main(String[] args){

        List<Dvd> Lista=  ListaPeliculas();

        for (Dvd dvd: Lista){
            System.out.println(dvd);
        }
        System.out.println("---------------------------");
        Collections.sort(Lista);
        for (Dvd dvd: Lista){
            System.out.println(dvd);
        }
        System.out.println("---------------------------");
        OrdenamientoPorGenero ordenamientoPorGenero= new OrdenamientoPorGenero();
        Collections.sort(Lista, ordenamientoPorGenero);
        for (Dvd dvd: Lista){
            System.out.println(dvd);
        }
        System.out.println("---------------------------");
        OrdenamientoPorProtagonista ordenamientoPorProtagonista= new OrdenamientoPorProtagonista();
        Collections.sort(Lista, ordenamientoPorProtagonista);
        for (Dvd dvd: Lista){
            System.out.println(dvd);
        }





    }

    public static List<Dvd>  ListaPeliculas (){
        Dvd pelicula1=new Dvd("Camino Hacia el terror","Terror","Desconocido");
        Dvd pelicula2=new Dvd("La Monja","Suspenso","Taissa Farmiga");
        Dvd pelicula3=new Dvd("Harry Potter","Suspenso","Daniel Jacob Radcliffe");
        Dvd pelicula4=new Dvd("La falla de San Andres","Accion","Dwayne Johnson");
        Dvd pelicula5=new Dvd("Kill Bill","Accion","xx5");
        Dvd pelicula6=new Dvd("Un lugar en silencio","Terror","xxx3");
        Dvd pelicula7=new Dvd("Soy leyenda","Accion","xxx2");
        Dvd pelicula8=new Dvd("Mamá","Suspenso","Andy Muschietti ");
        Dvd pelicula9=new Dvd("Rampage","Accion","Dwayne Johnson");
        Dvd pelicula10=new Dvd("La sirena","Fantasia","Ryn");

        List<Dvd> Listas =new ArrayList<Dvd>();
        Listas.add(pelicula1);
        Listas.add(pelicula2);
        Listas.add(pelicula3);
        Listas.add(pelicula4);
        Listas.add(pelicula5);
        Listas.add(pelicula6);
        Listas.add(pelicula7);
        Listas.add(pelicula8);
        Listas.add(pelicula9);
        Listas.add(pelicula10);


        return  Listas;

    }



}
