package Projet;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero,somaPar=0,somaImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt(); //7  10
		
		while(numero != 0)
		{
			if(numero % 2 == 0)
			{
				somaPar += numero;
			}
			else
			{
				somaImpar += numero;
			}
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
		}
		System.out.println("\nSomatório dos pares: "+somaPar);
		System.out.println("\nSomatório dos ímpares: "+somaImpar);
		
	}

}
  

