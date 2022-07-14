/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo7;

/**
 *
 * @author Miguel
 */
public class Calculadora implements Operacion, Constante {

    @Override
    public double sumar(double a, double b) {        
        double resultado = a + b;
        return resultado;
    }

    @Override
    public double restar(double a, double b) {
        double resultado = a - b;
        return resultado;
    }

    @Override
    public double multiplicar(double a, double b) {
        double resultado = a * b;
        return resultado;
    }

    @Override
    public double dividir(double a, double b) {
        double resultado = a/b;
        return resultado;
    }

}
