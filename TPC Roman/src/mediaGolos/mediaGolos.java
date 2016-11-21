package mediaGolos;

public class mediaGolos extends Main {
			public mediaGolos() {
				String [] equipas = new String[4];
				int [] golos = new int [4];
				
				equipas[0] = "Panda";
				equipas[1] = "Caricas";
				equipas[2] = "Bob";
				equipas[3] = "Pocoyo";

				for(int i = 0; i<4; i++) {
					for(int k = i + 1; k<4; k++) {
						c.writeLine("Qual o resultado do jogo " + equipas[i] + " vs. " + equipas[k] + "?");
						golos[i] += c.readN();
						golos[k] += c.readN();
					}
				}
				
				for(int i = 0; i<4; i++) {
					golos[i] = golos[i]/3;
					c.writeLine("A media dos golos da equipa " + equipas[i] + " e de " + golos[i] + " golos ");
				}
			}
			
}