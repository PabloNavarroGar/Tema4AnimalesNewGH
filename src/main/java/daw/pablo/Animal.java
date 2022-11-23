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
    private String estado; //"comiendo", "durmiendo", "despierto/reposo" o "jugando".

//FORMATEAR LAS FECHAS 
    //dd dias con dos numeritos
    //mm mes con 2  numeritos
    //yyyy año
    private DateTimeFormatter formatofechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String fechaNacimiento = fechaHoy.format(formatofechas);

    public Animal() {
    }

    public Animal(String nombre, String tipoAnimal, double peso, String estado, String fecha) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.peso = peso;
        this.estado = estado;
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

    public static void comer(Animal pet, double cantidadGramos) {
        //Se suma en el peso, la cantidad que su peso+ mas la cantida de comida que recibira
        //No admite negativo
        cantidadGramos = Math.abs(cantidadGramos);
        pet.setPeso(pet.getPeso() + cantidadGramos);

    }

    public static void dormir(Animal pet) {

        pet.setEstado("dormir");
    }

    public static void despertar(Animal pet) {

        pet.setEstado("despierto");
    }

    public static void descansar(Animal pet) {

        pet.setEstado("reposo");

    }

    public static void jugar(Animal pet, int cantidadMinutos) {
        
        try {

            pet.setEstado(pet.getNombre() + ", esta jugando");
            if (cantidadMinutos >= Math.abs(30)) {
                pet.setPeso(pet.getPeso() - 20);

            } else if (cantidadMinutos > Math.abs(60)) {
                pet.setPeso(pet.getPeso() - 40);
            } else if (cantidadMinutos > Math.abs(90)) {

                pet.setPeso(pet.getPeso() - 60);
            } else if (cantidadMinutos > Math.abs(120)) {
                pet.setPeso(pet.getPeso() - 80);
            } else if (cantidadMinutos > Math.abs(150)) {
                pet.setPeso(pet.getPeso() - 100);

            } else if (cantidadMinutos <= Math.abs(180)) {
                pet.setPeso(pet.getPeso() - 120);
            }

        } catch (IllegalArgumentException npe) {
            if (cantidadMinutos > Math.abs(180)) {
                throw new IllegalArgumentException();//expecion
            }
            System.out.println("No puede ser mas de 180 minutos");
        }

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
    public static Animal clonar(Animal pet) {
        Animal aux;
        if (pet != null) {
            aux = new Animal(pet.nombre, pet.tipoAnimal, pet.peso, pet.estado, pet.fechaNacimiento);
        } else {
            throw new NullPointerException("Datos en nulo,no se puede");
        }
        return aux;
    }
}
