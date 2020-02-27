package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

/**
 * Esta clase main permite instanciar Objetos de las clases (Raton, Teclado,
 * Monitor, Computadora,Orden) Ejecutar los metodos de dichas clases
 *
 * @author Pablo Rinaldi
 * @version 1.0
 */
public class MundoPc {

    public static void main(String[] args) {

        /**
         * Se instancian objetos de la clase Raton
         */
        Raton r1 = new Raton("Usb", "Genius");
        Raton r2 = new Raton("Ps2", "Logitech");
        Raton r3 = new Raton("Usb", "Microsoft");

        /**
         * Se instancian objetos de la clase Teclado
         */
        Teclado t1 = new Teclado("Usb", "Noganet");
        Teclado t2 = new Teclado("Usb", "Steelseries");
        Teclado t3 = new Teclado("Usb", "Razer");

        /**
         * Se instancian objetos de la clase Monitor
         */
        Monitor m1 = new Monitor("LG", 24.7);
        Monitor m2 = new Monitor("SAMSUNG", 28.7);
        Monitor m3 = new Monitor("SONY", 25.7);

        /**
         * Se instancian objetos de la clase Computadora
         */
        Computadora comp1 = new Computadora("pc 1", m1, t1, r1);

        Computadora comp2 = new Computadora("pc 2", m2, t1, r1);

        Computadora comp3 = new Computadora("pc 3", m3, t3, r1);

        /**
         * Se instancian objetos de la clase Orden
         */
        Orden ord1 = new Orden();

        Orden ord2 = new Orden();

        /**
         * Se agregan Computadoras a las ordenes y las guarda en un arrayList
         */
        ord1.agregarComputadora(comp1);
        ord1.agregarComputadora(comp2);
        ord1.agregarComputadora(comp3);

        ord2.agregarComputadora(comp1);
        ord2.agregarComputadora(comp2);
        ord2.agregarComputadora(comp3);

        /**
         * Se muestra la Orden con el metodo mostrarOrden()
         */
        ord1.mostrarOrden();

        System.out.println("----------------------------------------------------");

        /**
         * Se muestra la Orden con el metodo mostrarOrden()
         */
        ord2.mostrarOrden();

    }

}
