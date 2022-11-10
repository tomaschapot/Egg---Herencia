package herenciaej3;

import Entity.Circulo;
import Entity.Rectangulo;

public class HerenciaEj3 {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(5.0);
        Circulo c2 = new Circulo(20.0);
        Rectangulo r1 = new Rectangulo(20.5, 26.0);
        Rectangulo r2 = new Rectangulo(5.0, 7.2);

        c1.calcularArea();
        c1.calcularPerimetro();
        c2.calcularArea();
        c2.calcularPerimetro();
        r1.calcularArea();
        r1.calcularPerimetro();
        r2.calcularArea();
        r2.calcularPerimetro();
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);

    }

}
