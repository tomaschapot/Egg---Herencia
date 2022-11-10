package Entity;

import Interfaces.CalculoFormas;

public class Circulo extends FiguraGeometrica implements CalculoFormas {

    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
        this.diametro = radio * 2;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void calcularArea() {
        this.area = Math.pow(CalculoFormas.PI * this.radio, 2);
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = CalculoFormas.PI * this.diametro;
    }

}
