package Desafio1;
import junit.framework.TestCase;

public class Questao01Test extends TestCase{
	
	/*
	 * Testa o metodo imprimeEscada(n)
	 * como valor de n=4
	 */
	
	public void testImprimeEscada() {
		
		int n = 4;
		String retornoEsperado ="   *\n"+
								"  **\n"+
								" ***\n"+
								"****\n";
	
	assertEquals(retornoEsperado, Questao01Metodo.imprimeEscada(n));
		
	}
	
	/*
	 * Testa o metodo imprimeEscada(n)
	 * como valor de n=5
	 */
	
	public void testImprimeEscada1() {
		
		int n = 5;
		String retornoEsperado ="    *\n"+
								"   **\n"+
								"  ***\n"+
								" ****\n"+
								"*****\n";
	
		assertEquals(retornoEsperado, Questao01Metodo.imprimeEscada(n));
		
	}
	
	/*
	 * Testa o metodo imprimeEscada(n)
	 * como valor de n=6
	 */
	
	public void testImprimeEscada2() {
		
		int n = 6;
		String retornoEsperado ="     *\n"+
								"    **\n"+
								"   ***\n"+
								"  ****\n"+
								" *****\n"+
								"******\n";
	
		assertEquals(retornoEsperado, Questao01Metodo.imprimeEscada(n));
		
	}
}