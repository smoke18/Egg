package main;

import Clases.Cafetera;
import Fuciones.ServiciosCafe;


public class E26 {

    public static void main(String[] args) {
        
        Cafetera c1 = new Cafetera();
        
        ServiciosCafe fun = new ServiciosCafe();
        
        fun.MostrarOpciones(c1);
    }

}
