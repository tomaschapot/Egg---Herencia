package herenciaextra1;

import entity.Alquiler;
import services.AlquilerService;

public class HerenciaExtra1 {

    public static void main(String[] args) {

        AlquilerService aS = new AlquilerService();

        Alquiler a1 = aS.crearAlquiler();

        System.out.println(a1);

    }
}
