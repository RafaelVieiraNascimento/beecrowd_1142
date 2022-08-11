package program;

/*
beecrowd | 1142
PUM

Escreva um programa que leia um valor inteiro N.
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int numeros = 1;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.print(numeros + " ");
				numeros++;
			}
			numeros++;
			System.out.println("PUM");
		}
		sc.close();
	}
}
