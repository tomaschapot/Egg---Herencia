package entity;

import enums.ColorEnum;
import enums.ConsumoEnum;
import java.util.Scanner;

public class Electrodomestico {

    protected String color;
    protected String consumo;
    protected Integer peso;
    protected Integer precio;
    protected Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(String color, String consumo, Integer peso) {
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.precio = 1000;
        
        comprobarConsumoEnergetico(this.consumo);
        comprobarColor(this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    private void comprobarConsumoEnergetico(String Letra) {

        boolean find = false;

        for (ConsumoEnum aux : ConsumoEnum.values()) {
            if (aux.toString().equalsIgnoreCase(Letra)) {
                find = true;
            }
        }

        if (!find) {
            this.consumo = ConsumoEnum.F.toString();
        }

    }

    private void comprobarColor(String color) {
        boolean find = false;

        for (ColorEnum aux : ColorEnum.values()) {

            if (aux.toString().equalsIgnoreCase(color)) {
                find = true;
            }

        }

        if (!find) {
            this.color = ColorEnum.BLANCO.toString();
        }

    }

    public void crearElectrodomestico() {

        System.out.println("Ingrese el color");
        this.setColor(read.next());

        comprobarColor(this.color);

        System.out.println("Ingrese el consumo");
        this.setConsumo(read.next());

        comprobarConsumoEnergetico(this.consumo);

        System.out.println("Ingrese el peso");
        this.setPeso(read.nextInt());

        this.precio = 1000;

    }

    public void precioFinal() {

        switch (this.consumo) {
            case "A":
                this.precio = this.precio + 1000;
                break;
            case "B":
                this.precio = this.precio + 800;
                break;
            case "C":
                this.precio = this.precio + 600;
                break;
            case "D":
                this.precio = this.precio + 500;
                break;
            case "E":
                this.precio = this.precio + 300;
                break;
            case "F":
                this.precio = this.precio + 100;
                break;

        }

        if (peso >= 1 && peso <= 19) {
            this.precio = this.precio + 100;
        } else if (peso >= 20 && peso <= 49) {
            this.precio = this.precio + 500;
        } else if (peso >= 50 && peso <= 79) {
            this.precio = this.precio + 800;
        } else {
            this.precio = this.precio + 1000;
        }

    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "color=" + color + ", consumo=" + consumo
                + ", peso=" + peso + ", precio=" + precio;
    }

}
