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

    public void ingresarsueldoyhora() {
        horas = 0;
        sueldo = 0;
        float horasExtras;
        float SalarioNeto = 0;
        double ISSS = 0.0525;
        double AFP = 0.0688;
        double Renta = 0.10;
        //  int i = 0;
        // int max = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese horas trabajadas:");
        horas = teclado.nextInt();
        //  while (i < horas) {
        //  System.out.print("Ingrese horas: " + (i + 1));
        //   horas = teclado.nextInt();
        //   if (horas > max) {
        //   max = horas;
        if (horas <= 160) {

            // El sueldo que gana de las primeras 160 horas
            horasExtras = (sueldo + (float) (9.75 * horas));
            horas = (int) (SalarioNeto + horasExtras);
            SalarioNeto = (float) (horas - (horas * ISSS) - (horas * AFP) - (horas * Renta));
            ISSS = horas * ISSS;
            AFP = horas * AFP;
            Renta = horas * Renta;
            System.out.println("tu salario es: " + (horas));
            System.out.println("La deduccion de AFP es: " + (ISSS));
            System.out.println("La deduccion de ISSS es: " + (AFP));
            System.out.println("La deduccion de renta es: " + (Renta));
            System.out.println("Salario Liquido a pagar: " + (SalarioNeto));
        } else {
            if (horas > 160) {
                // El sueldo que gana si hace mas de 160 horas
                horasExtras = (horas + (float) (11.50 * horas));
                horas = (int) (SalarioNeto + horasExtras);
                SalarioNeto = (float) (horas - (horas * ISSS) - (horas * AFP) - (horas * Renta));
                ISSS = horas * ISSS;
                AFP = horas * AFP;
                Renta = horas * Renta;
                System.out.println("tu salario es: " + (horas));
                System.out.println("La deduccion de AFP es: " + (ISSS));
                System.out.println("La deduccion de ISSS es: " + (AFP));
                System.out.println("La deduccion de renta es: " + (Renta));
                System.out.println("SalarioNeto: " + (SalarioNeto));
              
            }
        }
      
    }
}


/* public String calcularHoras() {
        horas = 0;
        float HorasTrabajadas;
        // float sueldoExtra;
        // float horasExtra;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE HORAS:");
        horas = teclado.nextInt();
        if (horas <= 160) {
            HorasTrabajadas = (float) (horas * 9.75);
            System.out.println("Tus salario es: " + HorasTrabajadas);
        }
        if (horas > 160) {
            HorasTrabajadas = (float) (horas * 11.50);
            // horas = (float) (horasExtra * 11.50);
            // horasExtra = horas += sueldoExtra;
            System.out.println("Tus salario es: " + HorasTrabajadas);
        }
        return null;
 }
}*/
