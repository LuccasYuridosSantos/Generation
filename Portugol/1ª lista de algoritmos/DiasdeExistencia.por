programa
{
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

	funcao inicio()
	{

		inteiro diaNasc=0, mesNasc=0, anoNasc=0, dia=0, mes=0, ano=0, diasTotais = 0
	
		escreva("Informe a sua data de nascimento ")
		escreva("\nDigite a dia de nascimento: ")
		leia(diaNasc)
		escreva("\nDigite o mes de nascimento: ")
		leia(mesNasc)
		escreva("\nDigite o ano de nascimento: ")
		leia(anoNasc)


		escreva("\nInforme a data atual ")
		escreva("\nDigite a dia atua: ")
		leia(dia)
		escreva("\nDigite o mes atual: ")
		leia(mes)
		escreva("\nDigite o ano atual: ")
		leia(ano)

		diasTotais +=  (ano-anoNasc)*365)
		diasTotais += ((mes-mesNasc)*30) 
		diasTotais += (dia-diaNasc)
		
		escreva("\n\nO total de dias e: ", diasTotais)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 714; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */