package compras;

public class Compras {
	protected Artigo [] artigos = new Artigo[3];
	
	public Artigo alterarArtigo(Artigo artigo) {
		return artigo;
	}
	
	protected double calcularGastos() {
		double soma = 0;
		for(int i = 0; i<3; i++) {
			soma +=  artigos[i].preco;
		}
		return soma;
	}
	
	public Compras() {}
	
	
}
