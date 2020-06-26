
package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//exercicio1
		int idade = 20;
		int dia = 06;
		int mes = 11;
		int ano = 1997;

		System.out.println("Minha idade é: " + idade);
		System.out.println("Minha data de nascimento é: " + dia + "/" + mes + "/" + ano);

		//exercicio2
		int numero1 = 8;
		int numero2 = 9;
		double numero3 = 6.5;
		double resultado = numero1 + numero2 - numero3;

		System.out.println("resultado: " + resultado);

		//exercicio3
		String nome = "Hodine";
		String sobrenome = "Machunes";

		System.out.println("A fusão do seu nome e da sua colega é: " + nome + " " + sobrenome);
		//EXERCICIO3

		int a = 10;
		int b = 20;
//		String c = "verdadeiro";
		boolean c;


		if (a > b) {
//			System.out.println("a regra foi obedecida" + c );
			c = true;

		} else {
//			System.out.println("não é maior");
			c = false;

			System.out.println("A regra eh: " + c);
		}

		//exercicio desafio1
		Scanner console = new Scanner(System.in);
		System.out.println("digite sua mensagem: ");
		String palavra = console.nextLine();
		//invertaPalavra(palavra);
		lerRetangulo();

	}

	public static void invertaPalavra(String texto) {
		System.out.println("\t");
		StringBuilder invertido = new StringBuilder(texto).reverse();
		System.out.println("sua palavra foi invertida para: " + invertido);

	}

	public static void lerRetangulo() {
		Scanner retangulo = new Scanner(System.in);
		System.out.println("digite altura: ");
		int altura = retangulo.nextInt();
		System.out.println("digite a base: ");
		int base = retangulo.nextInt();
		int calcularArea = base * altura;

		System.out.printf("A medida de seu Retângulo é: "+calcularArea);



	}





}
