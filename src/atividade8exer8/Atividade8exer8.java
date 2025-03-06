/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade8exer8;

import java.util.Scanner;

/**
 *
 * @author 7
 */
public class Atividade8exer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();
    System.out.println("Informe o nome:");
    funcionario.setNome(ler.next());
    System.out.println("Digite o salário:");
    funcionario.setSalario(ler.nextDouble());
    System.out.println("Digite o percentual");
    double percentualReajuste = ler.nextDouble();
    funcionario.reajustarSalario(percentualReajuste);
    funcionario.exibirInformacoes();
   
    }
    
}
