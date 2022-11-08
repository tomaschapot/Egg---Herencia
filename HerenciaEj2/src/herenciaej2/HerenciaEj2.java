package herenciaej2;

import entity.Electrodomestico;
import entity.Lavadora;
import entity.Televisor;

public class HerenciaEj2 {

    public static void main(String[] args) {

        Electrodomestico electrodomestico1 = new Electrodomestico();

        electrodomestico1.crearElectrodomestico();
        electrodomestico1.precioFinal();

        System.out.println(electrodomestico1);

        Lavadora lavadora1 = new Lavadora();

        lavadora1.crearLavadora();
        lavadora1.precioFinal();

        System.out.println(lavadora1);

        Televisor televisor1 = new Televisor();

        televisor1.crearTelevisor();
        televisor1.precioFinal();

        System.out.println(televisor1);

    }

}
