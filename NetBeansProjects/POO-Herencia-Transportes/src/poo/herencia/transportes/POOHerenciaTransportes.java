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
public class POOHerenciaTransportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /**
      * Instanciamos un autobús y un taxi
      */
        Autobus expresoTec = new Autobus("TEC21","Semana i",40,2);
        Taxi taxiSeguro= new Taxi("13C21","Semestre i", 4,"RayoEmprendedor"); 
        
        System.out.println("Esta es la informaión del Autobús");
        System.out.println("Modelo: "+expresoTec.getModelo());
        System.out.println("Placa; "+expresoTec.getPlaca());
        System.out.println("Pasajeros:"+expresoTec.getPasajeros());
        System.out.println("Ruta:"+expresoTec.getRuta());
        System.out.println();
        
        System.out.println("Esta es la informaión del Taxi");
        System.out.println("Modelo: "+taxiSeguro.getModelo());
        System.out.println("Placa; "+taxiSeguro.getPlaca());
        System.out.println("Pasajeros:"+taxiSeguro.getPasajeros());
        System.out.println("Sitio:"+taxiSeguro.getSitio());
        System.out.println();
        
        Vehiculo gene1215 = new Vehiculo ("Tec21", "Borrego", 4);
        System.out.println("Esta es la información del Vehículo");
        System.out.println("Modelo: "+gene1215.getModelo());
        System.out.println("Placa; "+gene1215.getPlaca());
        System.out.println("Pasajeros:"+gene1215.getPasajeros());
        
    }
}
