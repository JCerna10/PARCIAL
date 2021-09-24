/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NOTAS;

/**
 *
 * @author JCERNA10
 */
public class menu {
     public static void main(String[] args) {
        int i = 1;
        while (true) {
           ///menu
       CURSOS estudiante = new CURSOS();
       String resultado;
     //  estudiante.ingresarDatos();
       estudiante.ingresarNotas();
       estudiante.imprimir();
       
            i++;
            System.out.println("Alumno :" + i);

            if (i == 6) {
                break;
            }
        }
    } //Cierre del main
} //Cierre de la clase    

