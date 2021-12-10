package Projet;

import java.util.Scanner;

public class Coeficiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\t\tFaça o dia de alguém FELIZ");
		System.out.println("\n1- Bom dia...Ensolarado");
		System.out.println("\n2- Um frappuccino de brigadeiro...");
		System.out.println("\n3- 10.000 reais na sua conta...");
		System.out.println("\n4- 1 litro de açaí e um doce cupuaçu");
		System.out.println("\nEscolha a sua opção: ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("\nBom dia...Ensolarado");
			break;
		case 2:
			System.out.println("\nUm frappuccino de brigadeiro...");
			break;
		case 3:
			System.out.println("\n10.000 reais na sua conta...");
			break;
		case 4:
			System.out.println("\n1 litro de açaí e um doce cupuaçu");
			break;
		default:
			System.out.println("\nOpção inválida!!!");
		}
	}

}
