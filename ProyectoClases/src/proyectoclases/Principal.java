/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoclases;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Principal {
    static Scanner entrada=  new Scanner(System.in);
    final static int num=4; //numero de aeropuertos
    static Aeropuerto aeropuertos[]=new Aeropuerto[num];
    public static void main(String[] args){
        insertarDatosAeropuerto(aeropuertos);
        menu();
    }
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
        aero[0]=new AeropuertoPublico(8000000,"Jorge Chavez","Lima","Peru");
        aero[0].insertarCompañia(new Compañia("AeroPeru"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20","Lima","Mexico",150.90,150));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21","Lima","Buenos Aires",180.99,120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo ("FC12","Lima","Londres",500.90,180));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro","20BGHP","Peruana"));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria","PJKL20","Mexicana"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul","JH21k1","Peruana"));
        
        aero[1] = new AeropuertoPrivado("Central Ciudad Real","Ciudad Real","España");
        aero[1].insertarCompañia(new Compañia("AirEuropa"));
        String empresas[] ={"Cobreso1","Anguila34"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("AE025","Madrid","Bienos Aires",3323.43,120));
        aero[1].getCompañia("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("fkkdf","jcsjsd", "Colombiano"));
        
        
        
        
        
        
        
        
        
        
    }
    public static void menu(){
        int opcion;
        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ver Aeropuertos gestionadas(publicas o privadas)");
            System.out.println("2. Ver empresas(Privado) o subvencion(Publico)");
            System.out.println("3. Lista compañias de un Aeropuerto");
            System.out.println("4. Lista de vueltos por compañia");
            System.out.println("5. Listar posibles vuelos de origen a destino");
            System.out.println("6. Salir");
            System.out.println("Opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: //Ver Aeropuertos gestionados (Publicos o Privados)
                    System.out.println("");
                    mostrarDatosAeropuertos(aeropuertos );
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default: System.out.println("Error, se equivoco de opcion de menu");
                
                    
            }
            System.out.println("");
            
            
        } while (opcion !=6);
        
    }
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
                
                
            }
            else{
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
                
            }
            System.out.println("");
            
        }
        
    }
}
