import com.sun.org.apache.bcel.internal.generic.RETURN;
import primeraclase.excepciones.PlacaInvalidaException;
import primeraclase.excepciones.Vehiculo;

public class Auto extends Vehiculo {

    private String  placa;

//constructor sin parametros (default)

    public Auto(){
        placa="Desconocido";
        setNumeroLlantas(4);

    }
    //constructor que recibe num de placa

    //shadowing nombres similar pero con diferente funcion
    public  Auto (String placa) throws PlacaInvalidaException {
       // this.placa=placa;
        placa=placa.trim();
        placa=placa.replaceAll(" ","") ;
        if (placa.length()==7 || placa.length()==8){  // operadores de corto circuito || && o &
            this.placa=placa;

        }
        else
        {
            throw new PlacaInvalidaException("Invalida");
        }

    }
    public void lavarVehiculo (){
        System.out.println("Entrando al car wash");
    }


    //getter
    public String  getPlaca(){
        return placa;

    }
    public void  setPlaca (String placa){
        this.placa=placa;
    }



}
