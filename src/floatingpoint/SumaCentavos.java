package floatingpoint;

import java.math.BigDecimal;

public class SumaCentavos {

    public static void main(String[] args) {
// forma correcta
        BigDecimal unCentavoBigDecimal= new BigDecimal("0.01");
        BigDecimal sumaBigDecimal=unCentavoBigDecimal.add(unCentavoBigDecimal).add(unCentavoBigDecimal).add(unCentavoBigDecimal).add(unCentavoBigDecimal).add(unCentavoBigDecimal);
        System.out.println( sumaBigDecimal);

//  Forma incorrecta  Observa los decimales
        double centavo=0.01;
        double  suma=centavo+centavo+centavo+centavo+centavo+centavo;
        System.out.println(suma);
    }


}
