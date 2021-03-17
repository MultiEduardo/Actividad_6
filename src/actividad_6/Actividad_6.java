/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_6;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Actividad_6 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        int NumMaterias = 5, i;
        double [] Materias =  new double[NumMaterias];
        char [] Letra = new char[6];
        Letra[0] = 'A';
        Letra[1] = 'B';
        Letra[2] = 'C';
        Letra[3] = 'D';
        Letra[4] = 'E';
        Letra[5] = 'F';
        double suma = 0;
        
        //Escanea el nombre 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del Alumno: ");
        Nombre = sc.next(); //Guarda el nombre del alumno 
        
        //Guarda las calificaciones 
         for (i = 0; i < Materias.length; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            Materias[i] = sc.nextInt();
        }
         //saca el promedio 
           for (i = 0; i < Materias.length; i++) {
            suma = suma + Materias[i]/5;
        }
           //Muestra el promedio 
             System.out.println("Promedio: " + suma);
             
         //Saca la calificacion y lo muestra     
        if(suma <=50){
            System.out.println("Calificacion: " + Letra[5]);
        }
        
        if(suma >=51 && suma <=60){
             System.out.println("Calificacion: " + Letra[4]);
        }
        
        if(suma >=61 && suma <=70){
             System.out.println("Calificacion: " + Letra[3]);
        }
        
        if(suma >=71 && suma <=80){
             System.out.println("Calificacion: " + Letra[2]);
        }
        
        if(suma >=81 && suma <=90){
             System.out.println("Calificacion: " + Letra[1]);
        }
        
        if(suma >=91 && suma <=100){
             System.out.println("Calificacion: " + Letra[0]);
        }
    }
}
