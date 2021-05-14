package calculator59659;

 /**
  * @author reyapazc
  * @version 1.0
  */

/**
 * Importa el paquete donde se encuentran los métodos para hacer funcionar el programa.
 */

import calculadora59659.Calculadora59659;
 
public class Calculator59659 {
    
    public static void main(String[] args) {
        
        /**
         * Se declaran las operaciones a realizar para el programa.
         */
        
        Calculadora59659 calculadora59659 = new Calculadora59659();
        
        System.out.println("La ejecución del programa al realizar todas las operaciones básicas y aplicar los dos atributos especiales, nos otorga:");

        calculadora59659.suma(3,9,81);
        calculadora59659.resta(3);
        calculadora59659.multiplicacion(9);
        calculadora59659.division(3);
        calculadora59659.delete();
        calculadora59659.answer();
        
    } 
}
