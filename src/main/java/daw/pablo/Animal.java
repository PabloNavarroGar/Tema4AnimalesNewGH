/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.pablo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author samue
 */
public class Animal {

    //Atributos
    private LocalDate fechaHoy = LocalDate.now();

    private String nombre;
    private String tipoAnimal;// "gato", "perro", "lagarto", "cobaya", "periquito"
    private double peso;
    private EstadoAnimal estado; //"comiendo", "durmiendo", "despierto/reposo" o "jugando".

    //Pasar fechas a String 
    private DateTimeFormatter formatofechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //String que llevara el constructor
    private String fechaNacimiento = fechaHoy.format(formatofechas);

    public Animal() {
    }

    public Animal(String nombre, String tipoAnimal, double peso, EstadoAnimal estado, String fecha) {
        this.nombre = nombre;
        //Ternario para filtrar
        this.tipoAnimal = tipoAnimal.equalsIgnoreCase("perro") ||
                tipoAnimal.equalsIgnoreCase("gato") ||
                tipoAnimal.equalsIgnoreCase("lagarto")? tipoAnimal  :null;
        this.peso = peso;
        this.estado = EstadoAnimal;
        this.fechaNacimiento = fecha;
    }

    public LocalDate getFechaHoy() {
        return fechaHoy;
    }

    public void setFechaHoy(LocalDate fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public DateTimeFormatter getFormatofechas() {
        return formatofechas;
    }

    public void setFormatofechas(DateTimeFormatter formatofechas) {
        this.formatofechas = formatofechas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Animal{"
                + "  nombre=" + nombre
                + "\n, tipoAnimal=" + tipoAnimal
                + "\n, peso=" + peso
                + "\n, estado=" + estado
                + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    public void comer(Animal pet, double cantidadGramos) {
        //Se suma en el peso, la cantidad que su peso+ mas la cantida de comida que recibira
        //No admite negativo
        cantidadGramos = Math.abs(cantidadGramos);
        this.peso += cantidadGramos;

    }

    public void dormir() {

        this.estado = EstadoAnimal.DURMIENDO;
    }

    public void despertar() {

        this.estado = "Despierta!!!!";
    }

    public void descansar() {

        this.estado = "a descansar";

    }

    public void jugar(Animal pet, int cantidadMinutos) {

        cantidadMinutos = Math.abs(cantidadMinutos);

        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException();//expecion
        } else {
           
            this.estado ="esta jugando!!!";
            if (cantidadMinutos >= Math.abs(30)) {
                this.peso -= 20;

            } else if (cantidadMinutos < Math.abs(60)) {
                this.peso -= 40;

            } else if (cantidadMinutos < Math.abs(90)) {

                this.peso -= 60;

            } else if (cantidadMinutos < Math.abs(120)) {
                this.peso -= 80;

            } else if (cantidadMinutos < Math.abs(150)) {
                this.peso -= 100;

            } else if (cantidadMinutos < Math.abs(180)){
                
                this.peso -= 120;
            }
        }

    }

    public static Animal clonar(Animal pet) {
        //Metodo para copiar datos
        Animal aux = new Animal();
        if (pet != null) {
            aux = new Animal(pet.nombre, pet.tipoAnimal, pet.peso, pet.estado, pet.fechaNacimiento);
        } else {
            throw new NullPointerException("Datos en nulo,no se puede copiar");
        }
        return aux;
    }
    
    
    //Metodo de copiar pero con un contructor, no lo puede asim la otra forma es la correcta pero para repasar
//    public static Animal clonar(Animal pet) {
//        Animal copiarAnimal = new Animal();
//        try {
//
//            copiarAnimal = pet;
//        } catch (NullPointerException npe) {
//            System.out.println("Dato en nulo,esta vacio");
//
//        }
//
//        return copiarAnimal;
//    }
//    public Animal(Animal origen) {
//        this.nombre = origen.nombre;
//        this.tipoAnimal = origen.tipoAnimal;
//        this.peso = origen.peso;
//        this.estado = origen.estado;
//        this.fechaNacimiento = origen.fechaNacimiento;
//    }
}
