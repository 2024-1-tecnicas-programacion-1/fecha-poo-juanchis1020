package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { //Complejidad temporal: O(1) Tiempo constante.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha:");
        System.out.println("Día: ");
        int dia = sc.nextInt();
        System.out.println("Mes: ");
        int mes = sc.nextInt();
        System.out.println("Año: ");
        int annio = sc.nextInt();
        Fecha Fecha1 = new Fecha(dia, mes, annio);
        if (Fecha1.validarFecha()==true){
            System.out.println("La fecha es válida:");
        }
        else{
            System.out.println("La fecha es inválida.");
        }
        if (Fecha1.validarFecha()==true){
            System.out.println(Fecha1.fechaLarga());
        }
        
    }
}