/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadratica;

import javax.swing.JOptionPane;

/**
 *
 * @author JCERNA10
 */
public class Cuadratica {

    int a = 0;
    int b = 0;
    int c = 0;

    public static void main(String[] args) {
        Cuadratica cuadratica = new Cuadratica();
    }

    public Cuadratica() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese C: "));
        double determinante = Math.pow(b, 2) - (4 * a * c);
        if (determinante > 0) {
            double x1 = ((b * (-1)) + Math.sqrt(determinante)) / (2 * a);
            double x2 = ((b * (-1)) - Math.sqrt(determinante)) / (2 * a);
            System.out.println("El valor de x1 = " + x1 + " y el valor de x2= " + x2);
        } else {
            System.out.println("El determinante es Negativo,no se podra realizar la operacion");
        }
    }
}
