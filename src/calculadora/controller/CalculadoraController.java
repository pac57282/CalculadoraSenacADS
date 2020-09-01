/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.controller;

/**
 *
 * @author HP
 */
public class CalculadoraController {

    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;

    public double somar(double valor1, double valor2) {
        resultado = valor1 + valor2;
        return resultado;
    }

    public double subtrair(double valor1, double valor2) {
        resultado = valor1 - valor2;
        return resultado;
    }

    public double multiplicar(double valor1, double valor2) {
        resultado = valor1 * valor2;
        return resultado;
    }

    public double dividir(double valor1, double valor2) {
        resultado = valor1 / valor2;
        return resultado;
    }
}
