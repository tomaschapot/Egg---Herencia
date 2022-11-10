package Entity;

public abstract class FiguraGeometrica {
    
    protected Double area;
    protected Double perimetro;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(Double area, Double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }
    
   

}
