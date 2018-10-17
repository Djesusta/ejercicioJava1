package operadorTernario;

public class TestTernario {

    public static void main(String[] args) {
  ValidarAcceso(18,25,53,12,15,16);

    }

    private static void ValidarAcceso(int... valor) {

        for (int i :valor){
            if (i>=18){

                System.out.println("Acceso permitido");

            }
            else
                System.out.println("Acceso denegado");

        }


    }


}
