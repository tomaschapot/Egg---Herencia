package entity;

public class Yate extends BarcoMotor {

    private Integer numeroDeCamarotes;

    public Yate() {
    }

    public Yate(Integer numeroDeCamarotes, Integer potenciaCv,
            String matricula, Integer eslora, Integer anioFabricacion) {
        super(potenciaCv, matricula, eslora, anioFabricacion);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public Integer getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(Integer numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "matricula=" + matricula + ", eslora=" + eslora
                + ", anioFabricacion=" + anioFabricacion + "potenciaCv="
                + potenciaCv + "numeroDeCamarotes=" + numeroDeCamarotes + '}';
    }

}
