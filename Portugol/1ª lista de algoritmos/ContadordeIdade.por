programa
{

  	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */
	
	funcao inicio()
	{
		inteiro diasTotais, anos, meses, dias
		
		escreva("Digite sua idade com total de dias: ")
		leia(diasTotais)

		anos = (diasTotais/365)

		escreva("Anos: ", anos)

		meses = (diasTotais%365)/30
		escreva("\nMeses: ", meses)

		dias = diasTotais-((365*anos)+(meses*30))
		escreva("\nDias ", dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */