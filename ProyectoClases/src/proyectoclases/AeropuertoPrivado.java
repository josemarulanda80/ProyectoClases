/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoclases;

/**
 *
 * @author josem
 */
public class AeropuertoPrivado extends Aeropuerto{
    private String listaEmpresas[]=new String[10];
    private int numEmpresa;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c,String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas=e;
        numEmpresa=e.length;
    }
    public void insertarEmpresas(String e[]){
        this.listaEmpresas=e;
        this.numEmpresa=e.length;
    }
    public void insertarEmpresas(String e){
        this.listaEmpresas[numEmpresa]=e;
        numEmpresa++;
      
    }    

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
    
}
