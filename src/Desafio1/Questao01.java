package Desafio1;
import java.util.Scanner;
public class Questao01 {
	/*
	 * Essa classe � um main onde o usuario pode
	 * interagir com o programa por meio do console.
	 * Nessa classe o programa recebe um valor n, esse valor ser�
	 * usado para definir a quantidade de colunas e linhas 
	 * que a sa�da do programa deve ter, ser� feito uma escada
	 * de asteriscos a partir dessa informa��o
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
			
		
	
	

