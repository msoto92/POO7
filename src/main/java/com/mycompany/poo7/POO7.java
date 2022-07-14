/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo7;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class POO7 {

    public static void main(String[] args) 
    {
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1");
        
        double a = Double.parseDouble(sc.nextLine());
        
        System.out.println("Ingrese el numero 2");
        
        double b = Double.parseDouble(sc.nextLine());
        
        double suma = calculadora.sumar(a, b);
        System.out.println("El resultado de la suma es: " + suma);
    }
}
