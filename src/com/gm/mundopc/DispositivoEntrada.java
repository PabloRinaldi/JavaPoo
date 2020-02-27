
package com.gm.mundopc;

/**
 * Esta es la clase padre de Teclado y Raton
 * @author Pablo Rinaldi
 * @version 1.0
 */
public abstract class DispositivoEntrada {
       /**
     * Variable tipoEntrada
     */
    private String tipoEntrada;
    /**
     * Variable marca
     */
    private String marca;
    

     /**
     * Constructor de la clase con 2 parametros
     * @param tipoEntrada 
     * @param marca 
     */

    
    public DispositivoEntrada(String tipoEntrada, String marca){
      /**
     *Se igualan las variables locales con las variables de clase
     */
        this.marca=marca;
        this.tipoEntrada=tipoEntrada;
                
    }
     /**
     *Metodo para obtener el contenido de la variable tipoEntrada
     *@return  String tipoEntrada
     */

    public String getTipoEntrada() {
        return tipoEntrada;
    }
    
     /**
     *Metodo para Asignarle contenido de la variable tipoEntrada
     * @param tipoEntrada
     */

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
     /**
     *Metodo para obtener el contenido de la variable marca
     *@return  String getMarca
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
 * Este metodo muestra el estado del objeto.
 * se sobreescribe y es heredado de la clase object
 * @return STRING 
 */
    
    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
    
}
