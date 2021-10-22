package com.generation.animales;

public abstract  class Animal {
    //modificador de acceso protected
   protected String nombre;
   protected int edad;

   //constructor1
   public Animal( String nombre){
       this.nombre = nombre;
       System.out.println("constructor padre");
   }
   //constructor2
   public Animal(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
   }
   //metodos get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodos void
   public void comunicarse(){

       System.out.println("hola");
   }
   public void comer(){
       System.out.println("estoy comiendo");
   }
   //METODO ABSTRACTO
    //se agrrega la alabra abstarcta a la clase principal
    //se forza que todas las clases deben respirar
    public abstract void respirar();
}
