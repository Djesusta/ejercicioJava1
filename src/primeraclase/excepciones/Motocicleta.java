package primeraclase.excepciones;

public class Motocicleta extends  Vehiculo
{

    private String  placa;

    public Motocicleta(){
        placa="Desconocido Moto";
        setNumeroLlantas(2);

    }
    public void lavarVehiculo (){
        System.out.println("Entrando a lavar a mano");
    }
    public  Motocicleta (String placa) throws PlacaInvalidaException {
        // this.placa=placa;
        placa=placa.trim();
        placa=placa.replaceAll(" ","") ;
        if (placa.length()==5 || placa.length()==6){  // operadores de corto circuito || && o &
            this.placa=placa;

        }
        else
        {
            throw new PlacaInvalidaException("Invalida Placa Motocileta");
        }

    }

    //getter
    public String  getPlaca(){
        return placa;

    }
    public void  setPlaca (String placa){
        this.placa=placa;
    }


}
