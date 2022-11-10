package services;

import entity.Alquiler;
import entity.Barco;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AlquilerService {

    private BarcoService bS = new BarcoService();
    private VeleroService vS = new VeleroService();
    private BarcoMotorService bMS = new BarcoMotorService();
    private YateService yS = new YateService();
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public AlquilerService() {
    }

    public Alquiler crearAlquiler() {

        Integer modulo = 0;
        Barco b1 = bS.crearBarco();
        Alquiler a1 = new Alquiler();
        Integer tiempoDeAlquiler;
        Period diff;

        //Genero el barco y lo cargo
        switch (b1.getClass().getSimpleName().toLowerCase()) {

            case ("velero"):
                vS.cargarDatos(b1);
                modulo = vS.generarModulo(b1);
                break;
            case ("barcomotor"):
                bMS.cargarDatos(b1);
                modulo = bMS.generarModulo(b1);
                break;
            case ("yate"):
                yS.cargarDatos(b1);
                modulo = yS.generarModulo(b1);
                break;
        }

        a1.setBarco(b1);

        System.out.println("Ingrese su nombre");
        a1.setNombre(read.next());

        System.out.println("Ingrese su DNI");
        a1.setDni(read.next());

        System.out.println("Ingrese la fecha de alquiler Y/M/D");
        a1.setFechaDeAlquiler(LocalDate.of(read.nextInt(), read.nextInt(),
                read.nextInt()));

        System.out.println("Ingrese la fecha de devolucion Y/M/D");
        a1.setFechaDeDevolucion(LocalDate.of(read.nextInt(), read.nextInt(),
                read.nextInt()));

        System.out.println("Ingrese la posicion de amarre");

        a1.setPosicionAmarre(read.nextInt());

        //Calculo el tiempo de alquiler, * modulo
        diff = Period.between(a1.getFechaDeAlquiler(), a1.getFechaDeDevolucion());

        tiempoDeAlquiler = diff.getDays() + diff.getMonths() * 30 + diff.getYears() * 365;

        a1.setPrecioFinal(tiempoDeAlquiler * modulo);

        return a1;

    }

}
