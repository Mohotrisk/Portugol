package Projet;
import java.util.Scanner;
	public class DoWhile {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int num,somaNum=0,contNum=0;
			float mediaPosNum;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();//100
			
			do
			{
				if(num == 100)
				{
					System.out.println("\nSaindo do sistema...");
				}
				else
				{
					if(num>=0)
					{
						somaNum +=num; // somaNum = somaNum + num
						contNum++;
					}
					System.out.println("\nEntre com um n�mero: ");
					num = leia.nextInt();
				}
			}while(num !=100);
			if(contNum == 0)
			{
				System.out.println("\nN�o pode dividir por zero...");
			}
			else
			{
			mediaPosNum = somaNum / contNum;
			System.out.printf("\nM�dia dos n�meros positivos foi de: %.2f",mediaPosNum);
			}
		}

	}


	
