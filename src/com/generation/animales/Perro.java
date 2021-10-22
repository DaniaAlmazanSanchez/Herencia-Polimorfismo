package com.generation.animales;


public class Perro extends Animal{

    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre){
        super(nombre);
        System.out.println("constructor hijo" + nombre);
    }

    public void jugar(){
        System.out.println("megusta jugar");

    }
    public void ladrar(){
        System.out.println("ladro mucho");
    }
    //metodo sobrescribe la clase padre polimorfismo cambiar comportamiento

    @Override
    public void comer(){
        System.out.println("comindo croquetas");
    }
    @Override
    public void respirar(){
        System.out.println("respirando por la nariz");
    }
}
