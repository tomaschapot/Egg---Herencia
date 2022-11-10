package services;

import entity.Barco;
import entity.Velero;

public class VeleroService extends BarcoService {

    public VeleroService() {
    }

    @Override
    public Integer generarModulo(Barco barco) {

        Velero v1 = (Velero) barco;

        Integer suma = super.generarModulo(v1) + v1.getNumeroMastiles();
        return suma;
    }

    @Override
    public Barco cargarDatos(Barco barco) {
        Velero v1 = (Velero) barco;

        super.cargarDatos(barco);

        System.out.println("Ingrese la cantidad de mastiles");
        v1.setNumeroMastiles(read.nextInt());

        return v1;

    }

}
