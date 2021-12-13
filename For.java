package Projet;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		int x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=4;x++)
		{
			System.out.println("\nEntre com a nota1: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a nota2: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a nota3: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMédia: %2.2f",media);
			
			somaMedia += media;
			
		}
		for(x=1;x<=20;x++)
		{
			System.out.println("\n");
		}
		mediaGeral = somaMedia / 4;
		System.out.printf("\nMédia geral: %2.2f",mediaGeral);
	}

}

