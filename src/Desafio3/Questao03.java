package Desafio3;

import java.util.Scanner;

/*
 * Nessa classe o programa recebe uma palavra
 * e a coloca em uma lista de caracteres para
 * entao percorrer esta lista buscando todos os
 * anagramas contidos na palavra digitada.
 * O retorno é a quantidade de anagramas encontrados.
 */

public class Questao03 {

	private static int contador[][] = new int[128][110];

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String palavra = sc.next();
		final char letras[] = palavra.toCharArray();
		
		
		contador[letras[0]][1] = 1;
		for (int i = 1; i < letras.length; i++) {
			for (int j = 'a'; j <= 'z'; j++) { 
				contador[j][i + 1] = contador[j][i]; 
			}
			contador[letras[i]][i + 1]++;
			
		}
		
		int quantidadeAnagramas = 0;
		for (int size = 1; size <= letras.length - 1; size++) {
			for (int from = 0; from <= letras.length - size; from++) { 
				for (int to = from + 1; to <= letras.length - size; to++) {
					if (ehAnagrama(from, from + size - 1, to, to + size - 1))
						quantidadeAnagramas++;
				}
			}
		}
		System.out.println(quantidadeAnagramas);
		
	}
	
	private static boolean ehAnagrama(int from1, int to1, int from2, int to2) {
		for (int i = 'a'; i <= 'z'; i++) {
			if (contador[i][to1 + 1] - contador[i][from1] != contador[i][to2 + 1] - contador[i][from2])
				return false;
		}
		return true;
	}
}