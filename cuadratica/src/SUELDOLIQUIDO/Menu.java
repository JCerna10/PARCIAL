/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUELDOLIQUIDO;

import SUELDOLIQUIDO.Persona;
import SUELDOLIQUIDO.Empleado;
import java.util.Scanner;

/**
 *
 * @author JCERNA10
 */
public class Menu {

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            Persona persona1 = new Persona();
            Empleado empleado = new Empleado();
            persona1.inicializar();
            empleado.ingresarsueldoyhora();
            //empleado.calcularHoras();
            persona1.imprimir();
            i++;
            System.out.println("Ingrese Persona: " + i);

            if (i == 6) {
                break;
            }
        }
    } //Cierre del main
} //Cierre de la clase    
   