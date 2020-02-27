package com.gm.mundopc;

/**
 * Esta clase permite instanciar objetos de tipo Raton
 * Hereda de DispositivoEntrada
 * @author Pablo Rinaldi
 * @version 1.0
 */
public class Raton extends DispositivoEntrada {

    /**
     * Variable Id del raton
     */
    private int idRaton;
    /**
     * Variable estatica para contar la cantidad de raton
     */
    private static int contadorRatones;

    /**
     * Constructor de la clase con 2 parametros
     *
     * @param tipoEntrada heredado de la clase DispositivoEntrada
     * @param marca heredado de la clase DispositivoEntrada
     */
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        /**
         * Por cada objeto del tipo raton que se instancie se suma 1 al contador
         */
        contadorRatones++;
        /**
         * Por objeto que se instancie el idRaton toma el valor de
         * contadorRatones
         */
        idRaton = contadorRatones;
    }

    /**
     * Este metodo muestra el estado del objeto. se sobreescribe y es heredado
     * de la clase object
     *
     * @return STRING
     */

    @Override
    public String toString() {
        return super.toString() + " Raton{" + "idRaton=" + idRaton;
    }

}
