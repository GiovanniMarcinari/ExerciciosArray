package Array;

import java.util.Scanner;

public class Exercicio3ArrayMatriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub

		int matriz[][] = new int [3][3];
		int contagem = 0;

		for(int linha=0; linha<3; linha++){
	
			for(int coluna=0; coluna<3; coluna++){
	
				System.out.printf("\n%dª linha, %dª coluna =\n ", linha+1, coluna+1);
		
			    matriz[linha][coluna] = ler.nextInt();
			}
		}

		for(int linha=0; linha<3; linha++)

		for(int coluna=0; coluna<3; coluna++)

		if(matriz[linha][coluna] > 10)contagem++;

		System.out.printf("\n\nna matriz há %d números maiores que 10", contagem);

	}

}
