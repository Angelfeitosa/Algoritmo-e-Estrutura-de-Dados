package lista_exercicios_grupo_impacta;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desenvolva um programa em Java 
		//que leia uma distância em metros e mostre os
		//valores relativos em outras medidas.
		//Ex:
		//Digite uma distância em metros: 100
		//Distância de 10000 Cm
		System.out.println("Olá, tudo bem?\nNo campo indicado digite um distância em metros para ver sua conversão em cm.");
		System.out.println("Distância em metros");
		Scanner distancia = new Scanner(System.in);
		Double m = distancia.nextDouble();
		Double cm = m * 100;
		distancia.close();
		System.out.println("Distância correspondente em centímetros");
		System.out.println(cm + " centímetros.");

	}

}
