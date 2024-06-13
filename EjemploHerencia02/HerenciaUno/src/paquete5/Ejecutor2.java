/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial,
        // con datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        ArrayList<EstudiantePresencial> estPresen = new ArrayList<>();
        String compare;

        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();

            System.out.println("Ingrese 1 si es estudiante presencial");

            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextInt();

            EstudiantePresencial estPre = new EstudiantePresencial(n, ap, ced,
                    edad, creditos, costo);
            estPre.calcularMatriculaPresencial();
            estPresen.add(estPre);
            System.out.println("escrina [si] si desea agregar nuevo estudiante");
            entrada.nextLine();
            compare = entrada.nextLine();
            
            if(compare.equals("si")){
                bandera = false;
            }
  
        }
        System.out.println("Lista de estudiantes presencial ");
        for (int i =0; i< estPresen.size(); i++){
            System.out.printf("(%d) %s\n", (i+1), estPresen.get(i));
        }

    }
}
