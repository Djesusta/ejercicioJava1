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
        System.out.println("---------------------------");
        OrdenamientoPorDirector ordenamientoPorDirector= new OrdenamientoPorDirector ();
        Collections.sort(Lista, ordenamientoPorDirector);
        for (Dvd dvd: Lista){
            System.out.println(dvd);
        }





    }

    public static List<Dvd>  ListaPeliculas (){
        Dvd pelicula1=new Dvd("Camino Hacia el terror","Terror","Desconocido","Desconocido");
        Dvd pelicula2=new Dvd("La Monja","Suspenso","Taissa Farmiga","Geritas");
        Dvd pelicula3=new Dvd("Harry Potter","Suspenso","Daniel Jacob Radcliffe","Dann");
        Dvd pelicula4=new Dvd("La falla de San Andres","Accion","Dwayne Johnson","Israel");
        Dvd pelicula5=new Dvd("Kill Bill","Accion","xx5","Sandra");
        Dvd pelicula6=new Dvd("Un lugar en silencio","Terror","xxx3","Lili");
        Dvd pelicula7=new Dvd("Soy leyenda","Accion","xxx2","Jose Antonio");
        Dvd pelicula8=new Dvd("Mamá","Suspenso","Andy Muschietti","Sergio");
        Dvd pelicula9=new Dvd("Rampage","Accion","Dwayne Johnson","Monica");
        Dvd pelicula10=new Dvd("La sirena","Fantasia","Ryn","Diana");

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
