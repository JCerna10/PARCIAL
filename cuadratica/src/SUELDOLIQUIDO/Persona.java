/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUELDOLIQUIDO;

import java.util.Scanner;
import SUELDOLIQUIDO.Empleado;

/**
 *
 * @author JCERNA10
 */
public class Persona {

    // Atributos , private , public , protec
    private String nombre;
    private String apellido;
    private String cargodeEmpleado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cargodeEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargodeEmpleado = cargodeEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargodeEmpleado() {
        return cargodeEmpleado;
    }

    public void setCargodeEmpleado(String cargodeEmpleado) {
        this.cargodeEmpleado = cargodeEmpleado;
    }

    public void inicializar() {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre = teclado.next();
        System.out.print("Ingrese apellido:");
        apellido = teclado.next();
        System.out.print("Ingrese cardo de empleado:");
        cargodeEmpleado = teclado.next();
    }

    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Caro de Empleado:" + cargodeEmpleado);
    }
}
