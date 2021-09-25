/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NOTAS;

import java.util.Scanner;

/**
 *
 * @author JCERNA10
 */
public class CURSOS {

    // Atributos , private , public , protec
    private String Alumno;
    private String materia;
    private int grado;
    private double[] notas; // vector    
    private double nota1, nota2, nota3, nota4, nota5;
    private int estado;

    public CURSOS() {
    }

    public CURSOS(String nombre, int grado, String materia, double[] notas, double nota1, double nota2, double nota3, double nota4, double nota5) {
        this.Alumno = nombre;
        this.grado = grado;
        this.materia = materia;
        this.notas = notas;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota2 = nota4;
        this.nota3 = nota5;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
   

    public void ingresarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el Nombre:");
        Alumno = teclado.next();
        System.out.print("Ingrese Materia:");
        materia = teclado.next();
        System.out.print("Ingrese Grado:");
        grado = teclado.nextInt();

    }

    public void imprimir() {
        System.out.println("Nombre:" + Alumno);
        System.out.println("Materia:" + materia);
        System.out.println("grado:" + grado);
        System.out.println("                ");
    }

    public String ingresarNotas() {
        String resultado = null;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese primer nota:");
        nota1 = teclado.nextInt();
        System.out.print("Ingrese segunda nota:");
        nota2 = teclado.nextInt();
        System.out.print("Ingrese tercer nota:");
        nota3 = teclado.nextInt();
        System.out.print("Ingrese cuarta nota:");
        nota4 = teclado.nextInt();
        System.out.print("Ingrese quinta nota:");
        nota5 = teclado.nextInt();

        double actividad1 = nota1 * 0.15;
        double actividad2 = nota2 * 0.10;
        double actividad3 = nota3 * 0.20;
        double actividad4 = nota4 * 0.30;
        double actividad5 = nota5 * 0.25;
        
        double notafinal = (actividad1 + actividad2 + actividad3 + actividad4 + actividad5);
        if (notafinal >= 7) {

            System.out.println("EL ALUMNO APROBO LA MATERIA CON LA NOTA DE:" + notafinal);

        } else if (notafinal >= 6.50 && notafinal <= 6.99) {
            System.out.println("EL ALUMNO POSIBILIDAD DE REALIZAR EL EXAMEN DE SUFICIENCIA:" + notafinal);
        } else if (notafinal <= 6.49) {
            System.out.println("EL ALUMNO REPROBO LA MATERIA CON LA NOTA DE:" + notafinal);
        }
        
        return null;
    }
}
