package entity;

public class BarcoMotor extends Barco {

    protected Integer potenciaCv;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaCv, String matricula, Integer eslora,
            Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public Integer getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Integer potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public String toString() {
        return "BarcoMotor" + "matricula=" + matricula + ", eslora=" + eslora
                + ", anioFabricacion=" + anioFabricacion + "potenciaCv="
                + potenciaCv + '}';
    }

}
