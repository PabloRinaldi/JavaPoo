 
package com.gm.mundopc;
/**
 * Esta clase permite instanciar objetos de tipo Computadora
 * @author Pablo Rinaldi
 * @version 1.0
 */

public class Computadora {
    
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int cantidadComputadoras;

     /**
     * Constructor vacio de la clase
     */
    
    private Computadora() {
        cantidadComputadoras++;
        idComputadora=cantidadComputadoras;
    }
    
     /**
     * Constructor de la clase con 4 parametros
     * @param nombre 
     * @param monitor 
     * @param teclado 
     * @param raton 
     */

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        cantidadComputadoras++;
        idComputadora=cantidadComputadoras;
    }
    
    /**
     *Metodo para obtener el contenido de la variable idComputadora
     *@return  int idComputadora
     */
    public int getIdComputadora() {
        return idComputadora;
    }
 /**
     *Metodo para Asignarle contenido de la variable idComputadora
     * @param idComputadora
     */
    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }
     /**
     *Metodo para obtener el contenido de la variable nombre
     *@return  String nombre
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     *Metodo para Asignarle contenido de la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Metodo para obtener el contenido de la variable monitor
     *@return  Monitor monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     *Metodo para Asignarle contenido de la variable monitor
     * @param monitor
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

     /**
     *Metodo para obtener el contenido de la variable teclado
     *@return  Teclado teclado
     */
    public Teclado getTeclado() {
        return teclado;
    }

    /**
     *Metodo para Asignarle contenido de la variable teclado
     * @param teclado
     */
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

     /**
     *Metodo para obtener el contenido de la variable raton
     *@return  Raton raton
     */
    public Raton getRaton() {
        return raton;
    }
/**
     *Metodo para Asignarle contenido de la variable raton
     * @param raton
     */
    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    /**
 * Este metodo muestra el estado del objeto.
 * se sobreescribe y es heredado de la clase object
 * @return STRING 
 */

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
    
}
