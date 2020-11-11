programa
{
	/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */
	funcao inicio()
	{
		inteiro segTotais , horas, minutos, segundos


		escreva("Informe o tempo total em segundo: ")
		leia(segTotais)

		horas = segTotais/3600
		escreva("Horas: ", horas)
		
		minutos = (segTotais%3600)/60
		escreva("\nMinutos: ", minutos)

		segundos =  (segTotais%3600)%60
		escreva("\nSegundos: ",segundos)

		escreva("\n\n")
		escreva( horas," : ",minutos," : ",segundos "\n\n\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */