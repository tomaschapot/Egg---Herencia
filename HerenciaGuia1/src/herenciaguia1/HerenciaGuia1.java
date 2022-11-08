/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaguia1;

import Entity.Animal;
import Entity.Gato;
import Entity.Perro;
import java.util.ArrayList;

/**
 *
 * @author tomic
 */
public class HerenciaGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Animal> lista = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Gato();
        Animal c = new Perro();
        
        lista.add(a);
        lista.add(b);
        lista.add(c);
        
        for(Animal aux : lista){
            
            aux.hacerRuido();
        }
                
        
    }
    
}
