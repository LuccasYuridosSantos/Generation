programa
{
	real porDis = 0.28, PorImp = 0.45
	funcao inicio()
	{
		real custoFabri, custoComsu 
		escreva("Custo de fábrica de um carro:$ ")
		leia(custoFabri)
	
		custoComsu = custoFabri + (custoFabri*porDis)+(custoFabri*PorImp)

		escreva("custo ao consumidor é:$ ", custoComsu)	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */