/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author tomic
 */
public class Perro extends Animal {

    public Perro(String nombre, String alimento, String raza, Integer edad) {

        super(nombre, alimento, raza, edad);
    }

    @Override
    public void tipoDeAlimento() {

        System.out.println("El perro se alimenta con " + alimento);
    }

}
