package com.generation.animales;

public  class Ave extends Animal {

 private int alas ;
 private int patas;
 private boolean vuela;


 public Ave(String nombre){
     super(nombre);
     System.out.println("constructor hijo " + nombre);
 }
 public Ave(String nombre, int edad){
     super(nombre,edad);

 }
 public void hacernido(){
     System.out.println("iniciando hacar mi nido");
 }
 public void empollar(){
     System.out.println("estoy poniendo huevo");
 }

 @Override
    public void comer(){
     System.out.println("comiendo alpiste");
 }

    @Override
    public void respirar() {
        System.out.println("Respirano por el pico");
    }

}
