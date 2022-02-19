package Desafio2;

import java.util.Scanner;

public class Questao02Metodo {

	public String lerSenha() {
		Scanner sc = new Scanner(System.in);
		String senha = sc.next();
		return senha;
	}
	
	public static int validaSenha (String senha){
		int x = 0;
		if(senha.length() < 6) {
			x = 6 - senha.length();
		}
		return x;
		
	}
}


