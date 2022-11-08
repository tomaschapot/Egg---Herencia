/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author tomic
 */
public class Gato extends Animal {
    
    public Gato(){
        
    };
    
    public Gato(String nombre,Integer edad){
        super(nombre, edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }
    
}
