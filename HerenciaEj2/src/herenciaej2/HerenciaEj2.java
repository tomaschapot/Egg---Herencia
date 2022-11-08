package herenciaej2;

import entity.Electrodomestico;
import entity.Lavadora;
import entity.Televisor;
import java.util.ArrayList;

public class HerenciaEj2 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        Integer preciosLavadoras = 0;
        Integer preciosTelevisores = 0;
        Integer precioElectrodomesticos = 0;

//        Electrodomestico electrodomestico1 = new Electrodomestico();
//
//        electrodomestico1.crearElectrodomestico();
//        electrodomestico1.precioFinal();
//
//        System.out.println(electrodomestico1);
//
//        Lavadora lavadora1 = new Lavadora();
//
//        lavadora1.crearLavadora();
//        lavadora1.precioFinal();
//
//        System.out.println(lavadora1);
//
//        Televisor televisor1 = new Televisor();
//
//        televisor1.crearTelevisor();
//        televisor1.precioFinal();
//
//        System.out.println(televisor1);
        Lavadora l1 = new Lavadora(200, "Blanco", "B", 50);
        Lavadora l2 = new Lavadora(400, "Blanco", "F", 500);
        Lavadora l3 = new Lavadora(150, "Blanco", "D", 300);
        Televisor t1 = new Televisor(50, true, "Azul", "D", 400);
        Televisor t2 = new Televisor(30, false, "Rojo", "E", 200);

        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(l3);
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);

        for (Electrodomestico aux : electrodomesticos) {

            System.out.println(aux);
            aux.precioFinal();

            if (aux.getClass().isInstance(l1)) {

                preciosLavadoras = preciosLavadoras + aux.getPrecio();

            } else if (aux.getClass().isInstance(t2)) {

                preciosTelevisores = preciosTelevisores + aux.getPrecio();
            }
            
            precioElectrodomesticos = preciosTelevisores + preciosLavadoras;

        }

        System.out.println("El precio de las lavadoras es de: " + preciosLavadoras);
        System.out.println("El precio de los televisores es de: " + preciosTelevisores);
        System.out.println("El precio de todos los electrodomesticos es de: " 
                + precioElectrodomesticos);

    }

}
