package colecciones;

public class Dvd implements Comparable<Dvd> {
    private String titulo;
    private String genero;
    private String protagonista;


    //contructor default

    public Dvd(){
        titulo="";
        genero="";
        protagonista="";
    }

    public Dvd (String titulo) {
        this.titulo=titulo;
    }

    public Dvd (String titulo ,String genero){
        this(titulo);
        this.genero=genero;
    }

    public Dvd(String titulo,String genero,String protagonista){
        this(titulo,genero);
        this.protagonista=protagonista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getProtagonista() {
        return protagonista;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista=protagonista;
    }




    @Override
    public String toString (){

       return titulo+"-"+genero +"-"+protagonista;
                //getTitulo() + getGenero() + getProtagonista();

    }

    @Override
    public int compareTo(Dvd o) {
        return titulo.compareTo(o.titulo);
    }
}
