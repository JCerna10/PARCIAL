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
        Persona persona1 = new Persona();
        Empleado empleado = new Empleado();
        persona1.inicializar();
        persona1.imprimir();
        empleado.ingresarSueldo();
        empleado.ingresarHoras();
        
    }
}
