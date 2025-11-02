package lista_exercicios_grupo_impacta;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa em Java que leia o preço de um produto, 
		//calcule e mostre o seu
		//PREÇO PROMOCIONAL, com 5% de desconto.
		System.out.println("Olá, tudo bem?\nPara ver o valor do produto com o desconto, preencha o campo indicados abaixo:");
		System.out.println("Valor do produto");
		Scanner valor = new Scanner(System.in);
		Double produtoSemDesconto = valor.nextDouble();
		Double produtoComDesconto = produtoSemDesconto - (produtoSemDesconto * 0.05);
		valor.close();
		System.out.println("Valor do produto com desconto");
		System.out.println(produtoComDesconto);

	}

}
