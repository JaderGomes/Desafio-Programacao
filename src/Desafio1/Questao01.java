package Desafio1;
import java.util.Scanner;
public class Questao01 {
	/*
	 * Essa classe é um main onde o usuario pode
	 * interagir com o programa por meio do console.
	 * Nessa classe o programa recebe um valor n, esse valor será
	 * usado para definir a quantidade de colunas e linhas 
	 * que a saída do programa deve ter, será feito uma escada
	 * de asteriscos a partir dessa informação
	 */
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
					
			int n = sc.nextInt();
			int linhas = n;
			int colunas = n;
					
			for (int i = 1 ; i <= linhas ; i++) {
				 for (int j = i; j < colunas; j++){
					 System.out.print(" ");
				 }
				 for (int j = 0; j < i ; j++){
				      System.out.print("*");  
				  }
				 System.out.println(""); 
			}
	}

		
}
			
		
	
	

