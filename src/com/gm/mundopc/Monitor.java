
package com.gm.mundopc;
/**
 * Esta clase permite instanciar objetos de tipo Monitor
 *
 * @author Strel0k
 * @version 1.0
 */

public class Monitor {
    
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

     /**
     * Constructor vacio de la clase
     */
    
    private Monitor() {
        contadorMonitores++;
        idMonitor=contadorMonitores;
    }

    /**
     * Constructor de la clase con 2 parametros
     * @param marca heredado de la clase DispositivoEntrada
     * @param tamanio heredado de la clase DispositivoEntrada
     */
    
    public Monitor(String marca, double tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
        contadorMonitores++;
        idMonitor=contadorMonitores;
    }

     /**
     *Metodo para obtener el contenido de la variable idMonitor
     *@return  String idMonitor
     */
    public int getIdMonitor() {
        return idMonitor;
    }
    /**
     *Metodo para Asignarle contenido de la variable idMonitor
     * @param idMonitor
     */

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }
    /**
     *Metodo para obtener el contenido de la variable marca
     *@return  String marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     *Metodo para Asignarle contenido de la variable marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     *Metodo para obtener el contenido de la variable tamanio
     *@return  String tamanio
     */
    public double getTamanio() {
        return tamanio;
    }
    /**
     *Metodo para Asignarle contenido de la variable tamanio
     * @param tamanio
     */
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
     /**
     *Metodo para obtener el contenido de la variable contadorMonitores
     *@return  int contadorMonitores
     */
    public static int getContadorMonitores() {
        return contadorMonitores;
    }
    
     /**
     *Metodo para Asignarle contenido de la variable contadorMonitores
     * @param contadorMonitores
     */

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }

    
 /**
 * Este metodo muestra el estado del objeto.
 * se sobreescribe y es heredado de la clase object
 * @return STRING 
 */
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio;
    }
    
    
}
