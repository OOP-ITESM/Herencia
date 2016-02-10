/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.transportes;

/**
 *
 * @author Aquelarre
 */
public class Autobus extends Vehiculo{
    //Atributos
    private final int ruta;
    //Métodos
    /**
     * 
     * @param placa
     * @param modelo
     * @param pasajeros
     * @param ruta 
     */
    public Autobus(String placa, String modelo, int pasajeros, int ruta) {
        super(placa, modelo, pasajeros); // super invoca al constructor de la clase padre
        this.ruta=ruta;
    }
    /**
     * Método que devuelve la ruta del autobús
     * @return Devuelve el número de ruta del autobús en formato int
     */
    public int getRuta(){
        return this.ruta;
    }
}
