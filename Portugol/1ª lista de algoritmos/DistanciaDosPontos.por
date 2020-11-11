programa
{

	inclua biblioteca Matematica --> mat
	funcao inicio()
	{

		real x1, x2, y1,y2
		real d = 0.0

		escreva("Digite 1° valor de X: ")
		leia(x1)
		escreva("Digite 2° valor de X: ")
		leia(x2)
		escreva("Digite 1° valor de Y: ")
		leia(y1)
		escreva("Digite 2° valor de Y: ")
		leia(y2)

		d = mat.potencia((x2-x1), 2.0) +  mat.potencia((y2-y1), 2.0)
		d = mat.raiz(d, 2.0)
		d = mat.arredondar(d, 2)
		escreva("A distancia entre os ponto é: ",d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */