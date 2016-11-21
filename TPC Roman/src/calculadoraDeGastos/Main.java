package calculadoraDeGastos;

import tools.easyIO;

public class Main {
	static easyIO c = new easyIO();
	public static void main(String[] args) {
		
		calculadora despesas = new calculadora();
		c.writeLine("A sua media de despesas anual é de " + despesas.calcularMediaAnual() + " €");
	}
}