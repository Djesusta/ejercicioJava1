package Estatic;

public class Galleta {
    private String  sabor;
    private String forma;
    private String tamano;
    private String color;
    private static int cantidad=0;

    Galleta(String sabor, String forma, String tamano, String color) {


        this.sabor = sabor;
        this.forma = forma;
        this.tamano = tamano;
        this.color = color;

        this.cantidad++;
        this.sabor =  cantidad+"-"+ sabor;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Galleta.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public String getForma() {
        return forma;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTamano() {
        return tamano;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString () {

        return sabor + " " + forma + " " + tamano + " " + color ;
    }

}
