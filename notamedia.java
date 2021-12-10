package Projet;

	import java.util.Scanner;

	public class notamedia {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			float n1,n2,n3,media;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3) / 3;
			System.out.printf("\nMédia do alune: %2.2f e a sua terceira nota foi: %f",media,n3);
			System.out.println("\nNota 1: "+n1+" e a nota 2: "+n2);
			
			if(media>=7 && media<=10)
			{
				System.out.println("\nAlune Aprovade...");
			}
			else if(media>=5 && media<7)
			{
				System.out.println("\nAlune de Exame...");
			}
			else
			{
				System.out.println("\nAlune Reprovade...");
			}
	}

}
