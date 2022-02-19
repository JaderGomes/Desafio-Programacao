package Desafio2;
import java.util.Scanner;
public class Questao02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String senha = sc.next();
		if(senha.length() < 6) {
			int x = 6 - senha.length();
			System.out.println(x);
			
		}
		
	}

}
