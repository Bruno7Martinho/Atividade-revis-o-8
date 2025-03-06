/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade8exer8;

/**
 *
 * @author 7
 */
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

     public double calcularSalarioAnual() {
        return salario * 12;
    }
    public void exibirInformacoes() {
        System.out.println("\nInformações do Funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Atual: R$" + salario);
        System.out.println("Salário Anual: R$"+calcularSalarioAnual());
    }

   
   
}
