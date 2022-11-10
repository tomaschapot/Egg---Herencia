package services;

import entity.Barco;
import entity.BarcoMotor;

public class BarcoMotorService extends BarcoService {

    public BarcoMotorService() {
    }

    @Override
    protected Integer generarModulo(Barco barco) {

        BarcoMotor bM = (BarcoMotor) barco;

        return super.generarModulo(bM) + bM.getPotenciaCv();
    }

    @Override
    public Barco cargarDatos(Barco barco) {

        BarcoMotor bM = (BarcoMotor) barco;

        super.cargarDatos(bM);

        System.out.println("Ingrese la potencia en Cv");
        bM.setPotenciaCv(read.nextInt());

        return bM;
    }

}
