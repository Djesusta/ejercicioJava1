import loops.Loops;
import primeraclase.excepciones.Motocicleta;
import primeraclase.excepciones.PlacaInvalidaException;
import primeraclase.excepciones.Vehiculo;

/*


 */
public class HolaMundo {
    public static void main(String[] args) throws Exception  {
        System.out.println("Hola mundo Cruel!");

        Loops loops = new Loops();
        loops.iterarConFor();

        Auto  auto = new Auto();
        Motocicleta motocicleta= new Motocicleta();
        System.out.println(auto.getPlaca());
        System.out.println("Llantas Auto: "+ auto.getNumeroLlantas());
        System.out.println("Llantas Motocicleta: "+ motocicleta.getNumeroLlantas());
         motocicleta.lavarVehiculo();

        try {
            Auto auto2 = new Auto("U4677667");
            System.out.println(auto2.getPlaca());
            Motocicleta moto2 = new Motocicleta("U4657");
            System.out.println(moto2.getPlaca());
        }
        catch (PlacaInvalidaException e ){
            System.out.println("OCURRIO UN PROBLEMA AL CREAR AUTO: "+ e.getMessage());
            throw e;
        } finally {
            //liberar recursos
        }


    }



}