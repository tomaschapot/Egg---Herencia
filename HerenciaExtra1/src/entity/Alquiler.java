package entity;

import java.time.LocalDate;

public class Alquiler {

    private String nombre;
    private String dni;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private Integer posicionAmarre;
    private Barco barco;
    private Integer precioFinal;

    public Alquiler() {
    }

    public Alquiler(String nombre, String dni, LocalDate fechaDeAlquiler,
            LocalDate fechaDeDevolucion, Integer posicionAmarre, Barco barco, Integer precioFinal) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.precioFinal = precioFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Integer getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Integer precioFinal) {
        this.precioFinal = precioFinal;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni
                + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion="
                + fechaDeDevolucion + ", posicionAmarre=" + posicionAmarre
                + ", barco=" + barco + ", precioFinal=" + precioFinal + '}';
    }

}
