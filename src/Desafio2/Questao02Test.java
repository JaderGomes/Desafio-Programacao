package Desafio2;

import junit.framework.TestCase;

public class Questao02Test extends TestCase{
	
	public void testValidaSenha() {
		String senha = "Ya3";
		int retornoEsperado = 3;
		
		assertEquals(retornoEsperado,Questao02Metodo.validaSenha(senha));
		
	}
	
	public void testValidaSenha1() {
		String senha = "Ya3Ya3";
		int retornoEsperado = 0;
		
		assertEquals(retornoEsperado,Questao02Metodo.validaSenha(senha));
		
	}
	
	public void testValidaSenha2() {
		String senha = "Ya3Ya33";
		int retornoEsperado = 0;
		
		assertEquals(retornoEsperado,Questao02Metodo.validaSenha(senha));
		
	}
	
}
