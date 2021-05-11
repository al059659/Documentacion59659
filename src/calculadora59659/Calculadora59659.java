package calculadora59659;

 // @author reyapazc

import javax.swing.JOptionPane;

public class Calculadora59659 {

    public double resultado;
    private int resultado2;
    private int numero;
    private String signo;
    
    public Calculadora59659() {
        
    }
    
    public void value(int resultado) {
        
        this.resultado = resultado;
        
    }
    
    public void suma(int ...numero) {
        
        this.signo = "+";
        
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado += this.numero;
            
        }
    }
    
    public void resta(int ...numero) {
        
        this.signo = "-";
        
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado -= this.numero;
            
        }
    }
    
    public void multiplicacion(int ...numero) {
        
        this.signo = "*";
        
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado *= this.numero;
            
        }
    }
    
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
    
    public void answer() {
        
        resultado2 = (int)resultado;
        
        if(resultado % resultado2 == 0) {
            System.out.println("El resultado es = " + resultado2);
        } else{
            System.out.println("El resultado es = " + resultado);
            
        } 
    }
}
