programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real a, b, c, d, e1, f, x, y

		escreva("Digite o valor coefiente A: ")
		leia(a)
		escreva("Digite o valor coefiente B: ")
		leia(b)
		escreva("Digite o valor coefiente C: ")
		leia(c)
		escreva("Digite o valor coefiente D: ")
		leia(d)
		escreva("Digite o valor coefiente E: ")
		leia(e1)
		escreva("Digite o valor coefiente F: ")
		leia(f)

		x = ((c*e1)-(b*f))/((a*e1)-(b*d))
		y =((a*f)-(c*d))/((a*e1)-(b*d))

		escreva("\nO valor de X é: ",mat.arredondar(x, 2))
		escreva("\nO valor de Y é: ",mat.arredondar(y, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */