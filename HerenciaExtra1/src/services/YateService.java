package services;

import entity.Barco;
import entity.Yate;

public class YateService extends BarcoMotorService {

    public YateService() {
    }

    @Override
    public Barco cargarDatos(Barco barco) {
        
        Yate y1 = (Yate) barco;
        
        super.cargarDatos(y1);
        
        System.out.println("Ingrese la cantidad de camarotes");
        y1.setNumeroDeCamarotes(read.nextInt());
        
        return y1; 
    }

    @Override
    protected Integer generarModulo(Barco barco) {

        Yate y1 = (Yate) barco;

        return super.generarModulo(y1) + y1.getNumeroDeCamarotes();
    }

}
