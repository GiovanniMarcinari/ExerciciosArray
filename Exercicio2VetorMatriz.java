package Array;

import java.util.Scanner;

public class Exercicio2VetorMatriz {

	public static void main(String[] args) {
	
    Scanner scanner = new Scanner(System.in);

    int numero = 0;
    int somaPar = 0;
    int qtdImpares = 0;

    for (int x = 0; x < 6; x++) {

        numero = scanner.nextInt();  

        if (numero % 2 == 0){
            somaPar = somaPar + numero;
            
            System.out.println("\nNúmero par: " + numero);

        }else{
            qtdImpares++;
            System.out.println("\nNúmero ímpar: " + numero);
        }

    }

    System.out.println("\nSoma dos números pares: " + somaPar);

    System.out.println("\nQuantidade de ímpares digitados: " + qtdImpares);      
	
	}
}
	

