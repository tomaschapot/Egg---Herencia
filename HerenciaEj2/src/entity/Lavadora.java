package entity;

public class Lavadora extends Electrodomestico {

    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, String color, String consumo, Integer peso) {
        super(color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {

        crearElectrodomestico();

        System.out.println("Ingrese la carga");
        this.carga = read.nextInt();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (this.carga > 30) {
            this.precio = this.precio + 500;
        }

    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "color=" + color + ", consumo=" + consumo 
                + ", peso=" + peso  + "Carga =" + carga + ", precio=" + precio;
    }
    
    

}
