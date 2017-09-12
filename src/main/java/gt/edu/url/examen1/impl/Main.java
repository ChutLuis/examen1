package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Chudnovsky;
import gt.edu.url.examen1.api.ChudnovskyTry;


/**
 *
 * @author tuxtor
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Examen 2");
        int k =13;

        final String outputFormat = "%." + ( k - 1 ) + "f";

        double result = new ChudnovskyTry( ).calcularPi( k );

        result = 1 / new ChudnovskyTry( ).calcularPi( k );

        System.out.println( "result = " + String.format( outputFormat, result ) );
       
    }
    
}
