/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUELDOLIQUIDO;

import java.util.Scanner;
import SUELDOLIQUIDO.Persona;
import SUELDOLIQUIDO.Menu;

/**
 *
 * @author JCERNA10
 *
 *
 */
public class Empleado {

    private int horas;
    private float sueldo;

    public Empleado() {
    }

    public Empleado(int horas, float sueldo) {
        this.horas = horas;
        this.sueldo = sueldo;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void ingresarHoras() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese horas trabajadas:");
        horas = teclado.nextInt();
    }

    public String calcularHoras() {
        float horasExtra;
        String resultado = null;
        if (horas <= 160) {
            sueldo = (float) (horas * 9.75);
            resultado = "Tu salario es:" + sueldo;
        } else {
            if (horas > 160) {
                horasExtra = (horas - 160);
                sueldo = (float) ((horasExtra) * (11.50));
                resultado = "Tu salario es:";
            } else {
                resultado = "No se puede calcular tu salario";
            }
        }
        return resultado;
    }

    public void ingresarSueldo() {

        sueldo = 0;
        double ISSS = 0.0525;
        double AFP = 0.0688;
        double Renta = 0.1;
        double SalarioNeto = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar salario");
        sueldo = teclado.nextInt();

        if (sueldo >= 500) {
            SalarioNeto = (sueldo - (sueldo * ISSS) - (sueldo * AFP) - (sueldo * Renta));
            ISSS = sueldo * ISSS;
            AFP = sueldo * AFP;
            Renta = sueldo * Renta;
            System.out.println("SalarioNeto: " + (SalarioNeto));
            System.out.println("La deduccion de AFP es: " + (ISSS));
            System.out.println("La deduccion de ISSS es: " + (AFP));
            System.out.println("La deduccion de renta es: " + (Renta));
            System.out.println("La deduccion de renta es: " + (horas));
        } else {
            System.out.println("El Salario no tiene retenciones");
        }

    }
}
