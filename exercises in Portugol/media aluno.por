programa
{
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media
		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)

		media = (nota1+nota2+nota3) / 3
		escreva("\nSua media foi de: ",media) 

		se(media>=7.0 e media<=10.0) 
		{
			escreva("\nAlune Aprovade!!!")
			}
               senao se(media>=5.0 e media<7.0)
               {
               	escreva("\nAlune de Exame")		
               }
               senao se(media>=0.0 e media<5.0)
               {
               	escreva("/nAlune reprovade") 
               }
		     senao
		     {
		     	escreva("\nMedia fora do intervalo") 
		     }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */