package Entity;

import Interfaces.CalculoFormas;

public class Rectangulo extends FiguraGeometrica implements CalculoFormas {

    private double ladoA;
    private double ladoB;

    public Rectangulo() {
    }

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public void calcularArea() {
        this.area = this.ladoA * this.ladoB;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (ladoA * 2) + (ladoB * 2);
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "Lado A: " + ladoA + "Lado B:" + ladoB
                + "area=" + area + ", perimetro=" + perimetro + '}';
    }

}
