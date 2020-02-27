package com.gm.mundopc;

/**
 * Esta clase permite instanciar objetos de tipo Teclado
 *
 * @author Pablo Rinaldi
 * @version 1.0
 */
public class Teclado extends DispositivoEntrada {

    /**
     * Variable Id del teclado
     */
    private int idTeclado;

    /**
     * Variable estatica para contar la cantidad de teclados
     */
    private static int contadorTeclados;

    /**
     * Constructor de la clase con 2 parametros
     *
     * @param tipoEntrada heredado de la clase DispositivoEntrada
     * @param marca heredado de la clase DispositivoEntrada
     */
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        contadorTeclados++;
        idTeclado = contadorTeclados;
    }

    /**
     * Este metodo muestra el estado del objeto. se sobreescribe y es heredado
     * de la clase object
     *
     * @return STRING
     */
    @Override
    public String toString() {
        return super.toString() + " Teclado{" + "idTeclado=" + idTeclado;
    }

}
