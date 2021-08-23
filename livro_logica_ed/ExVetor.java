package br.com.cap06;

/*
 * ler os numeros digitados pelo usu�rio e mostrar a m�dia
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExVetor {

	public static void main(String[] args) {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			float soma = 0;
			float [] vetor = new float [3];
			
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Digite o valor: ");
				vetor[i] = Float.parseFloat(ler.readLine());
				soma += vetor[i];
			}
			
			float media = soma / vetor.length;
			System.out.println("A m�dia � = " +media);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}
	}
}
