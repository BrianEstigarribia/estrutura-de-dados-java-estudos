package br.com.cap07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploMenu {
	public static void main(String[] args) {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("1 : Adi��o");
			System.out.println("2 : Subtra��o");
			System.out.println("3 : Multiplica��o");
			System.out.println("4 : Divis�o");

			System.out.println("Qual a op��o desejada ?");
			int op = Integer.parseInt(ler.readLine());

			switch (op) {
			case 1:
				somar();
				break;
			case 2:
				subtrair();
				break;
			case 3:
				multiplicar();
				break;
			case 4:
				dividir();
				break;

			default:System.out.println("Fim do programa");
			break;
			}

		} catch (Exception e) {
			System.out.println("Ocorreu um erro na leitura");
		}
	}

	 static void dividir() {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Digite o primeiro numero: ");
			float numero1 = Float.parseFloat(ler.readLine());
			System.out.println("Digite o segundo numero: ");
			float numero2 = Float.parseFloat(ler.readLine());
			
			float resultado = numero1 / numero2;
			System.out.println("Divis�o = "+resultado);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na leitura");
		}

	}

	 static void multiplicar() {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Digite o primeiro numero: ");
			float numero1 = Float.parseFloat(ler.readLine());
			System.out.println("Digite o segundo numero: ");
			float numero2 = Float.parseFloat(ler.readLine());
			
			float resultado = numero1 * numero2;
			System.out.println("Multiplica��o = "+resultado);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na leitura");
		}

	}

	 static void subtrair() {
		 BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 System.out.println("Digite o primeiro numero: ");
			 float numero1 = Float.parseFloat(ler.readLine());
			 System.out.println("Digite o segundo numero: ");
			 float numero2 = Float.parseFloat(ler.readLine());

			 float resultado = numero1 - numero2;
			 System.out.println("Subtra��o = "+resultado);
		 } catch (Exception e) {
			 System.out.println("Ocorreu um erro na leitura");
		 }

	}

	 static void somar() {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Digite o primeiro numero: ");
			float numero1 = Float.parseFloat(ler.readLine());
			System.out.println("Digite o segundo numero: ");
			float numero2 = Float.parseFloat(ler.readLine());
			
			float resultado = numero1 + numero2;
			System.out.println("Soma = "+resultado);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na leitura");
		}
	}
}
