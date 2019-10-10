
package POOEstrucutura;

import javax.swing.JOptionPane;

public class Operaciones {
    private int numero1;
    private int numero2;
    private double resultado;
    
    
    public void setNumero1(int num1){
        this.numero1 = num1;
    }
    
    public int getNumero1(){
        return this.numero1;
    }
    
    public void setNumero2(int num2){
        this.numero2 = num2;
    }
    
    public int getNumero2(){
        return this.numero2;
    }
    
    public void setResultado(double result){
        this.resultado = result;
    }
    
    public double getResultado(){
        return this.resultado;
    }
    
    public int sumar(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return this.getNumero1() + this.getNumero2(); 
    }
    
    public int restar(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return this.getNumero1() - this.getNumero2(); 
    }
    
    public int multiplicar(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return this.getNumero1() * this.getNumero2(); 
    }
    
    public double division(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return (double) this.getNumero1()/this.getNumero2(); 
    }
}
