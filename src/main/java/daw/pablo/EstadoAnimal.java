/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw.pablo;

/**
 *
 * @author pablo
 */
public enum EstadoAnimal {
    //Los enum tiene Constructores privados
    
    //Codigos 
    //sirve como constructores, separados por comas
    DESPIERTO(1,"Despierto"),
    JUGANDO(2, "Jugando"),
    COMIENDO(3,"Comiendo"),
    DURMIENDO(4,"Durmiendo")
    ;
    
    
    
    private int codigoEstado;
    private String estado;
    //Constructor privado

    private EstadoAnimal(int codigoEstado, String estado) {

        this.codigoEstado = codigoEstado;
        this.estado= estado;
                    
                    
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public String getEstado() {
        return estado;
    }
    
    
    

}
