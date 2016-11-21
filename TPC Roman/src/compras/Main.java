package compras;

import tools.easyIO;

public class Main {

	static easyIO c = new easyIO();
	
	public static void main(String[] args) {
		
		Compras compras = new Compras();
		
		String nome;
		double preco;
		
		for(int i = 0; i<3; i++) {
			c.writeLine("Introduza o nome do artigo");
			nome = c.readS();
			c.writeLine("Introduza o preço do artigo");
			preco = c.readD();
			
			compras.artigos [i] = new Artigo(preco, nome);
			
		}
		
		c.writeLine("\nOs seus gastos foram:");
		for(int i = 0; i<3; i++) {
			c.writeLine("-" + compras.artigos[i].nome + ": " + compras.artigos [i].preco); 
		}
		c.writeLine("\nA soma e: " + compras.calcularGastos());
		
		compras.artigos[0] = new Artigo(5.1,"banana");
		Artigo chocolate = new Artigo(5.1,"chocolate");
	}

}
