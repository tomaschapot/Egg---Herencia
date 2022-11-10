package services;

import entity.Barco;
import entity.BarcoMotor;
import entity.Velero;
import entity.Yate;
import java.time.LocalDate;
import java.util.Scanner;

public class BarcoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public BarcoService() {
    }

    public Barco crearBarco() {

        String tipoDeBarco;
        Barco barco;

        //Chequeo que este bien pasado el parametro
        do {

            System.out.println("Que tipo de barco quiere alquilar?");
            tipoDeBarco = read.next().toLowerCase();

        } while (!tipoDeBarco.equalsIgnoreCase("velero")
                && !tipoDeBarco.equalsIgnoreCase("barco a motor")
                && !tipoDeBarco.equalsIgnoreCase("yate"));

        switch (tipoDeBarco) {

            case ("velero"):
                barco = new Velero();
                break;
            case ("barco a motor"):
                barco = new BarcoMotor();
                break;
            case ("yate"):
                barco = new Yate();
                break;
            default:
                barco = new Velero();
        }

        return barco;

    }

    public Barco cargarDatos(Barco barco) {
        
        
        System.out.println("Ingrese la matricula");
        barco.setMatricula(read.next());

        System.out.println("Ingrese el anio de fabricacion");
        barco.setAnioFabricacion(read.nextInt());

        System.out.println("Ingrese la eslora");
        barco.setEslora(read.nextInt());
        
        return barco;

    }

    protected Integer generarModulo(Barco barco) {

        return barco.getEslora() * 10;

    }

}
