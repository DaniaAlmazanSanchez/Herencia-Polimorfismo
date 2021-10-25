package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.Uber.UberDriver;
import com.generation.Uber.ConductorUberBlack;

public class Main {

    public static void main(String[] args) {

       /* System.out.println("--------------Ave---------------------------------");
        Ave ave = new Ave(" colorin ");
        ave.comer();
        ave.comunicarse();
        ave.empollar();
        ave.hacernido();
        System.out.println("---------------Ave2------------------------------");
        Ave ave2 = new Ave("guaww",4);
        System.out.println(ave2.getNombre());

        System.out.println("--------------Perro-----------------------------");
        Perro lomito = new Perro(" chikitin ");
        lomito.jugar();
        lomito.ladrar();
        lomito.comer();


        //Animal animal = new Animal();
         */
        UberDriver driver = new UberDriver();

        System.out.println("Uber manejando");
        System.out.println(driver.calculatePrice(6));

        System.out.println("-----------------------------------------");
        ConductorUberBlack driverNegro = new ConductorUberBlack();

        System.out.println("Uber negro manejando");
        System.out.println(driverNegro.calculatePrice(8));
        driverNegro.setMinimum(10);
    }
}
