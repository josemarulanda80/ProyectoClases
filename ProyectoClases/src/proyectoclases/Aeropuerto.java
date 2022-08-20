/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoclases;

/**
 *
 * @author josem
 */
public class Aeropuerto {
    private String nombre,ciudad,pais;
    private Compañia listaCompañias[]=new Compañia[10];
    private int numCompañia;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañia =0;
    }
    public Aeropuerto(String nombre, String ciudad, String pais,Compañia c[] ) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompañias=c;
        this.numCompañia =0;
    } 
    
    public void insertarCompañia(Compañia compañia){
        listaCompañias[numCompañia]=compañia;
        numCompañia++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaCompañias() {
        return listaCompañias;
    }

    public int getNumCompañia() {
        return numCompañia;
    }
    
    public Compañia getCompañia(int i){
        return listaCompañias[i];
    }
    public Compañia getCompañia(String nombre){
        boolean encontrado =false;
        int i=0;
        Compañia c=null;
        while((!encontrado)&&(i<listaCompañias.length)){
            if (nombre.equals(listaCompañias[i].getNombre())) {
                encontrado=true;
                c=listaCompañias[i];
                
                
            }
            i++;
            
        }
        return c;
    }
    
    
}
