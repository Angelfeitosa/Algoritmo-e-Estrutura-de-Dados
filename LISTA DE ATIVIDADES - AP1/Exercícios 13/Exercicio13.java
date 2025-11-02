package lista_exercicios_grupo_impacta;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa em Java que leia o salário de 
				//um funcionário, calcule e mostre o
				//seu novo salário, com 15% de aumento.
				System.out.println("Olá, tudo bem?\nPor gentileza, insira o valor de seu salário no campo indicado.");
				System.out.println("Salário");
				Scanner valor = new Scanner(System.in);
				Double salario = valor.nextDouble();
				valor.close();
				
				Double salarioComAumento = salario + (salario * 0.15);
				
				System.out.println("Seu salário com aumento de 15%, ficou: R$ " + salarioComAumento + ".");
				
				

	}

}
