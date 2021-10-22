package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------------Ave---------------------------------");
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

    }
}
