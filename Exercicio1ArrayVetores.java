package Array;

import java.util.Scanner;

public class Exercicio1ArrayVetores {

	public static void main(String[] args) {
		
		
		float numeros[] = new float[6];
		int x;
		
		numeros[0] = 1;
		numeros[1] = 0;
		numeros[2] = 5;
		numeros[3] = -2;
		numeros[4] = -5;
		numeros[5] = 7;
		
		x = (int) (numeros[0] + numeros[1] + numeros[5]);		
		
		System.out.printf("\nA soma dos tres numeros da posicao 0, 1 e 5 é: " + x);
		
		numeros[4] = 100;
				
		for (x=0;x<6;x++)
		{	
		System.out.println("\nO valor da posicao " + x + " é : " + numeros[x]);						
		};
		
	}

}
