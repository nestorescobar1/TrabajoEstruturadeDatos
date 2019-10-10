
package estrucutradedatos;

import javax.swing.JOptionPane;

public class EstrucutraDeDatos {

    public static void main(String[] args) {
       String nombreApellido = "nestor bran escobar ";
       int codigo=901822050;
       int opc;
       int opc1;
       int b=1;
       
       while (b==1){ 
       int c=1;
       int numero1 = 0;
       int numero2 = 0;
           
       try{
           opc = Integer.parseInt(JOptionPane.showInputDialog( "PARCIAL ESTRUCTURA DE DATOS\n"+
                                                                    "1.) Nombres y Apellidos\n"+
                                                                    "2.) Código\n"+
                                                                    "3.) Operaciones Básicas\n"+
                                                                    "4.) Salir\n"));
       switch(opc){
           
           case 1:
                JOptionPane.showMessageDialog(null,nombreApellido);
                break;
           case 2:
                JOptionPane.showMessageDialog(null,codigo);
                break;
           case 3:
               while(c==1){
                   try{
                    opc1 = Integer.parseInt(JOptionPane.showInputDialog( "OPERACIONES BASICAS\n"+
                                                                    "1.) Ingresar Valores\n"+
                                                                    "2.) Sumar\n"+
                                                                    "3.) Restar\n"+
                                                                    "4.) Multiplicar\n"+
                                                                    "5.) División\n"+
                                                                    "6.) Volver Al Menu Anterior"));
           
       
                         switch(opc1){
           
                           case 1:
                                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                                break;
                           case 2:
                                JOptionPane.showMessageDialog(null,numero1+numero2);
                                break;
                           case 3:
                                JOptionPane.showMessageDialog(null,numero1-numero2);
                                break;
                           case 4:
                               JOptionPane.showMessageDialog(null,numero1*numero2);
                                break;
                           case 5:
                               if(numero2==0){
                               JOptionPane.showMessageDialog(null,"Digite como numero 2 un numero diferente de 0");
                               } 
                               else {
                                   JOptionPane.showMessageDialog(null,numero1/numero2);
                               }
                               break;
                           case 6:
                               c=0;
                               JOptionPane.showMessageDialog(null,"Volviendo al menu anterior");
                               break;
                           default:
                               JOptionPane.showMessageDialog(null,"Opcion no valida, digite una numero del 1 al 6");
                               break;    
                        }
                }
                catch (Exception ex1){
                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
                }
               }
               break;
           case 4:
               b=0;
               JOptionPane.showMessageDialog(null,"Saliendo");
               break;
           default:
               JOptionPane.showMessageDialog(null,"Opcion no valida, digite una numero del 1 al 4");
               break;               
        }  
       }
       catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
            }  
}
}
}