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
public class Taxi extends Vehiculo {
    private final String sitio;
    /**
     * 
     * @param placa
     * @param modelo
     * @param pasajeros
     * @param sitio 
     */
    public Taxi(String placa, String modelo, int pasajeros, String sitio) {
        super(placa, modelo, pasajeros);
        this.sitio=sitio;
    }
    /**
     * Método que devuelve el sitio del Taxi
     * @return regresa el sitio del taxi en formato String
     */
    public String getSitio(){
        return this.sitio;
    }
    
}
