package binario;

import java.util.Scanner;

public class DecimalTransformando {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o numero decimal: ");
			double numeroDecimal = scanner.nextDouble();
			
			int parteInt = (int) numeroDecimal;
			double parteFracional = numeroDecimal - parteInt;
			
			String parteBinaria = Integer.toBinaryString(parteInt);
			StringBuilder parteFracaoBinaria = new StringBuilder();
			
			for(int i = 0; i < 10; i++) {
				parteFracional *= 2;
				int bit = (int) parteFracional;
				parteFracaoBinaria.append(bit);
				parteFracional -= bit;
			}
			
			System.out.println("Parte interia em binario: " + parteBinaria);
			System.out.println("Parte fracionaria em binario: " + parteFracaoBinaria);	
	}

}
