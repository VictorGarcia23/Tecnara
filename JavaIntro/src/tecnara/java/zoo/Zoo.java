/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.zoo;

import tecnara.java.zoo.animales.Animal;
import tecnara.java.zoo.animales.ifaces.INadable;

/**
 *
 * @author marco
 */
public class Zoo {
    public static Acuario acuario;
    public static void performShow(Animal animal){
        System.out.println(animal.show());
    }
}

