package calculadoraDeGastos;

public class calculadora extends Main {
	
	public int agua, luz, gas, telecomunicacoes;
	
	public calculadora() {
		c.writeLine("Quanto pagou de água?");
		agua = c.readN();
		c.writeLine("Quanto pagou de luz?");
		luz = c.readN();
		c.writeLine("Quanto pagou de gas?");
		gas = c.readN();
		c.writeLine("Quanto pagou de telecomunicacoes?");
		telecomunicacoes = c.readN();
				
	}
	
	public int calcularMediaAnual() {
		return (agua+luz+gas+telecomunicacoes)*12;
	}
	
}