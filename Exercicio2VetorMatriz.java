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
            
            System.out.println("\nN�mero par: " + numero);

        }else{
            qtdImpares++;
            System.out.println("\nN�mero �mpar: " + numero);
        }

    }

    System.out.println("\nSoma dos n�meros pares: " + somaPar);

    System.out.println("\nQuantidade de �mpares digitados: " + qtdImpares);      
	
	}
}
	

