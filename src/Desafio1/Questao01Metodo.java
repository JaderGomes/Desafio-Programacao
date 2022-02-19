package Desafio1;
import java.util.Scanner;

/*
 * Classe referente a questao 1 do desafio de programacao
 */

public class Questao01Metodo {
	int colunas;
	int linhas;
	int n;
	
	/*
	 * Metodo utilizado para ler o valor de n
	 */
	
	public int lerNumero() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	/*
	 * Metodo que imprime a escada de asterisco 
	 * de acordo com o valor de n 
	 */
	
	public static String imprimeEscada(int n) {
		int linhas = n;
		int colunas = n;
		String escada = "";
				
		for (int i = 1 ; i <= linhas ; i++) {
			 for (int j = i; j < colunas; j++){
				 escada += " ";
			 }
			 for (int j = 0; j < i ; j++){
				 escada += "*";
			  }
			 escada += "\n";
		}
		return escada;
	}
}
