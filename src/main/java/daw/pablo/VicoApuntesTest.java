/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.pablo;

/**
 *
 * @author pablo
 */
public class VicoApuntesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pilla el objeto 
        EstadoAnimal estadoPerro = EstadoAnimal.COMIENDO;
               

        
        System.out.println("El estado del perro con el codigo es"+estadoPerro.getCodigoEstado());
        
        System.out.println("Estado del perro en la descripcion"+estadoPerro.getEstado());
    }
    
}
