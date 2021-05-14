package calculadora59659;


/**
 * @author reyapazc
 * @version 1.0
 */

/**
 * Importar utilidad para mostrar cuadros de dialogo.
 */

import javax.swing.JOptionPane;

public class Calculadora59659 {
    
    /**
     * Se declara el tipo.
     */

    public double resultado;
    private int resultado2;
    private int numero;
    private String signo;
    
    public Calculadora59659() {
        
    }
    
    /**
     * Método para valor y resultado.
     */
    
    public void value(int resultado) {
        
        this.resultado = resultado;
        
    }
    
    /**
     * Método para la suma.
     */
    
    public void suma(int ...numero) {
        
        this.signo = "+";
        
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado += this.numero;
            
        }
    }
    
    /**
     * Método para la resta.
     */
    
    public void resta(int ...numero) {
        
        this.signo = "-";
        
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado -= this.numero;
            
        }
    }
    
    /**
     * Método para la multiplicación.
     */
    
    public void multiplicacion(int ...numero) {
        
        this.signo = "*";
        
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado *= this.numero;
            
        }
    }
    
    /**
     * Método para la división.
     */
    
    public void division(int ...numero) {
        
        this.signo = "/";
        
        for (int i = 0; i < numero.length; i++) {
            if(numero[i] == 0) {
                resultado = 0;
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.", "¡Error!", 0);
                break;
            } else {
                this.numero = numero[i];
                resultado /= this.numero;
                
            }
        }
    }
    
    /**
     * Método para el atributo especial de eliminar la operación anterior.
     */
    
    public void delete() {
        
        if(this.signo.equalsIgnoreCase("+")) {
            this.resultado -= this.numero;
        } else if(this.signo.equalsIgnoreCase("-")) {
            this.resultado += this.numero;
        } else if(this.signo.equalsIgnoreCase("*")) {
            this.resultado /= this.numero;
        } else if(this.signo.equalsIgnoreCase("/")) {
            this.resultado *= this.numero;
        }
    }
    
    /**
     * Método para el atributo especial de obtener la última respuesta.
     */
    
    public void answer() {
        
        resultado2 = (int)resultado;
        
        if(resultado % resultado2 == 0) {
            System.out.println("El resultado es = " + resultado2);
        } else{
            System.out.println("El resultado es = " + resultado);
            
        } 
    }
}
