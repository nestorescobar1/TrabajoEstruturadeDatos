
package POOEstrucutura;

import javax.swing.JOptionPane;

public class Ejemplo {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 4;
        
        Operaciones obj = new Operaciones ();
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"SELECCIONE UNA OPCION\n"+
                                           "1. SUMA\n"+
                                           "2. RESTA\n"+
                                           "3. MULTIPLICACION\n"+
                                           "4. DIVISION\n"));
        
        switch (opc){
            case 1:
                JOptionPane.showMessageDialog(null, obj.sumar(numero1,numero2));
                break;
            case 2: 
                JOptionPane.showMessageDialog(null, obj.restar(numero1,numero2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, obj.multiplicar(numero1,numero2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, obj.division(numero1,numero2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "opcion no valida");
    }
    }
}
