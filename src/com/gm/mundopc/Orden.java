
package com.gm.mundopc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Esta clase permite instanciar objetos de tipo Orden
 * @author Pablo Rinaldi
 * @version 1.0
 */
public class Orden {
    private int idOrden;
    private  ArrayList <Computadora> computadoras;
    private static int contadorOrden;
    
    

    /**
     * Constructor vacio de la clase
     */
    
    public Orden() {
        contadorOrden++;
        idOrden=contadorOrden;
        
        computadoras=new ArrayList<Computadora> ();
        
    }
     /**
     *Metodo para Agregar Objetos Computadora a la coleccion de objetos
     *@param computadora
     */
     public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }
    
    
    /**
     *Metodo para recorrer el arrayList y mostrarlo
     */
    
    public void mostrarOrden(){
        Iterator<Computadora> it= computadoras.iterator();    
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println("");
        
    }

    
    }
}
