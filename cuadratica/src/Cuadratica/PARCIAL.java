/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadratica;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author JCERNA10
 */
public class PARCIAL{

    int a = 0;
    int b = 0;
    int c = 0;

    public PARCIAL() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c: "));
        double determinante=Math.pow(b,2)-(4*a*c);
        if(determinante>0)
        {
            double x1 =((b*(-1)) + Math.sqrt(determinante))/(2*a);
            double x2 = ((b*(-1)) - Math.sqrt(determinante))/(2*a);
            System.out.println("El valor de x1 = "+x1+" y el valor de x2= "+x2);
        }
        else
            System.out.println("El determinante es Negativo, no se puede completar la operacion");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        new Cuadratica();
    }
}
// para ejemplo: a = 5, b = -6, c = -1
// x1 = 1.34, x2 = 0.14


   