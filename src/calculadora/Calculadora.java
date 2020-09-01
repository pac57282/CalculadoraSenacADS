/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.controller.CalculadoraController;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo.nascimento
 */
public class Calculadora {

    static int opcao = 0;
    static double valor1 = 0;
    static double valor2 = 0;
    static double resultado = 0;
    static boolean finaliza = false;
    static int finalizador = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CalculadoraController controller = new CalculadoraController();

        JOptionPane.showMessageDialog(null, "Bem vindo ao nosso sistema de Calculadora?");
        while (finaliza == false) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão"));
            if (opcao >= 1 && opcao <= 4) {
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));

                if (opcao == 1) {
                    JOptionPane.showMessageDialog(null, "O resultado é " + controller.somar(valor1, valor2));
                }
                if (opcao == 2) {
                    JOptionPane.showMessageDialog(null, "O resultado é " + controller.subtrair(valor1, valor2));
                }
                if (opcao == 3) {
                    JOptionPane.showMessageDialog(null, "O resultado é " + controller.multiplicar(valor1, valor2));
                }
                if (opcao == 4) {
                    JOptionPane.showMessageDialog(null, "O resultado é " + controller.dividir(valor1, valor2));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
            }
            finalizador = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja finalizar?\n1 - Sim\n2 - Não"));
            if (finalizador > 0 && finalizador < 2) {
                JOptionPane.showMessageDialog(null, "Obrigado por usar o nosso programa!");
                finaliza = true;
            }
        }
    }
}
