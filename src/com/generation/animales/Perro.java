package com.generation.animales;


public class Perro extends Animal implements Mascota, Mamiferos {

    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre) {
        super(nombre);
        System.out.println("constructor hijo" + nombre);
    }

    public void jugar() {
        System.out.println("me gusta jugar");

    }

    @Override
    public void dormir() {
        System.out.println("durmiendo");
    }

    public void ladrar() {
        System.out.println("ladro mucho");
    }
    //metodo sobrescribe la clase padre polimorfismo cambiar comportamiento

    @Override
    public void comer() {
        System.out.println("comindo croquetas");
    }

    @Override
    public void respirar() {
        System.out.println("respirando por la nariz");
    }
    @Override
    public void hablar(){
        System.out.println("hola");
    }

    @Override
    public void gestacion() {
        System.out.println("2 meses");
    }
    @Override
    public void ingestarLeche(){
        System.out.println("Etoy tomando leche");
    }
    @Override
    public void movilidad(){
        System.out.println("caminando en 4 patas ");
    }
}
