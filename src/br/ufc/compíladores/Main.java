/**
 * 
 */
package br.ufc.compíladores;

/**
 * @author italo
 *
 */
public class Main<MiniJavaGrammar> {

	/**
	 * @param <MiniJavaGrammar>
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Digite uma expressao aritmetica");
		System.out.print("e um ponto-e-virgula para finalizar: ");
		//MiniJavaGrammar analisador = new MiniJavaGrammar(System.in);
		try {
			//((Main) analisador).main(args);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
