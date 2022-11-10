package entity;

public class Velero extends Barco {

    private Integer numeroMastiles;

    public Velero() {
    }

    public Velero(Integer numeroMastiles, String matricula, Integer eslora,
            Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora
                + ", anioFabricacion=" + anioFabricacion + "Velero{"
                + "numeroMastiles=" + numeroMastiles + '}';
    }

}
