/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej1;

import entity.Animal;
import entity.Caballo;
import entity.Gato;
import entity.Perro;

/**
 *
 * @author tomic
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "Carnivoro", "Doberman", 15);
        perro1.tipoDeAlimento();
        
        Animal perro2 = new Perro("Teddy","Croquetas","Chihauhua",10);
        perro2.tipoDeAlimento();
        
        Animal gato1 = new Gato("Pelusa","Galletas","Siames",15);
        gato1.tipoDeAlimento();
        
        Animal caballo1 = new Caballo("Spark","Pasto","Fino",25);
        caballo1.tipoDeAlimento();

    }
    
}
