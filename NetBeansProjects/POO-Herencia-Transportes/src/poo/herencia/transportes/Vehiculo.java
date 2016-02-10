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
public class Vehiculo {
    //atributos
    protected String placa, modelo;
    protected int pasajeros;
    
    //Métodos
    /**
     * 
     * @param placa Es la placa del vehículo
     * @param modelo Es el modelo del vehículo
     * @param pasajeros Es la cantidad de pasajeros
     */
    
    public Vehiculo(String placa, String modelo, int pasajeros){
        this.placa= placa;
        this.modelo=modelo;
        this.pasajeros=pasajeros;
    }
      /**
     * Método que devuelve la placa del vehículo.
     * @return regresa la placa en formato String.
     */
    public String getPlaca(){
        return this.placa;
    }
  
      /**
     * Método para devolver el modelo del vehículo
     * @return regresa el modelo del vehículo en formato String
     */
    public String getModelo(){
        return this.modelo;
    }
  
     /**
  * Método que devuelve la catidad de pasajeros en le vehículo
  * @return regresa la cantidad de personas en formato entero
  */
  public int getPasajeros(){
      return this.pasajeros;
  }
}
